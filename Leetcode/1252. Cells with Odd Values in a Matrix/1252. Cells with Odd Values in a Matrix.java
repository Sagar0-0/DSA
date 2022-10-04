class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int arr[][] = new int[m][n];
        int count=0;
        for(int i=0 ; i<indices.length ; i++){
            for(int j=0 ; j<indices[i].length ; j++){
                int a = indices[i][j];
                if(j==0){
                    increment1(a,arr); 
                    }
                else{
                    increment2(a,arr);
                }
            }
            
        }
        // for(int i=0 ; i< arr.length ; i++){
        //     for(int j=0; j<arr[0].length ; j++){
        //         System.out.print(arr[i][j]);
        //     }
        //     System.out.println();
        // }
        count =cunt(arr,m,n);
        return count;
    }
    
    static void increment1(int b , int[][] arr){
            // #this is to increase the value of the row
            for(int i=0; i<arr[b].length; i++){
                arr[b][i]+=1;
            }
        }
    
    static void  increment2(int c,int[][]arr){
            
            // #this is to increase the value of the column
            for(int i=0; i<arr.length; i++){
                arr[i][c]+=1;
            }  
        }
    
    static int cunt(int[][] brr, int m , int n)
        {
            int add=0;
            for(int i=0; i<m; i++){
                for(int j=0; j<n ; j++){
                    if(brr[i][j] %2 != 0){
                        add+=1;
                    }
                }
            }
        System.out.println(add);
        return add;
        }
        
    }
