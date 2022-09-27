class Solution {
    public String pushDominoes(String dominoes) {
        int n = dominoes.length();
        char[] dArray = dominoes.toCharArray();
        char start = '.';
        char last = '.';
        int stidx = 0;
        int i = 0;
        while(i<n){
            stidx = i;
            while(i<n && dArray[i]=='.'){
                i++;
            }
            if(i<n){
                last = dArray[i];
            }
            if(i-stidx>0){
                if(start=='R' && last=='L'){
                    int l = stidx;
                    int r = i-1;
                    while(l<r){
                        dArray[l]='R';
                        dArray[r]='L';
                        l++;
                        r--;
                        
                    }
                   
                }
                else if(last=='L'){
                    int l = i-1;
                    while(l>=stidx){
                        dArray[l]='L';
                        l--;
                    }
                }
                else if(start=='R'){
                    int r = stidx;
                    while(r<i){
                        dArray[r]='R';
                        r++;
                    }   
                }
            }
            
            start = last;
            i++;
            last = '.';
        }
        return new String(dArray);
    }
}