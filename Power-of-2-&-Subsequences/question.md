### Power Of 2 and Subsequences

**Medium**Accuracy: **59.92%**Submissions: **1406**Points: **4**

Given is an array** A[]** of size  **N** . Return the number of non-empty subsequences such that the product of all numbers in the subsequence is  **Power of 2** . Since the answer may be too large, return it modulo 10^9^ + 7.

**Example 1:**

<pre><strong><span>Input:</span></strong>
<span>N = 3
A[] = {1, 6, 2}</span>
<strong><span>Output:</span></strong>
<span>3</span>
<span><strong>Explanation:</strong></span>
<span>The subsequence that </span>
<span>can be chosen is {1},</span>
<span>{2} and {1,2}.</span></pre>

**Example 2:**

<pre><strong><span>Input:</span></strong>
<span>N = 3
A[] = {3, 5, 7}</span>
<strong><span>Output:</span></strong>
<span>0</span>
<strong><span>Explanation:</span></strong>
<span>No subsequences exist.</span>
</pre>

**Your Task:**

You don't need to read input or print anything. Your task is to complete the function numberOfSubsequences() which takes an integer N and an array A and returns the number of subsequences that exist. As this number can be very large return the result under modulo 10 ^9^ +7.

**Expected Time Complexity:** O(N)
**Expected Auxiliary Space:** O(1)

**Constraints:**
1 <= N <= 10^5^
1 <= A[i] <= 10^9^
