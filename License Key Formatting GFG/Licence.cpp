string ReFormatString(string S, int K){
    	  int len=0;
        string temp="";
        for(int i=0;i<S.size();i++){
            if(isdigit(S[i]) || isalpha(S[i])){
                temp+=toupper(S[i]);
                len++;
            }
        }
        
        if(len<K){
            return temp;
        }
    	string str="";
    	int Size=len%K;
    	int index=0;
    	for(int i=0;i<Size;i++){
    	    str+=toupper(temp[i]);
    	}
    	if(str.size()!=0)
    	str+='-';
    	int j=0;
    	for(int i=Size;i<temp.size();i++){
    	      if(j==K){
    	          str+='-';
    	          j=0;
    	      }
    	        str+=toupper(temp[i]);
    	        j++;
    	        
    	    }
    	    
    	
    	if(str[0]=='-'){
    	    str=str.substr(1);
    	}
    	if(str[str.size()-1]=='-'){
    	    str.pop_back();
    	}
    	return str;
    }

// Approach 2 : 
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
