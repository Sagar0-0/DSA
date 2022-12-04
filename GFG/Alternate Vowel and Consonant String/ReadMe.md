**Alternate Vowel and Consonant String**
--------------------

Given a string **S** of lowercase english characters. Rearrange characters of the given string such that the vowels and consonants occupy alternate positions and the string so formed should be lexicographically (alphabetically) smallest. 
Note: Vowels are 'a', 'e', 'i', 'o' and 'u'. 

**Example 1**:

```
Input:
S = "aeroplane"
Output: alanepero
Explanation: alanepero  
The vowels and cosonants are arranged 
alternatively with vowels shown in bold.
Also, there's no lexicographically smaller
string possible with required conditions.
```

**Example 2**:

```
Input: 
S = "mississippi"
Output: -1
Explanation: The number of vowels is 4 
whereas the number of consonants is 7.
Hence, there's no way to arrange the
vowels and consonants alternatively.
```

**Your Task**:
You don't need to read input or print anything. Your task is to complete the function rearrange() which takes the string S and its size N as inputs and returns the modified string as stated in the description. If such a modification is not possible, return the string "-1".

```
Expected Time Complexity: O(N).
Expected Auxiliary Space: O(2*26).


Constraints:
1 <= N <= 10^6
'a' <= S[ i ] <= 'z'
```
