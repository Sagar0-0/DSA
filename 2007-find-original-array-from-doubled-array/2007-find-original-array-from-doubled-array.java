/**
    Solution:
    
    1. Sort the array
    2. Make the queue
    3. Now we know that the answer array is half size of the change array
    4. Now traverse the change array and if queue is not empty and curr element is same as queue.peek then 
    add the half of num/2 to ans
    5. else add that 2*num to queue
    
    TC: O(nlogn) SC:O(n)
*/


class Solution {
    public int[] findOriginalArray(int[] c) {
        
        int n=c.length;
        Deque<Integer> q=new LinkedList<>();
        Arrays.sort(c);
        
        int i=0;
        int j=0;
        int[] ans=new int[n/2];
        
        while(i<n){
            int num=c[i];
            if(q.size()>0 && q.peek()==num){
                ans[j++]=q.poll()/2;
            }else{
                q.add(2*num);
            }
            i++;
        }
        
        return q.size()>0?new int[]{}:ans;
        
    }
}


//without sorting

class Solution {
    public int[] findOriginalArray(int[] changed) {
        if(changed.length%2 != 0) return new int[0];
        int max = Integer.MIN_VALUE;
        for(int num : changed) max = Math.max(max, num);
        if(max%2 != 0) return new int[0];
        
        int[] cnts = new int[max+1];
        for(int num : changed) cnts[num]++;
        
        int[] res = new int[changed.length/2];
        if(cnts[0] % 2 != 0) return new int[0];
        int idx = cnts[0]/2;
        for(int i = 1; i < cnts.length; i++) {
            if(cnts[i] == 0) continue;
            if(2*i > max || cnts[i] > cnts[2*i]) return new int[0];
            int cnt = cnts[i];
            cnts[2*i] -= cnt;
            while(cnt-- > 0) res[idx++] = i;
        }
        
        return res;
    }
}class Solution {
    public int[] findOriginalArray(int[] changed) {
        if(changed.length%2 != 0) return new int[0];
        int max = Integer.MIN_VALUE;
        for(int num : changed) max = Math.max(max, num);
        if(max%2 != 0) return new int[0];
        
        int[] cnts = new int[max+1];
        for(int num : changed) cnts[num]++;
        
        int[] res = new int[changed.length/2];
        if(cnts[0] % 2 != 0) return new int[0];
        int idx = cnts[0]/2;
        for(int i = 1; i < cnts.length; i++) {
            if(cnts[i] == 0) continue;
            if(2*i > max || cnts[i] > cnts[2*i]) return new int[0];
            int cnt = cnts[i];
            cnts[2*i] -= cnt;
            while(cnt-- > 0) res[idx++] = i;
        }
        
        return res;
    }
}
