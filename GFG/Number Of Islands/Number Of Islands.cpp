class Solution {
  public:
  
    //dfs function for finding island
    
   void dfs(vector<vector<int>>&v,int l,int i,int j,int n,int m){

        if(i>n-1||j>m-1||i<0||j<0){

            return;

        }

        if(v[i][j]!=l){

            return;

        }
      
     // update number
     
        v[i][j]+=1;

        dfs(v,l,i-1,j,n,m); // up

        dfs(v,l,i+1,j,n,m); // down

        dfs(v,l,i,j-1,n,m); // left

        dfs(v,l,i,j+1,n,m); // right

    }

  

    vector<int> numOfIslands(int n, int m, vector<vector<int>> &operators) {

        int k=operators.size();
      
      //flag

        int l=1;

        vector<int> ans;

        vector<vector<int>> v(n,vector<int>(m,0));
      
      // iterate around the number of operations

        for(int i=0;i<k;i++){

            int count=0;

            v[operators[i][0]][operators[i][1]]=l;

            for(int t=0;t<n;t++){

                for(int j=0;j<m;j++){

                    if(v[t][j]==l){

                        dfs(v,l,t,j,n,m);

                        count++;

                    }

                }

            }
          
     // update flag
          
            l++;

            ans.push_back(count);

        }

        return ans;

    }
};
