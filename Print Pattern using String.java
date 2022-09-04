class Solution{
    static List<String> pattern(int n){
        // code here
        List<String> r=new ArrayList<>();
        int first=1;
        int end=n*(n+1);
        int spaces=0;
        for(int i=0;i<n;i++) {
            String res="";
            for(int j=0;j<spaces;j++) {
                res+="-";
            }
            for(int j=first;j<=first+n-i-1;j++) {
                res+=""+j+"*";
            }
            for(int j=end-n+i+1;j<=end;j++) {
                res+=""+j+"*";
            }
            r.add(res.substring(0, res.length()-1));
            spaces+=2;
            first=first+n-i;
            end=end-n+i;
        }
        return r;
    }
}
