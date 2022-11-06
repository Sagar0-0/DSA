class Solution{
public:
    vector<int> minPartition(int n)
    {
        // code here
        
          vector<int>v={ 1, 2, 5, 10, 20, 50, 100, 200, 500, 2000 };

        vector<int>ans;

        int p,q;

        while(n!=0){

            for(int i=9;i>=0;i--){

                if(n/v[i]!=0){

                    int x=n/v[i];

                    while(x--){

                        n-=v[i];

                        ans.push_back(v[i]);

                    }    

                }

            }

        }

        return ans;
    }
};
