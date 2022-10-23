## Number Formation

Given three integers x, y, and z, the task is to find the sum of all the numbers formed by 
having 4 at most x times, having 5 at most y times, and having 6 at most z times as a digit.

**Note:** Output the sum modulo 109+7.

**Example 1:**

```
Input: X = 1, Y = 1, Z = 1 

Output: 3675

Explanation: 4 + 5 + 6 + 45 + 54 + 56 
+ 65 + 46 + 64 + 456 + 465 
+ 546 + 564 + 645 + 654 = 3675
```
**Example 2:**

```
Input: X = 0, Y = 0, Z = 0

Output: 0

Explanation: No number can be formed

```

***

**Your Task:**  
You don't need to read input or print anything. Complete the function **getSum()** which takes X, Y and Z as input parameters and returns the integer value

**Expected Time Complexity:** O(X*Y*Z)
**Expected Auxiliary Space:** O(X*Y*Z)

Constraints:
0 ≤ X, Y, Z ≤ 60

