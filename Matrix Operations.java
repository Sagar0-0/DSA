class Solution{
    static int[]UP=new int[]{-1,0};
    static int[]RIGHT=new int[]{0,1};
    static int[]DOWN=new int[]{1,0};
    static int[]LEFT=new int[]{0,-1};
    static int [] endPoints(int [][]arr, int m, int n){
        char dir='R';
        int row=0;
        int col=0;
        while(true){
            if(arr[row][col]==1){
                arr[row][col]=0;
                dir=changeDir(dir);
            }
            int[]move=getDir(dir);
            if(outOfBounds(arr,row+move[0],col+move[1])){
                return new int[]{row,col};
            }else{
                row+=move[0];
                col+=move[1];
            }
        }
    }
    static boolean outOfBounds(int[][] arr,int row,int col){
        int a=arr.length;
        int b=arr[0].length;
        if(row>=a)return true;
        if(col>=b)return true;
        if(row<0 || col<0)return true;
        return false;
    }
    static int[] getDir(char c){
        if(c=='U'){
            return UP;
        }else if(c=='D'){
            return DOWN;
        }else if(c=='R'){
            return RIGHT;
        }else{
            return LEFT;
        }
    }
    static char changeDir(char c){
        if(c=='R'){
            return 'D';
        }else if(c=='D'){
            return 'L';
        }else if(c=='L'){
            return 'U';
        }else{
            return 'R';
        }
    }
}
