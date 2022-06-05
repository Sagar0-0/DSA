# Bike Racing
## Hard 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">Geek is organising a bike race with N bikers. The initial speed of the ith biker is denoted by H<sub>i</sub> Km/hr and the acceleration of ith biker as A<sub>i</sub> Km/Hr2. A biker whose speed is 'L' or more, is considered be a fast biker. The total speed on the track for every hour is calculated by adding the speed of each fast biker in that hour. When the total speed on the track is 'M' kilometers per hour or more, the safety alarm turns on.&nbsp;<br>
Find the minimum number of hours after which the safety alarm will start.</span></p>

<p><br>
<span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input: </strong>
N = 3, M = 400, L = 120
H = {20, 50, 20}
A = {20, 70, 90}
<strong>Output:</strong> 3
<strong>Explaination: </strong>
Speeds of all the Bikers at ith hour
Biker1= [20  40  60  80 100] 
Biker2= [50 120 190 260 330]
Biker3= [20 110 200 290 380] </span>

<span style="font-size:18px">Initial Speed on track  = 0 
because none of the biker's speed is fast enough.
Speed on track after 1st Hour= 120
Speed on track after 2nd Hour= 190+200=390
Speed on track after 3rd Hour= 260+290=550
Alarm will start at 3rd Hour.</span></pre>

<p><br>
<span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input: </strong>
N = 2, M = 60, L = 120
H = {50, 30}
A = {20, 40}
<strong>Output:</strong> 3
<strong>Explaination: </strong>
Speeds of all the Bikers at ith hour
Biker1= [50 70  90 110 130] 
Biker2= [30 70 110 150 190]</span>

<span style="font-size:18px">Initial Speed on track = 0 because none of the 
biker's speed is fast enough.
Speed on track at 1st Hour= 0
Speed on track at 2nd Hour= 0
Speed on track at 3rd Hour= 150
Alarm will buzz at 3rd Hour.</span></pre>

<p><br>
<span style="font-size:18px"><strong>Your Task:</strong><br>
You do not need to read input or print anything. Your task is to complete the function <strong>buzzTime() </strong>which takes N, M, L and array H and array A as input parameters and returns the time when alarm buzzes.</span></p>

<p><br>
<span style="font-size:18px"><strong>Expected Time Complexity:</strong> O(N*log(max(L,M)))<br>
<strong>Expected Auxiliary Space: </strong>O(1)</span></p>

<p><br>
<span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤ N ≤ 10<sup>5</sup><br>
1 ≤ L, M ≤ 10<sup>10</sup><br>
1 ≤ H<sub>i</sub>, A<sub>i</sub> ≤ 10<sup>9</sup> &nbsp;</span></p>
 <p></p>
            </div>