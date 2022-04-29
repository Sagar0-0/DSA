public class Solution {
    public int[][] solve(int[] A, int B, int C) {
        int res[][]=new int[B][C];
        int top = 0, bottom = B-1, left = 0, right = C-1;
        int val = 1,direction=1 , k = 0;
        while(left <= right && top <= bottom){
            if(direction == 1){   
                for(int i=left;i<=right;i++)
                    res[top][i] = A[k++];
                top++;
                direction=2;
            }
            else if(direction == 2){
                for(int i = top;i<=bottom;i++)
                    res[i][right] = A[k++];
                right--;
                direction = 3;
            }
            else if(direction == 3){
                for(int i = right;i>=left;i--)
                    res[bottom][i]=A[k++];
                bottom--;
                direction=4;
            }
            else if(direction == 4){
                for(int i=bottom;i>=top;i--)
                    res[i][left]=A[k++];
                left++;
                direction = 1;
            }
        }
        return res;
    }
}
