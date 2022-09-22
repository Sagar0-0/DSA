class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder sb=new StringBuilder();
        int i=0;
        if(k>s.length())
            return sb.append(s).reverse().toString();
        boolean flag=true;
        for(i=0;i<s.length();)
        {
            if(i+k<=s.length())
            {
                StringBuilder str=new StringBuilder(s.substring(i,i+k));
                str.reverse();
                sb.append(str);
                flag=false;
                i+=k;
            }
            if(i+k<=s.length())
            {
                sb.append(s.substring(i,i+k));
                flag=true;
            }
            i+=k;
        }
        
        if(sb.length()<s.length()&&flag==false)
            sb.append(s.substring(sb.length(),s.length()));
        else if(sb.length()<s.length()&&flag==true)
        {
            StringBuilder str=new StringBuilder(s.substring(sb.length(),s.length()));
                str.reverse();
                sb.append(str);
        }
        return sb.toString();
    }
}