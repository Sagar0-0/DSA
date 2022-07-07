// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(in.readLine());
            String a[] = in.readLine().trim().split("\\s+");
            int p[] = new int[n];
            for(int i = 0;i < n;i++)
                p[i] = Integer.parseInt(a[i]);
            
            Solution ob = new Solution();
            System.out.println(ob.matrixChainOrder(p, n));
        }
    }
}// } Driver Code Ends


class Solution{
    static char name;
    static String st;
	// Function for printing the optimal
	// parenthesization of a matrix chain product
	static void printParenthesis(int i, int j, int n, int[][] bracket)
	{
		// If only one matrix left in current segment
		if (i == j)
		{
		    st+=name;
		    name++;
			return;
		}

		st+='(';

		// Recursively put brackets around subexpression
		// from i to bracket[j][i].
		// Note that "*((bracket+j*n)+i)" is similar to
		// bracket[i][j]
		printParenthesis(i, bracket[j][i], n, bracket);

		// Recursively put brackets around subexpression
		// from bracket[j][i] + 1 to i.
		printParenthesis(bracket[j][i] + 1, j, n, bracket);

		st+=')';
	}

	// Matrix Ai has dimension p[i-1] x p[i] for i = 1..n
	// Please refer below article for details of this
	// function
	// https://goo.gl/k6EYKj
	static String matrixChainOrder(int p[], int n)
	{
		int[][] m = new int[n][n];
        st = "";
		for (int L = 2; L < n; L++)
		{
			for (int i = 1; i < n - L + 1; i++)
			{
				int j = i + L - 1;
				m[i][j] = Integer.MAX_VALUE;
				for (int k = i; k <= j - 1; k++)
				{

					// q = cost/scalar multiplications
					int q = m[i][k] + m[k + 1][j] + p[i - 1] * p[k] * p[j];
					if (q < m[i][j])
					{
						m[i][j] = q;

						// Each entry m[j,ji=k shows
						// where to split the product arr
						// i,i+1....j for the minimum cost.
						m[j][i] = k;
					}
				}
			}
		}

		// The first matrix is printed as 'A', next as 'B',
		// and so on
		name = 'A';

		printParenthesis(1, n - 1, n, m);
		return st;
	}

}