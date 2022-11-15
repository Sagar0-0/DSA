public class Solution {
    public int[][] generateMatrix(int n) {
        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++){
            arr[0][i]=i+1;
        }
        int colBack=n-1;
        int rowTop=1;
        int colFront=0;
        int rowBottom=n-1;
        char dir='D';
        while(true){
            if(rowTop>rowBottom || colBack<colFront)break;
            if(dir=='D'){
                for(int i=rowTop;i<=rowBottom;i++){
                    arr[i][colBack]=arr[i-1][colBack]+1;
                }
                dir='L';
                colBack--;
            }else if(dir=='L'){
                for(int i=colBack;i>=colFront;i--){
                    arr[rowBottom][i]=arr[rowBottom][i+1]+1;
                }
                dir='U';
                rowBottom--;
            }else if(dir=='U'){
                for(int i=rowBottom;i>=rowTop;i--){
                    arr[i][colFront]=arr[i+1][colFront]+1;
                }
                dir='R';
                colFront++;
            }else if(dir=='R'){
                for(int i=colFront;i<=colBack;i++){
                    arr[rowTop][i]=arr[rowTop][i-1]+1;
                }
                dir='D';
                rowTop++;
            }
        }

        return arr;
    }
}
