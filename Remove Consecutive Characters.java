public class Solution {
    public String solve(String A, int B) {


        int count=1;
        String res="";
        for(int i=0;i<A.length()-1;i++){

            if(A.charAt(i) == A.charAt(i+1))
                count++;
            else{
                if(count%B !=0)
                    res += A.charAt(i);
                count = 1;
            }
        }
        if(count ==1 || count>B)
            res += A.charAt(A.length()-1);
        return res;        
    }
}
