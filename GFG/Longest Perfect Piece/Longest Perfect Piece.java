class Solution {
    static int longestPerfectPiece(int[] arr, int N) {
        // code here
        PriorityQueue<Integer> max=new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> min=new PriorityQueue<>();
        int ans=0;
        for(int i=0,j=0;i<N;i++){
            min.add(arr[i]);
            max.add(arr[i]);
            
            while(j<N && max.peek()-min.peek()>1){
                min.remove(arr[j]);
                max.remove(arr[j]);
                j++;
            }
            
            ans=Math.max(ans,i-j+1);
        }
        return ans;
        
    }
};
