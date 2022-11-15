class Solution{
public:

void rearrange(int arr[], int n) {
	// code here
	stack<int> st,st1;
       for(int i=n-1;i>=0;i--){
           if(arr[i]>=0) st.push(arr[i]);
           else st1.push(arr[i]);
       }
       for(int i=0;i<n;i++){
           if(i%2==0 && !st.empty()){
               arr[i]=st.top();
               st.pop();
           }
           else if(i%2==1 && !st1.empty()){
               arr[i]=st1.top();
               st1.pop();
           }else if(!st.empty()){
               arr[i]=st.top();
               st.pop();
           }else{
               arr[i]=st1.top();
               st1.pop();
           }
       }
   }
};