public class Solution {
    ArrayList<ArrayList<String>> dp;
    public ArrayList<String> wordBreak(String A,  ArrayList<String> B) {
        dp = new ArrayList<>();
        for(int i = 0;i<A.length();i++){
            dp.add(new ArrayList<String>());
        }
        Set<String> set = new HashSet<>();
        for(String str:B){
            set.add(str);
        }
        return wordBreak(A,set,0);
    }
    public ArrayList<String> wordBreak(String A, Set<String> set, int i) {
        if(i==A.length()){
            return new ArrayList<String>();
        }
        if(dp.get(i).size()!=0)
            return dp.get(i);
        ArrayList<String> ans = new ArrayList<>();
        for(int j = i+1;j<=A.length();j++){
            if(set.contains(A.substring(i,j))){
                ArrayList<String> buf = wordBreak(A,set,j);
                for(String a: buf){
                    ans.add(A.substring(i,j)+" "+a);
                }
                if(j==A.length()){
                    ans.add(A.substring(i));
                }
            }
        }
        dp.set(i,ans);
        return ans;
    }
}

