class Solution {
public:
	int minStepToReachTarget(vector<int>&KnightPos, vector<int>&TargetPos, int N)
	{
	    queue<vector<int>> q;
	    vector<vector<bool>> visit(N+1 , vector<bool>(N+1, false));
	    
	    q.push({KnightPos[0] , KnightPos[1]});
	    visit[KnightPos[0]][KnightPos[1]] = 1;
	    
	    
	    int lvl = -1;
	    vector<vector<int>> dir = {{-1,-2},{-2,-1},{-2,1},{-1,2},{1,-2},{2,-1},{2,1},{1,2}};
	    while(q.empty() == false)
	    {
	        lvl += 1;
	        int sz = q.size();
	        for(int k = 0;k<sz;k++)
	        {
	            int x = q.front()[0] , y = q.front()[1];
	            q.pop();
	            if(x == TargetPos[0] && y == TargetPos[1])
	            {
	                return lvl;
	            }
	            
	            for(int i = 0;i<8;i++)
	            {
	                int nx = x+dir[i][0] , ny = y+dir[i][1];
	                if((nx >= 1 && ny >= 1 && nx <= N && ny <= N) && visit[nx][ny] == false)
	                {
	                    q.push({nx , ny});
	                    visit[nx][ny] = true;
	                }
	            }
	        }
	    }
	    
	    return -1;
	    // Code here
	}
};
