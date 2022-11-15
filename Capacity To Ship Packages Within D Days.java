class Solution {
    static int leastWeightCapacity(int[] a, int n, int d) {
        // code here
        int min=largest(a);
        int max=sum(a);
        int res=0;
        while(min<=max){
            int mid=(min+max)/2;
            if(isValid(a,d,mid)){
                res=mid;
                max=mid-1;
            }else{
                min=mid+1;
            }
        }
        return res;
    }
    static boolean isValid(int[]a,int k,int res){
        int day=1,sum=0;
        for(int i=0;i<a.length;i++){
            if(sum+a[i]>res){
                day++;
                sum=a[i];
            }else{
                sum+=a[i];
            }
        }
        return day<=k;
    }
    static int sum(int[]a){
        int sum=0;
        for(int i:a){
            sum+=i;
        }
        return sum;
    }
    static int largest(int[]arr)
     {
         int i;
          
         // Initialize maximum element
         int max = arr[0];
       
         // Traverse array elements from second and
         // compare every element with current max 
         for (i = 1; i < arr.length; i++)
             if (arr[i] > max)
                 max = arr[i];
       
         return max;
     }
};
