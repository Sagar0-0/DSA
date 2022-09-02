public class Solution {
    public ArrayList<String> specialStrings(ArrayList<String> A) {
        ArrayList<String> ans=new ArrayList<>();
        dfs(ans,A,new StringBuilder());
        return ans;
    }
    void dfs(ArrayList<String> ans,ArrayList<String> arr,StringBuilder sb){
        if(sb.length()==arr.size()){
            ans.add(sb.toString());
            return;
        }
        String s=arr.get(sb.length());
        for(int i=0;i<s.length();i++){
            sb.append(s.charAt(i));
            dfs(ans,arr,sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
