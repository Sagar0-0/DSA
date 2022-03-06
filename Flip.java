public class Solution {
    public ArrayList<Integer> flip(String A) {
        ArrayList<Integer> al = new ArrayList<>();
        int max = 0;
        int diff = 0;
        int start = 0;
        boolean solFound = false;
        int[] ans = new int[2];
        for(int i = 0; i < A.length(); i++) {
            char c = A.charAt(i);
            diff += (c == '0') ? 1 : -1;
            if(diff < 0) {
                diff = 0;
                start = (c == '0') ? i : i + 1;
            } else {
                if(max < diff) {
                    max = diff;
                    if(al.isEmpty()){
                        al.add(start);
                        al.add(i);
                    } else {
                        al.set(0, start);
                        al.set(1, i);
                    }
                    solFound = true;
                }
            }
        }

        if(!solFound) {
            return new ArrayList<>();
        }
        
        al.set(0, al.get(0)+1);
        al.set(1, al.get(1)+1);
        return al;
    
    }
}
