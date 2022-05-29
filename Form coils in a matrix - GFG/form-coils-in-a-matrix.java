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
            int n = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            int[][] ptr = ob.formCoils(n);
            
            for(int i=0; i<2; i++)
            {
                for(int j=0; j<ptr[i].length; j++)
                {
                    System.out.print(ptr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    static int[][] formCoils(int n){
        int [][]arr = new int[4*n][4*n];
        int val = 1;
        for(int i = 0 ; i < arr.length ; i ++){
            for(int j = 0 ; j < arr[0].length ; j ++){
                arr[i][j] = val;
                val++;
            }
        }
        int []ans = new int[8*n*n];
        int idx = 0;
        int top = 0, down = 4*n-1, left = 1, right = 4*n-1, dir = 0;
        while (top <= down && right >= left){
            if(dir == 0){
                for(int i = down ; i >= top ; i --){
                    ans[idx] = arr[i][right];
                    idx++;
                }
                right--;
                down--;
            }
            else if(dir == 1){
                for(int i = right ; i >= left ; i --){
                    ans[idx] = arr[top][i];
                    idx++;
                }
                right--;
                top++;
            }
            else if(dir == 2){
                for(int i = top ; i <= down ; i ++){
                    ans[idx] = arr[i][left];
                    idx++;
                }
                top++;
                left++;
            }
            else if(dir == 3){
                for(int i = left ; i <= right ; i ++){
                    ans[idx] = arr[down][i];
                    idx++;
                }
                down--;
                left++;
            }
            dir = (dir+1)%4;
        }
        int [][]res = new int[2][8*n*n];
        int x = ans.length-1;
        
        for(int j = 0 ; j < res[0].length ; j ++) {
            res[0][j] = ans[x];
            x--;
        }

        top = 0; down = 4*n-1; left = 0; right = 4*n-2; dir = 0; idx = 0;
        while (top <= down && right >= left){
            if(dir == 0){
                for(int i = top ; i <= down ; i ++){
                    ans[idx] = arr[i][left];
                    idx++;
                }
                top++;
                left++;
            }
            else if(dir == 1){
                for(int i = left ; i <= right ; i ++){
                    ans[idx] = arr[down][i];
                    idx++;
                }
                down--;
                left++;
            }
            else if(dir == 2){
                for(int i = down ; i >= top ; i --){
                    ans[idx] = arr[i][right];
                    idx++;
                }
                right--;
                down--;
            }
            else if(dir == 3){
                for(int i = right ; i >= left ; i --){
                    ans[idx] = arr[top][i];
                    idx++;
                }
                right--;
                top++;
            }
            dir = (dir+1)%4;
        }
        x = ans.length-1;
        for(int j = 0 ; j < res[0].length ; j ++) {
            res[1][j] = ans[x];
            x--;
        }
        return res;
    }
 }