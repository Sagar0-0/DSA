public class Solution {
	public ArrayList<ArrayList<String>> partition(String a) {
        ArrayList<ArrayList<String>> ans=new ArrayList<>();
        ArrayList<String> path=new ArrayList<>();
        helper(a,0,path,ans);
        return ans;
	}
    void helper(String s,int index,ArrayList<String> path,ArrayList<ArrayList<String>> ans){
        if(index==s.length()){
            ans.add(new ArrayList<>(path));
            return;
        }
        for(int i=index;i<s.length();i++){
            if(isPalindrome(s,index,i)){
                path.add(s.substring(index,i+1));
                helper(s,i+1,path,ans);
                path.remove(path.size()-1);
            }
        }
    }
    boolean isPalindrome(String s,int i,int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j))return false;
            i++;
            j--;
        }
        return true;
    }
}
