public class Solution {
    public int firstMissingPositive(ArrayList<Integer> A) {
        A.removeIf(val -> val <=0);
        Collections.sort(A);
        for(int j = 0;j<A.size();j++)if(A.get(j)!=j+1)return j+1;
        return A.size()+1;
    }
}
