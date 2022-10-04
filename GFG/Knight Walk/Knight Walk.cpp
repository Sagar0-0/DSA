/*
  This code is contributed by:
  - Shubham Kumar Jha (https://github.com/Shubhamjha1710)
  - Adarsh Urmaliya (https://github.com/Satellite-system)
*/
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

/*
Another Approach : Store the number of steps it taken to each square and from them find the minimum Distance Steps needed to reach Target Position.
Steps to reach other squares from starting Square could be find By BFS Algorithm, so we will use this Algorithm.
First initialize Stating position as steps 0, now from each position we have total 8 Possible pos(positions), where we could traverse(given that those
are valid positions, and have never been visited before), and store stps in vector.
Whenever we encounter the target positon, we return it as we are using BFS algorithm, that's why whenever we react to target position,
then that would be our First time when we have reached that position, hence will be in shortest steps.
*/

class Solution {
public:
   bool isValid(int r, int c, int n){
    if(r<=0 || c<=0 || r>n || c>n) return false;
    return true;
}
	int minStepToReachTarget(vector<int>&KnightPos, vector<int>&TargetPos, int N){
	    if(KnightPos[0]==TargetPos[0] && KnightPos[1]==TargetPos[1]){
	        return 0;
	    }
	    
	    queue<pair<int, int>> st;
	    vector<vector<int>> dis(N+2, vector<int>(N+2, -1));
	    
	    st.push({KnightPos[0], KnightPos[1]});
	    dis[KnightPos[0]][KnightPos[1]] = 0;
	    
	   vector<vector<int>> pos={{1,2}, {2,1}, {-1,2}, {1,-2}, {-1,-2}, {-2,-1}, {-2,1}, {2,-1}};
	    
	    while(!st.empty()){
	        pair<int,int> tp = st.front();
	        st.pop();
    	        
	        
	        for(int j=0;j<8; ++j){
	            int nr = tp.first + pos[j][0], nc = tp.second+pos[j][1];
	 
    	        if(isValid(nr, nc, N) && dis[nr][nc]==-1){
    	            st.push({nr, nc});
    	            dis[nr][nc] = 1 + dis[tp.first][tp.second];
    	        }
    	        if(nr==TargetPos[0] && nc==TargetPos[1])
    	            return 1 + dis[tp.first][tp.second];
	        }
    	        
	    }
	    
	    return dis[TargetPos[0]][TargetPos[1]];
	}
};
