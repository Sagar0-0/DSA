//1. sort according to our starting time
//2. use priorityq to check minimum end time of previous laptop to be free
//3. compare that with start time of our new job

class Solution {
    public int minLaptops(int n, int[] start, int[] end) {
        // code here
        int[][] arr=new int[n][2];
        for(int i=0;i<n;i++){
            arr[i]=new int[]{start[i],end[i]};
        }
        
        Arrays.sort(arr,(a,b)->{
            if(a[0]!=b[0])return a[0]-b[0];
            return a[1]-b[1];
        });
        
        int ans=1;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.add(arr[0][1]);
        int i=1;
        while(i<n){
            int s=arr[i][0];
            int e=arr[i][1];
            if(pq.peek()<=s){
                pq.remove();
            }else{
                ans++;
            }
            pq.add(e);
            i++;
        }
        return ans;
    }
}
