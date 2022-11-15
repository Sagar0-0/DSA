public class Solution {
    public int solve(String s) {
        int[]arr=new int[26];
        for(char c:s.toCharArray()){
            arr[c-'a']++;
        }
        boolean one=false;
        for(int i:arr){
            if(i%2==1){
                if(one){
                    return 0;
                }else{
                    one=true;
                }
            }
        }
        return 1;
    }
}
