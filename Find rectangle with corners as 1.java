public class Solution { 
    static boolean ValidCorner(int mat[][]) { 
        int n=mat.length;
        int m=mat[0].length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int cnt=0;
                for(int k=0;k<m;k++){
                    if((mat[i][k]+mat[j][k])==2){
                        cnt++;
                    }
                }
                if(cnt>=2){
                    return true;
                }
            }
        }
        return false;
        
    }
}
