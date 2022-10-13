## Save Your Life

Given a string w, integer array b,  character array x and an integer n. n is the size of array b and array x. Find a substring which has the sum of the ASCII values of its every character, as maximum. ASCII values of some characters are redefined.
Note: Uppercase & lowercase both will be present in the string w. Array b and Array x contain corresponding redefined ASCII values. For each i, b[i] contain redefined ASCII value of character x[i].

Example 1:

```
Input:
W = abcde
N = 1
X[] = { 'c' }
B[] = { -1000 }

Output:
de

Explanation:

Substring "de" has the
maximum sum of ascii value,
including c decreases the sum value

```
Example 2:

```
Input:
W = dbfbsdbf 
N = 2
X[] = { 'b','s' }
B[] = { -100, 45  }

Output:
dbfbsdbf

Explanation:
Substring "dbfbsdbf" has the maximum
sum of ascii value.
```
**Your Task:**
You don't need to read input or print anything. Your task is to complete the function maxSum() which takes string W, character array X, integer array B, integer N as length of array X and B as input parameters and returns the substring with the maximum sum of ascii value.
 

Expected Time Complexity: O(|W|)
Expected Auxiliary Space: O(1)


Constraints:

1<=|W|<=100000
1<=|X|<=52
-1000<=Bi<=1000
