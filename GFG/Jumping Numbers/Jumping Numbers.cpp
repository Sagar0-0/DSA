class Solution {
  public:
    long long jumpingNums(long long x) {
        // code here
        if(x<=9)return x;
        
        queue<int>q;
        
        for(int i=0; i<=9; i++)q.push(i);
        
        int ans = INT_MIN;
        
        while(q.size()>0){
            
            int digit = q.front();
            q.pop();
            
            
            ans = max(ans,digit);
            
            int rem = digit%10;
            
            int num1 = digit*10 + rem - 1;
            
            int num2 = digit*10 + rem + 1;
            
            if(rem == 0){
                if(num2<=x)
                    q.push(num2);
                
            }
            
            else if(rem==9){
                if(num1<=x)q.push(num1);
            }
            
            else{

                if(num1<=x) q.push(num1);

                 

                 if(num2<=x)q.push(num2);

            }
        }
        
        return ans;
    }
};
