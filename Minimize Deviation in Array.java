class Solution {
    public int minimumDeviation(int[] nums) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((o1,o2)->o2-o1);
        int min = Integer.MAX_VALUE;
        int diff=min;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]%2==1) {
                nums[i]*=2;
            }
            maxHeap.add(nums[i]);
            min=Math.min(min,nums[i]);
        }
        
        while(!maxHeap.isEmpty()) {
            int max = maxHeap.poll();
            diff=Math.min(diff,max-min);
            if(max%2==1) {
                break;
            }
            maxHeap.add(max/2);
            min=Math.min(min,max/2);
        }
        return diff;
    }
}
