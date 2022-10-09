# Majority Element

### Medium

Given an array **A** of **N** elements. Find the majority element in the array. A majority element in an array A of size N is an **element that appears more than N/2 times in the array.**

### Example 1:
<pre>
<strong>Input:</strong>
N = 3 
A[] = {1,2,3} 
<strong>Output:</strong>
-1
<strong>Explanation:</strong>
Since, each element in 
{1,2,3} appears only once so there 
is no majority element.
</pre>

### Example 2:
<pre>
<strong>Input:</strong>
N = 5 
A[] = {3,1,3,3,2} 
<strong>Output:</strong>
3
<strong>Explanation:</strong>
Since, 3 is present more
than N/2 times, so it is 
the majority element.
</pre>



**Your Task:**
The task is to complete the function **majorityElement()** which returns the majority element in the array. If no majority exists, return -1.
 


**Expected Time Complexity:** O(N).

**Expected Auxiliary Space:** O(1).
 


**Constraints:**

1 ≤ N ≤ 107

0 ≤ Ai ≤ 106