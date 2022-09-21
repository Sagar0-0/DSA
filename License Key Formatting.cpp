class Solution
{
   public:
    string ReFormatString(string S, int K){
    	string str = "", tmp = "";
    	
    	for(int i=S.length()-1; i>=0; i--){
    	    if(tmp.length()==K){
    	        if(str.length()==0) str = tmp;
    	        else str = tmp + "-" + str ;
    	        tmp = "";
    	    }
    	    if(S[i]!='-'){  
    	        char ch;
    	        if(islower(S[i])) ch = toupper(int(S[i]));
    	        else ch = S[i];
    	        tmp = ch + tmp;
    	    }
    	}
    	
    	if(tmp.length()>0){
        	if(str.length()==0) str = tmp;
        	else str = tmp + "-" + str;
    	}
    	
    	return str;
    }
};
