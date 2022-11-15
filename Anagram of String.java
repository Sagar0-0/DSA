class GfG
{
	public int remAnagrams(String s,String s1){
        //add code here.
        int[]fq=new int[26];
        for(char c:s.toCharArray()){
            fq[c-'a']++;
        }
        for(char c:s1.toCharArray()){
            fq[c-'a']--;
        }
        int ans=0;
        for(int i:fq){
            ans+=Math.abs(i);
        }
        return ans;
    }
}
