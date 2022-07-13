// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            String S[] = read.readLine().split(" ");
            
            int[] Arr = new int[N*N];
            
            for(int i=0; i<N*N; i++)
                Arr[i] = Integer.parseInt(S[i]);

            Solution ob = new Solution();
            System.out.println(ob.assignmentProblem(Arr,N));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    // public static void main(String[] args) {
    //     System.out.println(assignmentProblem(new int[]
    //             {2, 1, 2, 9, 8, 1, 1, 1, 1},3));
    // }
    static int assignmentProblem(int a[], int n){

        //create matrix
        int[][]mat=new int[n][n];
        int idx=0;
        for(int i=0;i<n;i++)for(int j=0;j<n;j++)mat[i][j]=a[idx++];

        List<Integer> indices=dfs(n,mat);

        int ans=0;
        for(int i=0;i<indices.size();i++){
            ans+=mat[indices.get(i)][i];
        }
        return ans;
    }

    static List<Integer> dfs(int n,int[][]mat){
        int[] u=new int[n];
        int[] v=new int[n];
        int[] ind=new int[n];
        Arrays.fill(ind,-1);

        for(int i=0;i<n;i++){
            int j=0;
            int[]links=new int[n];
            Arrays.fill(links,-1);

            int[]mins=new int[n];
            Arrays.fill(mins,1000);

            boolean[]vis=new boolean[n];
            int mark_i=i;
            int mark_j=-1;
            while(mark_i!=-1){
                j=-1;
                for(int j1=0;j1<n;j1++){
                    if(!vis[j1]){
                        int current=mat[mark_i][j1]-u[mark_i]-v[j1];
                        if(current<mins[j1]){
                            mins[j1]=current;
                            links[j1]=mark_j;
                        }
                        if(j==-1 || mins[j1]<mins[j]){
                            j=j1;
                        }
                    }
                }
                int delta=mins[j];
                for(int j1=0;j1<n;j1++){
                    if(vis[j1]){
                        u[ind[j1]]+=delta;
                        v[j1]-=delta;
                    }else{
                        mins[j1]-=delta;
                    }
                }
                u[i]+=delta;
                vis[j]=true;
                mark_j=j;
                mark_i=ind[j];
            }
            while(links[j]!=-1){
                ind[j]=ind[links[j]];
                j=links[j];
            }
            ind[j]=i;
        }


        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            ans.add(ind[i]);
        }
        return ans;
    }

};