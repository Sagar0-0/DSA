class Solution {
    String addBinary(String A, String B) {
        // code here
        int i=A.length()-1;
        int j=B.length()-1;
        int carry=0;
        StringBuilder sb=new StringBuilder();
        while(i>=0 || j>=0){
            int a= i>=0?A.charAt(i)-'0':0;
            int b= j>=0?B.charAt(j)-'0':0;
            int total=a+b+carry;
            if(total==0){
                carry=0;
                sb.append('0');
            }else if(total==1){
                carry=0;
                sb.append('1');
            }else if(total==2){
                carry=1;
                sb.append('0');
            }else{
                carry=1;
                sb.append('1');
            }
            i--;
            j--;
        }
        
        if(carry==1)sb.append('1');
        
        while(sb.charAt(sb.length()-1)=='0')sb.setLength(sb.length()-1);
        
        return sb.reverse().toString();
    }
}
