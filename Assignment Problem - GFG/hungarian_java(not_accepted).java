
class Solution {
    static int MARK_ZERO = 2;
    static int INTERSECTION = 3;
    static int DELETED = 1;
    static int UNDELETED = 0;

    public static void main(String[] args) {
        System.out.println(assignmentProblem(new int[]{2, 1, 2, 9, 8, 1, 1, 1, 1}, 3));
    }

    static int assignmentProblem(int Arr[], int N) {
        int[][] mat = new int[N][N];
        makeMat(Arr, mat, N);

        int[][] temp = new int[N][N];
        copy(mat, temp, N);
        reduction(temp, N);

        while (true) {
            int[][] sign = new int[N][N];
            optimisation(temp, sign, N);
            int zeroes = 0;
            //count the zeroes
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (sign[i][j] == MARK_ZERO) zeroes++;
                }
            }

            if (zeroes == N) {
                int ans = 0;
                //get the final answer
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < N; j++) {
                        if (sign[i][j] == MARK_ZERO) {
                            ans += mat[i][j];
                        }
                    }
                }
                return ans;
            } else {
                int min = Integer.MAX_VALUE;
                //get min value from undeleted elements
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < N; j++) {
                        if (sign[i][j] == UNDELETED) {
                            min = Math.min(min, temp[i][j]);
                        }
                    }
                }

                //add min value to intersaction points
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < N; j++) {
                        if (sign[i][j] == INTERSECTION) {
                            temp[i][j] += min;
                        }
                    }
                }

                //subtract min from all undeleted elements
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < N; j++) {
                        if (sign[i][j] == UNDELETED) {
                            temp[i][j] -= min;
                        }
                    }
                }
            }
        }
    }

    //n2
    static void makeMat(int[] Arr, int[][] mat, int N) {
        int idx = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                mat[i][j] = Arr[idx++];
            }
        }
    }

    //n2
    static void copy(int[][] mat, int[][] temp, int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                temp[i][j] = mat[i][j];
            }
        }
    }

    //n2
    static void reduction(int[][] temp, int N) {
        //row reduction
        for (int i = 0; i < N; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < N; j++) {
                min = Math.min(min, temp[i][j]);
            }
            for (int j = 0; j < N; j++) {
                temp[i][j] -= min;
            }
        }
        //col reduction
        for (int j = 0; j < N; j++) {
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < N; i++) {
                min = Math.min(min, temp[i][j]);
            }
            for (int i = 0; i < N; i++) {
                temp[i][j] -= min;
            }
        }

    }

    //n2
    static void optimisation(int[][] temp, int[][] sign, int N) {
        for(int row=0;row<N;row++){
            int zeroes=countInRow(temp,sign,row,N);
            if(zeroes==1){
                int delCol=indexInRow(temp,sign,row,N);
                deleteCol(sign,delCol,N);
                sign[row][delCol]=MARK_ZERO;
            }
        }
        int uncoveredZeroes=0;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(temp[i][j]==0 && sign[i][j]==UNDELETED)uncoveredZeroes++;
            }
        }
        if(uncoveredZeroes>0){
            for(int col=0;col<N;col++){
                int zeroes=countInCol(temp,sign,col,N);
                if(zeroes==1){
                    int rowDel=indexInCol(temp,sign,col,N);
                    deleteRow(sign,rowDel,N);
                    sign[rowDel][col]=MARK_ZERO;
                }
            }
        }
    }

    //n

    static void deleteRow(int[][] sign, int rowDel, int n) {
        for(int col=0;col<n;col++){
            if(sign[rowDel][col]==UNDELETED){
                sign[rowDel][col]=DELETED;
            }else if(sign[rowDel][col]==DELETED){
                sign[rowDel][col]=INTERSECTION;
            }
        }
    }

    static int indexInCol(int[][] temp,int[][]sign, int col, int n) {
        int i=0;
        for(int row=0;row<n;row++){
            if(sign[row][col]==UNDELETED)
                if(temp[row][col]==0)return row;
        }
        return i;
    }

    static int countInCol(int[][] temp,int[][]sign, int col, int n) {
        int ans=0;
        for(int row=0;row<n;row++){
            if(sign[row][col]==UNDELETED)
                if(temp[row][col]==0)ans++;
        }
        return ans;
    }

    static void deleteCol(int[][] sign, int delCol,int N) {
        for(int row=0;row<N;row++){
            if(sign[row][delCol]==UNDELETED)
                sign[row][delCol]=DELETED;
            else if(sign[row][delCol]==DELETED)
                sign[row][delCol]=INTERSECTION;
        }
    }

    static int indexInRow(int[][] temp,int[][]sign, int row, int N) {
        int i=0;
        for(int col=0;col<N;col++){
            if(sign[row][col]==UNDELETED)
                if(temp[row][col]==0)return col;
        }
        return i;
    }

    static int countInRow(int[][] temp,int[][]sign, int row,int N) {
        int ans=0;
        for(int col=0;col<N;col++){
            if(sign[row][col]==UNDELETED)
                if(temp[row][col]==0)ans++;
        }
        return ans;
    }
};
