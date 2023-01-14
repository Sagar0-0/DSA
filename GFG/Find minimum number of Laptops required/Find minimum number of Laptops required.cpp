class Solution {
  public:
    int minLaptops(int N, int start[], int end[]) {
        // Code here
        map<int,int> m;
        
        for(int i = 0; i < N; i++)
          m[start[i]]++;
          
        for(int i = 0; i < N; i++)
          m[end[i]]--;
          
          int cnt = 0;
          int sum = 0;
        for(auto i : m)
        {
            sum += i.second;
            cnt = max(cnt , sum);
            
        }
        return cnt;
    }
};
