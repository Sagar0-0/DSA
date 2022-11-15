class Solution {
    public int[] sortEvenOdd(int[] nums) {
        List<Integer> even=new ArrayList<>();;
        List<Integer> odd=new ArrayList<>();;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                even.add(nums[i]);
            }else{
                odd.add(nums[i]);
            }
        }
        Collections.sort(even);
        Collections.sort(odd,Collections.reverseOrder());
        int i=0;
        int j=0;
        int index=0;
        while(i<even.size() && j<odd.size()){
            nums[index]=even.get(i);
            index++;
            nums[index]=odd.get(j);
            index++;
            i++;
            j++;
        }
        if(j==odd.size() && i<even.size()){
            nums[index]=even.get(i);
        }
        return nums;
    }
}
