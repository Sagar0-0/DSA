## Print Diagonally

Give a **N * N** square matrix **A**, return all the elements of its **anti-diagonals** from top to bottom.

**Example 1:**
```
Input: 
N = 2
A = [[1, 2],
     [3, 4]]
Output:
1 2 3 4
Explanation: 

```

![ScreenShot2022-10-17at9-1665980852](https://user-images.githubusercontent.com/76674591/196438008-83b2851a-b6b9-4a19-949b-06826956a58e.png)

```
Hence, elements will be returned in the 
order {1, 2, 3, 4}.

```
**Example 2:**

```
Input: 
N = 3 
A = [[1, 2, 3],
     [4, 5, 6],
     [7, 8, 9]]
Output: 
1 2 4 3 5 7 6 8 9
Explanation: 
```

![ScreenShot2022-10-17at9-1665980941](https://user-images.githubusercontent.com/76674591/196438089-a533157f-3d20-4be3-a631-dcb4fda61cff.png)

```
Hence, elements will be returned in 
the order {1, 2, 4, 3, 5, 7, 6, 8, 9}.
```
***

**Your Task:**

You don't need to read input or print anything. Your task is to complete the function **downwardDigonal()** which takes an integer N and a 2D matrix A[ ][ ] as input parameters and returns the list of all elements of its anti-diagonals from top to bottom.

**Expected Time Complexity:** O(N*N)
**Expected Auxillary Space:** O(N*N)

Constraints:
1 ≤ N, M ≤ 103
0 ≤ A[i][j] ≤ 106

