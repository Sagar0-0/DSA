# [1217. Minimum Cost to Move Chips to The Same Position](https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position/)

## Easy


We have n chips, where the position of the ith chip is position[i].

We need to move all the chips to the same position. In one step, we can change the position of the ith chip from position[i] to:

position[i] + 2 or position[i] - 2 with cost = 0.
position[i] + 1 or position[i] - 1 with cost = 1.
Return the minimum cost needed to move all the chips to the same position.

 

### Example 1:
![image](https://user-images.githubusercontent.com/78613699/193616422-20bfea65-c8a4-4f16-9611-359f03a4c25a.png)



Input: position = [1,2,3]

Output: 1

Explanation: First step: Move the chip at position 3 to position 1 with cost = 0.
Second step: Move the chip at position 2 to position 1 with cost = 1.
Total cost is 1.
### Example 2:
![image](https://user-images.githubusercontent.com/78613699/193616478-5840c53b-0f81-42c9-9439-efb16bb7e1f8.png)


Input: position = [2,2,2,3,3]

Output: 2

Explanation: We can move the two chips at position  3 to position 2. Each move has cost = 1. The total cost = 2.
