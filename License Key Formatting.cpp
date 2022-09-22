class Solution
{
   public:
    string ReFormatString(string s, int k){
    	int n = s.size();
    	int cnt=0;
    	string ans="";
    	for(int i=n-1;i>=0;i--){
    	   if(s[i] == '-'){
    	       if(cnt== k){
    	           cnt=0;
    	           ans+= '-';
    	       }
    	   }else{
    	       if(cnt == k){
    	           ans+= '-';
    	           cnt=0;
    	       }
    	       cnt++;
    	       if(s[i] <= 'z' && s[i] >= 'a'){
    	           ans += char('A' + (s[i]-'a'));
    	       }else{
    	           ans+= s[i];
    	       }
    	   }
    	}
    	if(ans.back() == '-'){
    	    ans.pop_back();
    	}
    	reverse(ans.begin(), ans.end());
    	return ans;
    }
};
