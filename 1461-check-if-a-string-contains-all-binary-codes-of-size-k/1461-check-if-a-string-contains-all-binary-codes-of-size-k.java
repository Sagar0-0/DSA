class Solution {
    public boolean hasAllCodes(String s, int k) {
        Set<Integer> set=new HashSet<>();
        int n=s.length();
        for(int i=0;i<=n-k;i++){
            int j=i+k;
            int num=Integer.parseInt(s.substring(i,j),2);
            set.add(num);
        }
        if(set.size()!=(int)Math.pow(2,k))return false;
        return true;
    }
}