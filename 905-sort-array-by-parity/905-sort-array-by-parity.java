class Solution {
    public int[] sortArrayByParity(int[] num) {
        Integer[]nums=new Integer[num.length];
        for(int i=0;i<num.length;i++){
            nums[i]=num[i];
        }
        Arrays.sort(nums,(a,b)->Integer.compare(a%2,b%2));
        for(int i=0;i<num.length;i++){
            num[i]=nums[i];
        }
        return num;
    }
}