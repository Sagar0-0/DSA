public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        Collections.sort(A);
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=A.size()-1;i>=A.size()-B;i--){
            ans.add(A.get(i));
        }
        return ans;
    }
}
