class Solution{
public:
    vector<vector<string>> displayContacts(int n, string contact[], string s)
    {
        // code here
        //tried to make it as simple as possible
        sort(contact,contact+n);

        set<string> st;

        for(int i=0;i<n;i++) st.insert(contact[i]);

        vector<vector<string>> ans;

           for(int j=0;j<s.size();j++){

                vector<string> temp;

                for(auto it:st){

                    if(s.substr(0,j+1)==it.substr(0,j+1)) temp.push_back(it);

                }

                if(temp.size()==0) temp.push_back("0");

                ans.push_back(temp);

           }

        return ans;
    }
    };
