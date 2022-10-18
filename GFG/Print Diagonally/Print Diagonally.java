class Solution{
    static ArrayList<Integer> downwardDigonal(int N, int A[][])
    {
        // code here 
        ArrayList<Integer> ans=new ArrayList<>();
        int row=0;
        int col=0;
        while(col<N){
            int r=row;
            int c=col;
            while(r<N && c>=0){
                ans.add(A[r][c]);
                r++;
                c--;
            }
            col++;
        }
        col=N-1;
        row=1;
        while(row<N){
            int r=row;
            int c=col;
            while(r<N && c>=0){
                ans.add(A[r][c]);
                r++;
                c--;
            }
            row++;
        }
        return ans;
    }
}
