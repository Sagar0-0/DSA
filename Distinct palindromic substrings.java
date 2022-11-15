class Solution { 
    int palindromeSubStrs(String s) { 
        // code here      
        Set<String> set=new HashSet<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            //even palindromes
            String temp="";
            int left=i;
            int right=i+1;
            while(left>=0 && right<n && s.charAt(left)==s.charAt(right)){
                temp=s.charAt(left)+temp+s.charAt(right);
                set.add(temp);
                left--;
                right++;
            }
            
            //odd palindromes
            temp=s.charAt(i)+"";
            set.add(temp);
            left=i-1;
            right=i+1;
            while(left>=0 && right<n && s.charAt(left)==s.charAt(right)){
                temp=s.charAt(left)+temp+s.charAt(right);
                set.add(temp);
                left--;
                right++;
            }
        }
        return set.size();
    }
} 
