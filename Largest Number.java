public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public String largestNumber(final List<Integer> A) {
        Collections.sort(A,(a,b)->{
            String s1=Integer.toString(a);
            String s2=Integer.toString(b);
            return (s1+s2).compareTo(s2+s1)>0?-1:1;
        });
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<A.size();i++){
            if(i==0 && A.get(i)==0)return "0";
            sb.append(A.get(i));
        }
        return sb.toString();
    }
}
