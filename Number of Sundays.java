public class Solution {
    public int solve(String A, int B) {
        int ans=0;
        int num=0;
        if(A.equals("Sunday")){
            num=1;
        }else if(A.equals("Monday")){
            num=7;
        }else if(A.equals("Tuesday")){
            num=6;
        }else if(A.equals("Wednesday")){
            num=5;
        }else if(A.equals("Thursday")){
            num=4;
        }else if(A.equals("Friday")){
            num=3;
        }else if(A.equals("Saturday")){
            num=2;
        }
        if(num>B)return 0;
        ans++;
        ans+=(B-num)/7;
        return ans;
    }
}
