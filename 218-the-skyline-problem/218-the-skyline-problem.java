class Solution {
    class KeyPoint {
        public int key;
        public int height;
        public KeyPoint next = null;

        public KeyPoint(int key, int height) {
            this.key = key;
            this.height = height;
        }
    }

    public List<List<Integer>> getSkyline(int[][] buildings) {
        List<List<Integer>> res = new ArrayList<>();
        KeyPoint dummy = new KeyPoint(-1, 0); // dummy head
        KeyPoint pre = dummy;

        for (int[] bd : buildings) {
            int L = bd[0];
            int R = bd[1];
            int H = bd[2];

            while (pre.next != null && pre.next.key <= L)
                pre = pre.next;

            int preH = pre.height;

            if (pre.key == L)
                pre.height = Math.max(pre.height, H);
            else if (pre.height < H) {
                KeyPoint next = pre.next;
                pre.next = new KeyPoint(L, H);
                pre = pre.next;
                pre.next = next;
            }

            KeyPoint preIter = pre;
            KeyPoint curIter = pre.next;
            while (curIter != null && curIter.key < R) {
                preH = curIter.height;
                curIter.height = Math.max(curIter.height, H);

                if (curIter.height == preIter.height)
                    preIter.next = curIter.next;
                else
                    preIter = curIter;

                curIter = curIter.next;
            }

            if (preIter.height != preH && preIter.key != R && (curIter == null || curIter.key != R)) {
                KeyPoint next = preIter.next;
                preIter.next = new KeyPoint(R, preH);
                preIter.next.next = next;
            }
        }

        KeyPoint first = dummy;
        KeyPoint second = dummy.next;
        while (second != null) {
            if (second.height != first.height)
                res.add(Arrays.asList(second.key, second.height));
            first = first.next;
            second = second.next;
        }
        return res;
    }
}