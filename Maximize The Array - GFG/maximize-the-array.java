// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

public class GFG {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr1 = new int[n], arr2 = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr1[i] = Integer.parseInt(inputLine[i]);
            }
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr2[i] = Integer.parseInt(inputLine[i]);
            }

            ArrayList<Integer> ans = new Solution().maximizeArray(arr1, arr2, n);
            for (Integer x : ans) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends

class Solution {
    ArrayList<Integer> maximizeArray(int[] arr1, int[] arr2, int n) {
        ArrayList<Integer> ans=new ArrayList<>();
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        for(int i:arr1)pq.add(i);
        for(int i:arr2)pq.add(i);
        Set<Integer> set=new HashSet<Integer>();
        while(set.size()!=n && pq.size()>0){
            set.add(pq.remove());
        }
        for(int i:arr2){
            if(set.contains(i)){
                ans.add(i);
                set.remove(i);
            }
        }
        for(int i:arr1){
            if(set.contains(i)){
                ans.add(i);
                set.remove(i);
            }
        }
        return ans;
    }
}