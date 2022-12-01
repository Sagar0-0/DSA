class Solution {
    public boolean halvesAreAlike(String s) {
       char[] ch=s.toCharArray();
       int len=s.length();
       int mid=len/2;
       int l=check(ch,0,mid-1);
       int r=check(ch,mid,len-1);
        if(l==r)
        {
            return true;
        }
        return false;
        
    }
    public int check(char[] ch,int start,int end){
        int count=0;
        for(int i=start;i<=end;i++)
        {
            if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U')
            {
               count++; 
            }
         }
        return count;
    }
}