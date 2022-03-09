public class Solution {
    Map<Integer,int[]> map=new HashMap<>();
    public int[][] solve(int[] A, int[] B) {
        int[][]ans=new int[B.length][A.length];
        for(int i=0;i<B.length;i++){
            if(!map.containsKey(B[i])){
                int[]copy=A.clone();
                int[]rotated=rotate(copy,B[i]);
                ans[i]=rotated;
                map.put(B[i],rotated);
            }else{
                ans[i]=map.get(B[i]);
            }
        }
        return ans;
    }

    int[] rotate(int[]arr,int n){
        for(int i = 0; i < n; i++){  
            int j, first;
            first = arr[0];  
            for(j = 0; j < arr.length-1; j++){
                arr[j] = arr[j+1];  
            }
            arr[j] = first;  
        }  
        return arr;
    }
}
