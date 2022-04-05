public class Solution {
    public int solve(ArrayList<Integer> A) {
        Collections.sort(A);
        for(int i=1;i<A.size();i++){
            if(A.get(i)!=A.get(i-1)){
                if(A.get(i-1)==A.size()-i)
                    return 1;
            }
        }
        if(A.get(A.size()-1)==0)return 1;
        return -1;
    }
}
