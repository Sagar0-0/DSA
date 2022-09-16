### Number of Ways to Arrive at Destination

**Medium**Accuracy: **48.81%**Submissions: **127**Points: **4**

You are in a city that consists of `n` intersections numbered from `0` to `n - 1` with **bi-directional** roads between some intersections. The inputs are generated such that you can reach any intersection from any other intersection and that there is at most one road between any two intersections.

You are given an integer `n` and a 2D integer array `roads` where `roads[i] = [u<sub>i</sub>, v<sub>i</sub>, time<sub>i</sub>]` means that there is a road between intersections `u<sub>i</sub>` and `v<sub>i</sub>` that takes `time<sub>i</sub>` minutes to travel. You want to know in how many ways you can travel from intersection `0` to intersection `n - 1` in the  **shortest amount of time** .

Return  *the **number of ways** you can arrive at your destination in the **shortest amount of time*** . Since the answer may be large, return it **modulo** `10<sup>9</sup> + 7`.

```
Example:
Input:
n=7, m=10
edges= [[0,6,7],[0,1,2],[1,2,3],[1,3,3],[6,3,3],[3,5,1],[6,5,1],[2,5,1],[0,4,5],[4,6,2]]

Output:
4
Explaination:

The four ways to get there in 7 minutes are:
- 0  6
- 0  4  6
- 0  1  2  5  6
- 0  1  3  5  6


```

**Constraints:**
`1 <= n <= 200<br/>n - 1 <= roads.length <= n * (n - 1) / 2<br/>roads[i].length == 3<br/>0 <= u<sub>i</sub>, v<sub>i</sub> <= n - 1<br/>1 <= time<sub>i</sub> <= 10<sup>9</sup><br/>u<sub>i </sub>!= v<sub>i</sub>`
There is at most one road connecting any two intersections.
You can reach any intersection from any other intersection.

Expected Time Complexity: O(M * logN + N)
Expected Space Complexity: O(M+N)
