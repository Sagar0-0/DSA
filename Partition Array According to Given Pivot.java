class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> small=new ArrayList<>();
        List<Integer> large=new ArrayList<>();
        int pivs=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]<pivot){
                small.add(nums[i]);
            }else if(nums[i]>pivot){
                large.add(nums[i]);
            }else{
                pivs++;
            }
        }
        int index=0;
        for(int i=0;i<small.size();i++){
            nums[index]=small.get(i);
            index++;
        }
        while(pivs!=0){
            nums[index]=pivot;
            pivs--;
            index++;
        }
        for(int i=0;i<large.size();i++){
            nums[index]=large.get(i);
            index++;
        }
        return nums;
    }
}
