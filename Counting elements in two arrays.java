class Solution
{
    public static ArrayList<Integer> countEleLessThanOrEqual(int arr1[], int arr2[], int m, int n)
    {
       // add your code here
       Arrays.sort(arr2);//O(nlogn)
       ArrayList<Integer> ans=new ArrayList<>();
       for(int i=0;i<arr1.length;i++){
           ans.add(binarySearch(arr2,arr1[i],0,arr2.length));
       }
       return ans;
    }
    static int binarySearch(int[]arr,int target,int i,int j){
        if(i<j){
            int mid=(i+j)/2;
            if(arr[mid]<=target){
                return binarySearch(arr,target,mid+1,j);
            }else{
                return binarySearch(arr,target,i,mid);
            }
        }
        return i;
    }
}
