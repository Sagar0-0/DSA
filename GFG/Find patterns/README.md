## Find patterns

Given two strings S and W. Find the number of times W appears as a subsequence of string S where every character of string S can be included in forming at most one subsequence.
 

**Example 1:**

```

Input: 
 S = "abcdrtbwerrcokokokd" 
 W = "bcd" 
 
Output: 
 2
 
Explanation: 
The two subsequences of string W are
{ S1 , S2 , S3 } and { S6 , S11 , S18 }
(Assuming 0- based indexing).
``` 

**Example 2:**

```
Input: 
S = "ascfret" 
W = "qwer"

Output: 
0

Explanation:
No valid subsequences are possible.
```
***


**Your Task:**  
You don't need to read input or print anything. Your task is to complete the function *numberOfSubsequences()* which takes the string S and string W as input parameters and returns the number of subsequences of string W in string S.

 

**Expected Time Complexity:** O(N^2)
**Expected Auxiliary Space:** O(N)
 

**Constraints:**
1<=|S|<=1000
1<=|W|<=|S|
