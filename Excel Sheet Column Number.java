class Solution {
    public int titleToNumber(String columnTitle) {
        int ans = 0;
        for(char c : columnTitle.toCharArray()){
            ans = ans * 26 + (int)(c-'A')+ 1;
        }
        return ans;
    }
}

//===========================================================

class Solution {
    public int titleToNumber(String columnTitle) {
        if(columnTitle == null || columnTitle.length() == 0){
            return 0;
        }
        int multipier = 0, result = 0;
        for(int i = columnTitle.length() -1 ; i >= 0 ; i-- ){
            int val = columnTitle.charAt(i) - 'A'+1;
            result = (int) (val * Math.pow(26,multipier)) + result;
            multipier += 1;
            //System.out.println(val+"  result : "+result+"  multipier :"+multipier);
        }
        return result;
    }
}
