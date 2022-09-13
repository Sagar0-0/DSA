class Solution
{
    public int MinimumExchange(char[][] m)
    {
        char ch = 'A';int c1=0;int c2=0;
      for(int i =0;i<m.length;i++){
          for(int j=0;j<m[0].length;j++){
              if(m[i][j]!=ch) c1++;
              else c2++;
              if(j==m[0].length-1 && m[0].length%2==0)continue;
              if(ch=='A')ch='B';
              else ch='A';
          } }
      return Math.min(c1,c2); 
    }
}