## Number Of Islands

You are given a **n,m** which means the row and column of the 2D matrix and an array of  **size k** denoting the number of operations. Matrix elements is 0 if there is water or 1 if there is land. Originally, the 2D matrix is all 0 which means there is no land in the matrix. The array has k operator and each operator has two integer A[i][0], A[i][1] means that you can change the cell matrix[A[i][0]][A[i][1]] from sea to island. Return how many island are there in the matrix after each operator.You need to return an array of size k.

 

**Example 1:**

```
Input: n = 4
m = 5
k = 4

A = {{1,1},{0,1},{3,3},{3,4}}

Output: 1 1 2 2

Explanation:

0.  00000
    00000
    00000
    00000
1.  00000
    01000
    00000
    00000
2.  01000
    01000
    00000
    00000
3.  01000
    01000
    00000
    00010
4.  01000
    01000
    00000
    00011
 
```
 

**Example 2:**

```
Input: n = 4
m = 5
k = 4
A = {{0,0},{1,1},{2,2},{3,3}}


Output: 1 2 3 4


Explanation:


0.  00000
    00000
    00000
    00000
1.  10000
    00000
    00000
    00000
2.  10000
    01000
    00000
    00000
3.  10000
    01000
    00100
    00000
4.  10000
    01000
    00100
    00010
``` 

***

**Your Task:**
You don't need to read or print anything. Your task is to complete the function **numOfIslands()** which takes an integer **n** denoting no. of rows in the matrix, an integer **m** denoting the number of columns in the matrix and a 2D array of size k denoting  the number of operators.

**Expected Time Complexity:** O(m * n)
**Expected Auxiliary Space:** O(m * n)

**Constraints:**

1 <= n,m <= 100
1 <= k <= 1000
