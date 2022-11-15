public class Solution {
    public ArrayList<Integer> findOccurences(ArrayList<Integer> A) {
        ArrayList<Integer> ans=new ArrayList<>();
        Collections.sort(A);
        int cnt=1;
        int prev=A.get(0);
        for(int i=1;i<A.size();i++){
            if(A.get(i)==prev){
                cnt++;
            }else{
                ans.add(cnt);
                prev=A.get(i);
                cnt=1;
            }
        }
        ans.add(cnt);
        return ans;
    }
}
