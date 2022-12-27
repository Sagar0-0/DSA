//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0)
        {
            int N = sc.nextInt();
            int arr[] = new int[N];
            for(int i=0; i<N; i++)
                arr[i] = sc.nextInt();
            
            Solution g = new Solution();
            long ans = g.wineSelling(arr,N);
            
            System.out.println(ans);
            T--;
        }
    }
}


// } Driver Code Ends
//User function Template for Java


class Solution {
    long wineSelling(int arr[],int N){
        // code here
        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<N;i++){
            if(arr[i]>0)q.add(new int[]{i,arr[i]});
        }
        int i=0;
        long ans=0l;
        while(!q.isEmpty()){
            while(i<N && arr[i]>0)i++;
            int sell=Math.abs(arr[i]);
            while(sell>0){
                int buy=q.peek()[1];
                int pos=q.peek()[0];
                if(sell>=buy){
                    ans+=(Math.abs(i-pos)*buy);
                    sell-=buy;
                    q.remove();
                }else{
                    ans+=(Math.abs(i-pos)*sell);
                    q.peek()[1]=buy-sell;
                    sell=0;
                }
            }
            i++;
        }
    
        return ans;
        
        
        //Method 2
        ArrayList<Integer> positive=new ArrayList<>();
        ArrayList<Integer> negative=new ArrayList<>();
        
        for(int i=0;i<Arr.length;i++) {
            if(Arr[i]>=0) {
                positive.add(i);
            }
            else {
                negative.add(i);
            }
        }
        long ans=0;
        int neg=0;
        int i=0;
        while(i<positive.size() && neg<negative.size()) {
            if(Arr[positive.get(i)]>=Math.abs(Arr[negative.get(neg)])) {
                long diff=Math.abs(positive.get(i)-negative.get(neg));
                long sum=-1*Arr[negative.get(neg)];
                Arr[positive.get(i)]= Arr[positive.get(i)]+Arr[negative.get(neg)];
                ans+=sum*diff;
                neg+=1;
            }
            else {
                long diff=Math.abs(positive.get(i)-negative.get(neg));
                long sum=Arr[positive.get(i)];
                Arr[negative.get(neg)]= Arr[negative.get(neg)]+Arr[positive.get(i)];
                ans+=sum*diff;
                i+=1;
            }
        }
        return ans;
    }
}

//{ Driver Code Starts.
// } Driver Code Ends


//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0)
        {
            int N = sc.nextInt();
            int arr[] = new int[N];
            for(int i=0; i<N; i++)
                arr[i] = sc.nextInt();
            
            Solution g = new Solution();
            long ans = g.wineSelling(arr,N);
            
            System.out.println(ans);
            T--;
        }
    }
}


// } Driver Code Ends
//User function Template for Java


class Solution {
    long wineSelling(int arr[],int N){
        // code here
        long sum=0l;
        long ans=0l;
        for(int i:arr){
            sum+=i;
            ans+=Math.abs(sum);
        }
        return ans;
    }
}

//{ Driver Code Starts.
// } Driver Code Ends
