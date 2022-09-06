class Solution{
  public:
  int smallestSumSubarray(vector<int>& a){
      //Code here
      
      int n = a.size();
      int sum = a[0], ans = a[0];
      
      for(int i=1; i<n; i++)
      {
          if(sum > 0)
          {
              if(sum > a[i])
              sum = a[i];
          }
          else
            sum += a[i];
            
        ans = min(ans, sum);
      }
      
      return ans;
  }
};


// Another Approach - 2

class Solution{
  public:
  int smallestSumSubarray(vector<int>& a){
      int ans = INT_MAX,sum=0;
     for(int i=0;i<a.size();i++){
         sum+=a[i];
         sum = min(sum,a[i]);
         ans = min(ans,sum);
     }
      return ans;
  }
};
