public class Solution {
    public int solve(String A) {
        if(A.length()<8 || A.length()>15)return 0;
        boolean num=false;
        boolean lower=false;
        boolean upper=false;
        boolean spcl=false;
        for(int i=0;i<A.length();i++){
            char ch=A.charAt(i);
            if(ch>='0' && ch<='9')num=true;
            if(ch>='a' && ch<='z')lower=true;
            if(ch>='A' && ch<='Z')upper=true;
            if(ch=='@' || ch=='#' || ch=='%'||ch=='&'||ch=='!'||ch=='$'||ch=='*')spcl=true;
        }
        return num && lower && upper && spcl?1:0;
    }
}
