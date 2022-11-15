# Finding Profession
## Easy 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">Consider a special family of <strong>Engineers</strong> and <strong>Doctors</strong> with following rules :</span></p>

<ol>
	<li><span style="font-size:18px">Everybody has two children.</span></li>
	<li><span style="font-size:18px">First child of an Engineer is an Engineer and second child is a Doctor.</span></li>
	<li><span style="font-size:18px">First child of an Doctor is Doctor and second child is an Engineer.</span></li>
	<li><span style="font-size:18px">All generations of Doctors and Engineers start with Engineer.</span></li>
</ol>

<p><span style="font-size:18px">We can represent the situation using below diagram:</span></p>

<pre><span style="font-size:18px">                E
           /        \
          E          D
        /   \       /  \
       E     D     D    E
      / \   / \   / \   / \
     E   D D   E  D  E  E  D
</span></pre>

<p><span style="font-size:18px">Given <strong>level</strong> and position(<strong>pos</strong>) of a person in above ancestor tree, find profession of the person.</span></p>

<p><strong><span style="font-size:18px">Example 1:</span></strong></p>

<pre><span style="font-size:18px"><strong>Input:</strong> level = 4, pos = 2
<strong>Output:</strong> Doctor
<strong>Explaination:</strong> It is shown in the tree given 
in question.</span></pre>

<p><strong><span style="font-size:18px">Example 2:</span></strong></p>

<pre><span style="font-size:18px"><strong>Input:</strong> level = 3, pos = 4
<strong>Output:</strong> Engineer
<strong>Explaination:</strong> Already given in the tree in 
question.</span></pre>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You do not need to read input or print anything. Your task is to complete the function <strong>profession()</strong> which takes level and pos as input parameters and returns 'd' if it is a doctor. Otherwise return 'e'. The driver code will output Doctor for 'd' and Engineer for 'e' itself.</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity: </strong>O(log(pos))<br>
<strong>Expected Auxiliary Space:</strong> O(1)</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤ level ≤ 10<sup>9</sup><br>
1 ≤ pos ≤ min(10<sup>9</sup>, 2<sup>level-1</sup>)</span></p>
 <p></p>
            </div>