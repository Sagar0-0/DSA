public class Solution {
    public int searchMatrix(ArrayList<ArrayList<Integer>> A, int B) {
        return dfs(A,B,0,A.size()-1);
    }
    public int dfs(ArrayList<ArrayList<Integer>> A, int B,int l,int h){
        if(l<=h){
            int mid=l+(h-l)/2;
            if(A.get(mid).get(0)>B){
                return dfs(A,B,l,mid-1);
            }else if(A.get(mid).get(A.get(mid).size()-1)<B){
                return dfs(A,B,mid+1,h);
            }else{
                if(A.get(mid).contains(B))return 1;
            }
        }
        return 0;
    }
}
