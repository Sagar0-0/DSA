class Solution {
    public int minimumSum(int num) {
        int list[]=new int[4];
        list[0]=num%10;
        num/=10;
        list[1]=num%10;
        num/=10;
        list[2]=num%10;
        num/=10;
        list[3]=num%10;
        Arrays.sort(list);
        return list[0]*10+list[2]+list[1]*10+list[3];
    }
}
