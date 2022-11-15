public class Solution {
    public int solve(ArrayList<Integer> A) {
        Set<Integer> set=new HashSet<>();
        int ans=-1;
        for(int i=A.size()-1;i>=0;i--){
            int num=A.get(i);
            if(set.contains(num)){
                ans=num;
            }else{
                set.add(num);
            }
        }
        return ans;
    }
}
