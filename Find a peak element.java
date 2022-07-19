public class Solution {
    public int solve(ArrayList<Integer> A) {
        if(A.size()==1)return A.get(0);
        for(int i=0;i<A.size();i++){
            if(i==0){
                if(A.get(i)>A.get(i+1))return A.get(i);
            }else if(i==A.size()-1){
                if(A.get(A.size()-1)>A.get(i-2))return A.get(A.size()-1);
            }else{
                if(A.get(i)>A.get(i+1) && A.get(i)>A.get(i-1))return A.get(i);
            }
        }
        return -1;
    }
}
