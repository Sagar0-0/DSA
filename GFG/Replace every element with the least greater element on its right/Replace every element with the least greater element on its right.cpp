class Solution{
    public:
    vector<int> findLeastGreater(vector<int>& arr, int n) {
        
        
         vector<int> v; 

        set<int>s;

        for(int i=n-1;i>=0;i--)

        {

            auto up=s.upper_bound(arr[i]);          //finds the nearest greater value

            if(up==s.end())                         //if not find nearest  grater value

            v.push_back(-1); 

            else

            v.push_back(*up);

            

            s.insert(arr[i]);                       //insert ans in array

        }

        reverse(v.begin(),v.end());            //reverse it cause we itarate to last

        return v;
    }
};
