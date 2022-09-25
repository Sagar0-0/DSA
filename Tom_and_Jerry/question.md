Tom and Jerry
EasyAccuracy: 72.0%Submissions: 7385Points: 2
Tom and Jerry being bored in this pandemic, decides to play a game. Given an integer N. On each player's turn, that player makes a move by subtracting a divisor of current N (which is less than N) from current N, thus forming a new N for the next turn. The player who does not have any divisor left to subtract loses the game.

The game begins with Tom playing the first move. Both Tom and Jerry play optimally. The task is to determine who wins the game. Return 1 if Tom wins, else return 0.

Example 1:

Input:
N = 2
Output:
1
Explanation:
Tom subtracts 1 from N to make N = 1.
Now, Jerry isn't left with any possible
turn so Tom wins the game, and therefore
the Output is 1.
Example 2:

Input:
N = 4
Output:
1
Explanation:
1st turn: Tom subtract 1 from N as 1 is 
a divisor of 4 and less than 4.

2nd turn: N=3, Jerry has to subtract 1 as 1 
is the only divisor of 3 which is less than 3.

3rd turn: N=2, Tom subtract 1 as 1 is the 
only divisor of 2 which is less than 2.

4th turn: N=1, Jerry can't subtract any value.
So, Tom wins.
 

Your Task:
You don't need to read input or print anything. Your task is to complete the function numsGame() which takes an Integer N as input and returns 1 if Tom wins else returns 0.

Expected Time Complexity: O(1)
Expected Auxiliary Space: O(1)