public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        int high=-1;
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=A.size()-1;i>=0;i--){
            if(A.get(i)>high){
                high=A.get(i);
                ans.add(high);
            }
        }
        return ans;
    }
}
