public class Solution {
    public int solve(String str) {
        int n = str.length();
 
        int c=0;
        boolean table[][] = new boolean[n][n];
 
        // All substrings of length 1 are palindromes
        //int maxLength = 0;
        for (int gap = 0; gap < n; gap++)
        {
          for (int i = 0,j=gap; j < n ; i++,j++)
          {
            if(gap==0)
            {
                table[i][j]=true;
            }
            else if(gap==1)
            {
            if (str.charAt(i) == str.charAt(j)) 
                table[i][j] = true;
                
            else
                table[i][j]=false;
            }
            else
            {
                if (table[i + 1][j - 1]==true && str.charAt(i) == str.charAt(j)) 
                    table[i][j] = true;
                    else
                        table[i][j]=false;
 
            }
            if(table[i][j])
                 c++;
                 
            }
        }        
        return c;

    }
}

