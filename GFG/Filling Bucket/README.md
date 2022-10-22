## Filling Bucket

Given a Bucket having a capacity of N litres and the task is to determine that by how many ways you can fill it using two bottles of capacity of 1 Litre and 2 Litre only. Find the answer modulo 10^8.

**Example 1:**

```
Input:
3

Output:
3 

Explanation:
Let O denote filling by 1 litre bottle and
T denote filling by 2 litre bottle.
So for N = 3, we have :
{OOO,TO,OT}. Thus there are 3 total ways.

```

**Example 2:**

```
Input:
4

Output:
5 

Explanation:
Let O denote filling by 1 litre bottle and
T denote filling by 2 litre bottle.
So for N = 4, we have :
{TT,OOOO,TOO,OTO,OOT} thus there are 5 total ways.

```

***

**Your Task:**
You don't need to read input or print anything. Your task is to complete the function **fillingBucket()** which takes an Integer N as input and returns the number of total ways possible.


**Expected Time Complexity:** O(N)
**Expected Auxiliary Space:** O(N)

**Constraints:**
1 <= N <= 105
