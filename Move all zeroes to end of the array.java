public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i:A){
            if(i!=0){
                ans.add(i);
            }
        }
        int diff=A.size()-ans.size();
        while(diff!=0){
            ans.add(0);
            diff--;
        }
        return ans;
    }
}
