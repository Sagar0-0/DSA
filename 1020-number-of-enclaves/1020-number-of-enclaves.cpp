class Solution {
public:
pair<int,bool> bfs(vector<vector<int>>& gr, vector<vector<bool>>& vis, int x, int y) {
	queue<pair<int, int>>qq;
	// (1,2)  (2,1)  (1,0)  (0,1)
	vector<int>xmoves = { 0,1,0,-1 };
	vector<int>ymoves = { 1,0,-1,0 };

	qq.push(make_pair(x, y));
	vis[x][y] = true;
	pair<int, int>temp;
	int r,c;
	bool is_at_boundary = false;
	int count = 0;
	while (!qq.empty()) {
		temp = qq.front();
		qq.pop();
		++count;
		
		for (int i = 0;i < 4;i++) {
			r = temp.first + xmoves[i];
			c = temp.second + ymoves[i];

			if (r < 0 || c < 0 || r >= gr.size() || c >= gr[0].size())
				is_at_boundary = true;
			else if (!vis[r][c] && gr[r][c]) {
				vis[r][c] = true;
				qq.push(make_pair(r, c));
			}

		}
	}

	return { count,is_at_boundary };
}
    int numEnclaves(vector<vector<int>>& grid) {
        int n = grid.size(), m = grid[0].size();
	int answer = 0;
	vector<vector<bool>>vis(n, vector<bool>(m,false));
	pair<int, bool>result;
	for (int i = 0;i < n;i++) {
		for (int j = 0;j < m;j++) {
			if (!vis[i][j] && grid[i][j]) {
				result = bfs(grid, vis, i, j);
				//cout <<"result is "<< result.first << endl;
				if (!result.second)answer += result.first;
			}
		}
	}

	return answer;
    }
};