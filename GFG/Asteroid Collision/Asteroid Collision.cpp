class Solution {
  public:
    vector<int> asteroidCollision(int N, vector<int> &asteroids) {
        stack<int> s;
        int i = 0;
        while(i < N){
            if(s.empty()){
                s.push(asteroids[i]);
                ++i;
            }
            else{
                if((asteroids[i] > 0 && s.top() > 0) || 
                (asteroids[i] < 0 && s.top() < 0) ||
                (asteroids[i] > 0 && s.top() < 0)){
                    s.push(asteroids[i]);
                    ++i;
                }
                else if(asteroids[i] < 0 && s.top() > 0){
                    int a = s.top();
                    s.pop();
                    
                    if(a == abs(asteroids[i]))
                        ++i;
                    else if(a > abs(asteroids[i])){
                        s.push(a);
                        ++i;
                    }
                    else if(a < abs(asteroids[i])){
                        continue;
                    }
                }
            }
        }
        vector<int> ans;
        while(!s.empty()){
            int a = s.top();
            s.pop();
            ans.push_back(a);
        }
        
        reverse(ans.begin(), ans.end());
        
        return ans;
    }
};
