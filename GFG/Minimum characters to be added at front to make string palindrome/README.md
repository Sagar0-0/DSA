Given string **str** of length **N**. The task is to find the minimum characters to be added at the front to make string palindrome.

**Note**: A palindrome is a word which reads the same backward as forward. Example: "madam".

## Example 1:

```
Input:
S = "abc"

Output: 2

Explanation: 
Add 'b' and 'c' at front of above string to make it
palindrome : "cbabc"

```

## Example 2:

```
Input:
S = "aacecaaa"

Output: 1

Explanation: Add 'a' at front of above string
to make it palindrome : "aaacecaaa"

```

**Your Task:**

You don't need to read input or print anything. Your task is to complete the function **minChar()** which takes a string S and returns an integer as output.

**Expected Time Complexity:** O(N)

**Expected Auxiliary Space:** O(N)

**Constraints:**

1 <= S.length <= 106

