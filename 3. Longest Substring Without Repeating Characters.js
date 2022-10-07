// LEETCODE
// Given a string s, find the length of the longest substring without repeating characters.

// -------------------------------------------------------------------------------------------  
// Input: s = "abcabcbb"
// Output: 3
// Explanation: The answer is "abc", with the length of 3.

// -------------------------------------------------------------------------------------------

var lengthOfLongestSubstring = function(s) {
    let start=0;
    let end=0;
    let maxLength=0;
    let uniqueChar=new Set();
    while(end<s.length){
        if(!uniqueChar.has(s[end])){
            uniqueChar.add(s[end])
            end++
            maxLength=Math.max(maxLength,uniqueChar.size)
        } else {
            uniqueChar.delete(s[start])
            start++
        }
    }
    return maxLength;
};

// time complexicity => O(n)
