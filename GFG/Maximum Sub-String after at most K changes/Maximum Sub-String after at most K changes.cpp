class Solution {
	public:
		int characterReplacement(string s, int k){
		    // Code here
		    
		      int ans = 0;
		  int l = 0;
		  vector<int>temp(26);
		  for(int i=0;i<s.size();i++){
		      temp[s[i]-'A']++;
		      int operation = i-l+1-*max_element(temp.begin(),temp.end());
		      if(operation>k){
		       temp[s[l]-'A']--;
		       l++;
		      }
		      else ans = max(ans,i-l+1);
		  }
		 return ans;
		}

};
