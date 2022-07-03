# Word Break - Part 2
## Hard 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">Given a string <strong>s</strong> and a dictionary of words <strong>dict</strong> of length <strong>n</strong><strong>,</strong> add spaces in <strong>s</strong> to construct a sentence where each word is a valid dictionary word. Each dictionary word can be used more than once. Return all such possible sentences.</span></p>

<p><span style="font-size:18px">Follow examples for better understanding.</span></p>

<p><strong><span style="font-size:18px">Example 1:</span></strong></p>

<pre><span style="font-size:18px"><strong>Input:</strong> s = "catsanddog", n = 5 
dict = {"cats", "cat", "and", "sand", "dog"}
<strong>Output:</strong> (cats and dog)(cat sand dog)
<strong>Explanation:</strong> All the words in the given 
sentences are present in the dictionary.</span></pre>

<p><strong><span style="font-size:18px">Example 2:</span></strong></p>

<pre><span style="font-size:18px"><strong>Input:</strong> s = "catsandog", n = 5
dict = {"cats", "cat", "and", "sand", "dog"}
<strong>Output:</strong> Empty
<strong>Explanation:</strong> There is no possible breaking 
of the string s where all the words are present 
in dict.</span></pre>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You do not need to read input or print anything. Your task is to complete the function <strong>wordBreak()</strong> which takes <strong>n</strong>, <strong>dict</strong> and <strong>s</strong> as input parameters and returns a list of possible sentences. If no sentence is possible it returns an empty list.</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong> O(N<sup>2</sup>*n) where N = |s|<br>
<strong>Expected Auxiliary Space:</strong> O(N<sup>2</sup>)</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤ n ≤ 20<br>
1 ≤ dict[i] ≤ 15<br>
1 ≤ |s| ≤ 500&nbsp;</span></p>
 <p></p>
            </div>