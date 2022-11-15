public class Solution {

    int [][] DT = new int[151][151];
    int [][] DF = new int[151][151];
    int mod = 1003;

    public int cnttrue(String A) {
        for (int[] row: DT) Arrays.fill(row, -1);
        for (int[] row: DF) Arrays.fill(row, -1);
        return solveTrue(A, 0, A.length()-1)%1003;
    }

    int solveTrue(String A, int i, int j){
        if(i>j) return 0;
        if(i==j){
            return A.charAt(i)=='T' ? 1 : 0;
        } 
        if(DT[i][j] != -1){
            return DT[i][j];
        }
        int count = 0;
        for(int k=i; k<j; k=k+2){
            
            char operator = A.charAt(k+1);

            int leftFalse = DF[i][k] != -1 ? DF[i][k] : solveFalse(A, i, k);
            int rightFalse = DF[k+2][j] != -1 ? DF[k+2][j] : solveFalse(A, k+2, j);

            int leftTrue = DT[i][k] != -1 ? DT[i][k] : solveTrue(A, i, k);
            int rightTrue = DT[k+2][j] != -1 ? DT[k+2][j] : solveTrue(A, k+2, j);

            if(operator == '&'){
                count += leftTrue * rightTrue % mod;  
            } else if(operator == '^'){
                count += leftTrue * rightFalse % mod;
                count += leftFalse * rightTrue % mod;
            } else if(operator == '|'){
                count += leftTrue * rightTrue % mod;
                count += leftTrue * rightFalse % mod;
                count += leftFalse * rightTrue % mod;
            }
        }
        DT[i][j] = count;
        return count;
    }

    int solveFalse(String A, int i, int j){
        if(i>j) return 0;
        if(i==j){
            return A.charAt(i)=='F' ? 1 : 0;
        } 
        if(DF[i][j] != -1){
            return DF[i][j];
        }
        int count = 0;

        for(int k=i; k<j; k=k+2){
            
            char operator = A.charAt(k+1);

            int leftFalse = DF[i][k] != -1 ? DF[i][k] : solveFalse(A, i, k);
            int rightFalse = DF[k+2][j] != -1 ? DF[k+2][j] : solveFalse(A, k+2, j);

            int leftTrue = DT[i][k] != -1 ? DT[i][k] : solveTrue(A, i, k);
            int rightTrue = DT[k+2][j] != -1 ? DT[k+2][j] : solveTrue(A, k+2, j);

            if(operator == '|'){
                count += leftFalse * rightFalse % mod;  
            } else if(operator == '^'){
                count += leftTrue * rightTrue % mod;
                count += leftFalse * rightFalse % mod;
            } else if(operator == '&'){
                count += leftFalse * rightFalse % mod;
                count += leftTrue * rightFalse % mod;
                count += leftFalse * rightTrue % mod;
            }
        }
        DF[i][j] = count;
        return count;
    }
}

