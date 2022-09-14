public class Solution {
    int ans;
    public int black(String[] A) {
        ans=0;
        char[][]arr=new char[A.length][A[0].length()];
        for(int i=0;i<A.length;i++){
            arr[i]=A[i].toCharArray();
        }
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[i].length();j++){
                if(arr[i][j]=='X'){
                    dfs(arr,i,j);
                    ans++;
                }
            }
        }
        return ans;
    }
    void dfs(char[][]arr,int i,int j){
        if(i<0 || j<0 || i==arr.length || j==arr[i].length || arr[i][j]=='O')return;
        arr[i][j]='O';
        dfs(arr,i,j+1);
        dfs(arr,i,j-1);
        dfs(arr,i+1,j);
        dfs(arr,i-1,j);
    }
}
