// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		for(int t=0;t<testCases;t++){
		    int n = sc.nextInt();
		    int arr[] = new int[n];
		    for(int i=0;i<n;i++){
		        arr[i] = sc.nextInt();
		    }
		    Arrays.sort(arr);
		    System.out.print("()");
		    ArrayList <ArrayList<Integer>> res = new solve().AllSubsets(arr,n);
		    for (int i = 0; i < res.size (); i++)
		    {
		        System.out.print ("(");
		        for (int j = 0; j < res.get(i).size (); j++)
		        {
		            if (j != res.get(i).size()-1)
		                System.out.print ((res.get(i)).get(j) + " ");
		            else
		                System.out.print ((res.get(i)).get(j));
		        }
		        System.out.print (")");
		      
		    }
		    System.out.println();
		}
	}
}// } Driver Code Ends


class solve{
    public static ArrayList <ArrayList <Integer>> AllSubsets(int arr[], int n){
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> ans= new ArrayList<>();
        ArrayList<Integer> al=new ArrayList<>();
        check(arr,n,0,ans,al);
        ans.remove(0);
        return ans;
    }
   
    public static void check(int arr[], int n,int index,ArrayList<ArrayList<Integer>> ans,ArrayList<Integer> al){
        if(!ans.contains(al))ans.add(al);
        if(index==n) return;
        ArrayList<Integer> temp=new ArrayList<>(al);
        temp.add(arr[index]);
        check(arr,n,index+1,ans,temp);
        check(arr,n,index+1,ans,al);
    }


}
