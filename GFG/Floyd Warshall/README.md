## Floyd Warshall

The problem is to find the shortest distances between every pair of vertices in a given edge-weighted directed graph. The graph is represented as an adjacency matrix of size n*n. Matrix[i][j] denotes the weight of the edge from i to j. If Matrix[i][j]=-1, it means there is no edge from i to j.
Do it in-place.

**Example 1:**

```
Input: matrix = {{0,25},{-1,0}}
```
![WhatsAppImage20221106at82359PM](https://user-images.githubusercontent.com/76674591/200365930-d55ea884-7801-49f7-b06e-bf694223f9d4.jpg)
```
Output: {{0,25},{-1,0}}
```
![WhatsAppImage20221106at82359PM](https://user-images.githubusercontent.com/76674591/200365962-8ac32eb0-a3b2-4f26-87f5-17a9dcdc8a92.jpg)
```
Explanation: The shortest distance between
every pair is already given(if it exists).
```

**Example 2:**

```

Input: matrix = {{0,1,43},{1,0,6},{-1,-1,0}}
```
![WhatsAppImage20221106at83711PM](https://user-images.githubusercontent.com/76674591/200366016-0a4cbfaf-518b-4017-95e6-3350c2c63b13.jpg)
```
Output: {{0,1,7},{1,0,6},{-1,-1,0}}
```
![WhatsAppImage20221106at84031PM](https://user-images.githubusercontent.com/76674591/200366037-b6da38af-f845-48c9-9bba-de345ec295ed.jpg)
```
Explanation: We can reach 2 from 0 as 0->1->2
and the cost will be 1+6=7 which is less than 
43.

```
***

**Your Task:**
You don't need to read, return or print anything. Your task is to complete the function **shortest_distance()** which takes the matrix as input parameter and modifies the distances for every pair in-place.

**Expected Time Complexity:** O(n3)
**Expected Space Complexity:** O(1)

**Constraints:**
1 <= n <= 100
-1 <= matrix[ i ][ j ] <= 1000
