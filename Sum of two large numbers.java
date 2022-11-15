class Solution {
    String findSum(String X, String Y) {
        // code here
        StringBuilder a=new StringBuilder(X);
        StringBuilder b=new StringBuilder(Y);
        StringBuilder ans=new StringBuilder();
        
        int carry=0;
        while(a.length()>0 || b.length()>0){
            int first=a.length()>0?a.charAt(a.length()-1)-'0':0;
            int second=b.length()>0?b.charAt(b.length()-1)-'0':0;
            int sum=first+second+carry;
            if(sum>9){
                sum-=10;
                carry=1;
            }else{
                carry=0;
            }
            ans.insert(0,sum);
            if(a.length()>0)a.setLength(a.length()-1);
            if(b.length()>0)b.setLength(b.length()-1);
        }
        if(carry==1){
            ans.insert(0,1);
        }
        //000000
        for(int i=0;i<ans.length();i++){
            if(ans.charAt(i)>'0'){
                return ans.substring(i);
            }
        }
        return "0";
    }
}
