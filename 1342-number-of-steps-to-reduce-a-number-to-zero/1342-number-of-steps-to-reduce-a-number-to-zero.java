class Solution {
    public int numberOfSteps(int num) {
        int count=0;
        while(num!=0){
            if((num&1)==0){
                num/=2;
            }else{
                num--;
            }
            count++;
        }
        return count;
    }
}