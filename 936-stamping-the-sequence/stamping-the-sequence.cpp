// What I basiclly did here is trying to reverse the whole operations.
// The operation token later will be more apperant than the operation token before. The letters which stamped later will cover the letters stamped before and we really don't care about the letters which are covered.

//  *  *  *  *  *  *  *
//  *  *  * |a  b  c  a|
// |a  b  c  a| b  c  a
//  a |a  b  c  a| c  a
// We just try to match the stamp with the target. Since we do not care about the letters which are coverd by others, so we can apply a * match any letters. For example:

// "aabcaca" -> "a****ca" -> "*****ca"->"*******"


class Solution {
public:
    vector<int> movesToStamp(string stamp, string target) {
        vector<int> ans;
        vector<int> output;
        string str = target;
        string aim(target.length(),'*');
        while(str != aim){
            int tmp = remove(str,stamp); // index of first match case when stamp is found in str or target.
            if(tmp == str.length()) return output;
            ans.push_back(tmp);
        }
        for(int iter=ans.size()-1;iter>=0;--iter) output.push_back(ans[iter]);
        return output;
    }
    int remove(string& str, string stamp){
        for(int iter=0;iter<str.length();++iter){
            int jter=0,tmp=iter;
            bool flag=false;
            while(jter<stamp.length() && tmp<str.length() && (str[tmp]=='*' || str[tmp]==stamp[jter])){
                if(str[tmp]==stamp[jter]) flag=true;
                tmp++;
                jter++;
            }
            if(jter==stamp.length() && flag){
                for(int kter=0;kter<stamp.length();++kter)
                    str[iter+kter]='*';
                return iter;
            }
        }
        return str.length();
    }
};
