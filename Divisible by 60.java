public class Solution {
    public int divisibleBy60(ArrayList<Integer> A) {
        int sum=0;
        if(A.size()==1 && A.get(0)==0) return 1;
        boolean zero=false;
        boolean even=false;
        for(int i:A){
            if(i==0)zero=true;
            if(i%2==0 && i!=0)even=true;
            sum+=i;
        }
        if(sum%3==0 && zero && even)return 1;
        return 0;
    }
}
