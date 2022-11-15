# Earthquake and the Paint Shop
## Easy
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Geek's&nbsp;Paint Shop is one of the famous shop in Geekland,&nbsp;but 2014 Earthquake caused disarrangement of the items in his shop. Each item in his shop is a 40-digit alpha numeric code .<br>
Now Chunky wants to retain the reputation of his shop, for that he has to arrange all the distinct items in lexicographical order.<br>
Your task is to arrange the all the distinct items in lexicographical ascending order and print them along with their count.</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
N = 3
A[] =
["2234597891 zmxvvxbcij 8800654113 jihgfedcba",
"1234567891 abcdefghij 9876543219 jihgfedcba",
"2234597891 zmxvvxbcij 8800654113 jihgfedcba"]
<strong>Output:</strong>
1234567891 abcdefghij 9876543219 jihgfedcba 1
2234597891 zmxvvxbcij 8800654113 jihgfedcba 2
<strong>Explanation:</strong>
We have 3 items (40 digit alphanumeric codes) 
here. We arrange the items based on the 
lexicographical order of their alpha-numeric 
code. Distinct items are printed only once. 
The count of the items describes how many 
such items are there, so items that appear 
more than once have their count greater than 1.</span></pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
N = 2
A[] =
["3122049353 onafrnbhtr 9822827304 yzfhdgzcvx", 
"2992299540 lpvkgykmlk 6946169466 vdqwvywwgg", 
<strong>Output:</strong>
2992299540 lpvkgykmlk 6946169466 vdqwvywwgg  1
3122049353 onafrnbhtr 9822827304 yzfhdgzcvx  1
<strong>Explanation:</strong>
Out of the 2 items here no one is repeated.</span></pre>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read input or print anything. Your task is to complete the function <strong>sortedStrings()</strong> which takes an integer <strong>N</strong> and an array of strings <strong>A[ ]</strong> and returns the array in sorted order along with the frequency&nbsp;of each distinct string.</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong>O(NlogN)<br>
<strong>Expected Auxillary Space:</strong>O(N)</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤ N ≤ 10000</span></p>
</div>