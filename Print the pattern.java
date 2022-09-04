class Solution{
    static List<String> pattern(int n){
        // code here
        int num=1;
        List<String> ans=new ArrayList<>();
        for(int row=0;row<n;row++){
            StringBuilder sb=new StringBuilder();
            
            //print -
            for(int times=0;times<row;times++){
                sb.append("--");
            }
            
            //printing nums
            for(int times=0;times<n-row;times++){
                sb.append(num+"*");
                num++;
            }
            ans.add(sb.toString());
        }
        
        for(int row=n-1;row>=0;row--){
            StringBuilder sb=new StringBuilder(ans.get(row));
            for(int times=0;times<n-row;times++){
                sb.append(num+"*");
                num++;
            }
            sb.deleteCharAt(sb.length()-1);
            ans.set(row,sb.toString());
        }
        return ans;
    }
} 
