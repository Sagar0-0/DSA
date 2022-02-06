class Solution
{
    //Function to find the minimum number of swaps required to sort the array.
    public int minSwaps(int nums[]){
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        int ans=0;
        int temp[]=new int[nums.length];
        temp=nums.clone();
        Arrays.sort(temp);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==temp[i]){
                continue;
            }else{
                ans++;
                int tep=nums[i];
                nums[i]=nums[map.get(temp[i])];
                nums[map.get(temp[i])]=tep;
                map.put(tep,map.get(temp[i]));
                map.put(temp[i],i);
            }
            
        }
        return ans;
    }
}
