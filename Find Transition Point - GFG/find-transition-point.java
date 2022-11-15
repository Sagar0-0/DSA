// { Driver Code Starts
import java.util.*;

class Sorted_Array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            GfG obj = new GfG();
            System.out.println(obj.transitionPoint(arr, n));
            T--;
        }
    }
}// } Driver Code Ends


class GfG {
    int transitionPoint(int arr[], int n){
        int i=0;
        int j=n;
        int mid;
        while(i<j){
            mid=(i+j)/2;
            if(arr[mid]==0){
                i=mid+1;
            }else{
                j=mid;
            }
        }
        return i==n?-1:i;
    }
}