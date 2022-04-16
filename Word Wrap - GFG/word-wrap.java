// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int[] nums = new int[n];
            String[] S = br.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
                nums[i]  =Integer.parseInt(S[i]);
            int k = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            System.out.println(obj.solveWordWrap(nums, k));
        }
    }
}
// } Driver Code Ends


class Solution{
    public int solveWordWrap (int[] nums, int k){
        return solveWordWrapRec(nums, k, 0, new HashMap<>());
    }
    
    public int solveWordWrapRec (int[] nums, int k, int idx, Map<Integer, Integer> cache){
        if(idx >= (nums.length-1)){
           return 0;
        }
       
        Integer value = cache.get(idx);
        if(value != null) return value;
       
        int cost = Integer.MAX_VALUE;
        int used = 0;
       
        for(int i=idx; i<nums.length; i++){
            if(used+nums[i] > k) break;
            
            if(i+1 < nums.length){
                cost = Math.min(cost, solveWordWrapRec(nums, k, i+1, cache) + getCost(nums, idx, i, k));
            }else{
                cost = Math.min(cost, getCost(nums, idx, i, k));
            }
            used += nums[i] + 1;
        }
        value = cost;
        cache.put(idx, value);
        
        return value;
    }
    
    private int getCost(int[] nums, int from, int to, int k){
        if(to == nums.length-1) return 0;
        int used = 0;
        
        for(int i=from; i<=to; i++){
            if(used > 0) used++;
            used += nums[i];    
        }
        
        return (k-used)*(k-used);
    }
}