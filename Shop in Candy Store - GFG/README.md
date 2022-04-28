# Shop in Candy Store
## Easy 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">In a candy store, there are <strong>N</strong> different types of candies available and the prices of all the N different types of candies are provided to you.<br>
You are now provided with an attractive offer.<br>
You can buy a single candy from the store and get at most <strong>K</strong> other candies ( all are different types ) for free.<br>
Now you have to answer two questions. Firstly, you have to find what is the <strong>minimum amount of money</strong> you have to spend to buy all the<strong> N </strong>different candies. Secondly, you have to find what is the <strong>maximum amount of money</strong> you have to spend to buy all the N different candies.<br>
In both the cases you must utilize the offer i.e. you buy one candy and get <strong>K </strong>other candies for free.</span></p>

<p><strong><span style="font-size:18px">Example 1:</span></strong></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
N = 4
K = 2
candies[] = {3 2 1 4}</span>

<span style="font-size:18px"><strong>Output:</strong>
3 7</span>

<span style="font-size:18px"><strong>Explanation:</strong>
As according to the offer if you buy 
one candy you can take at most two 
more for free. So in the first case, 
you buy the candy which costs 1 and 
takes candies worth 3 and 4 for free, 
also you buy candy worth 2 as well.
So <strong>min cost</strong> : 1+2 =3.
In the second case, you can buy the 
candy which costs 4 and takes candies 
worth 1 and 2 for free, also you need 
to buy candy worth 3 as well. 
So <strong>max cost :</strong> 3+4 =7.</span></pre>

<p><strong><span style="font-size:18px">Example 2:</span></strong></p>

<pre><span style="font-size:18px"><strong>Input:</strong> </span>
<span style="font-size:18px">N = 5
K = 4</span>
<span style="font-size:18px">candies[] = {3 2 1 4 5}
</span><span style="font-size:18px"><strong>
Output:</strong> </span>
<span style="font-size:18px">1 5

<strong>Explanation:
</strong></span><span style="font-size:18px">For minimimum cost buy the candy with
the cost 1 and get all the other candies
for free.
For maximum cost buy the candy with
the cost 5 and get all other candies
for free.</span>
</pre>

<p><span style="font-size:18px"><strong>Your Task:&nbsp;&nbsp;</strong></span><br>
<span style="font-size:18px">You don't need to read input or print anything. Your task is to complete the function <strong>candyStore()</strong>&nbsp;which takes the array candies[], its size N<strong>&nbsp;</strong>and an integer K<strong>&nbsp;</strong>as input parameters&nbsp;and returns the minimum amount and maximum amount of money to buy all candies according to the offer.<br>
<br>
<strong>Expected Time Complexity:</strong> O(NLogN)<br>
<strong>Expected Auxiliary Space:</strong> O(1)</span></p>

<p><br>
<span style="font-size:18px"><strong>Constraints:</strong><br>
1 &lt;=&nbsp;<strong>N&nbsp;</strong>&lt;= 100000<br>
&nbsp;0 &lt;= <strong>K</strong> &lt;= N-1<br>
1 &lt;= <strong>candies[i]</strong>&nbsp;&lt;= 10000</span></p>
 <p></p>
            </div>