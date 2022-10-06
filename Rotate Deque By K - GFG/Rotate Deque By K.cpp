/*
Rotate Deque By K -> EASY GFG Problem 

Given a Deque deq of size N containing non-negative integers and a positive integer K, the task is to rotate elements of the deque by K places in a circular fashion. There will be two rotations which you have to implement depending on the type rotating query. Below is the description of rotating type and value of K for which you have to rotate in circular way:
Type-1. right_Rotate_Deq_ByK(): this function should rotate deque by K places in a clockwise fashion.
Type-2. left_Rotate_Deq_ByK(): this function should rotate deque by K places in an anti-clockwise fashion.

Your Task:
Since this is a functional problem you don't have to worry about the input. You just have to complete the functions right_Rotate_Deq_ByK() and left_Rotate_Deq_ByK() takes dequeue, size of dequeue, and a value K as input parameters and perform the operations. The functions are of a void type so don't return anything. The updated deque will be printed by the driver code.

Expected Time Complexity: O(N)
Expected Auxilliary Space: O(1)

Constraints:
1 ≤ N ≤ 105

*/



//{ Driver Code Starts
//Initial Template for C++


#include<bits/stdc++.h>
using namespace std;


// } Driver Code Ends
//User function Template for C++

//Function to rotate deque by k places in anti-clockwise direction.
void left_Rotate_Deq_ByK(deque<int> &deq, int n, int k)
{
    // your code here
     for(int i = 0 ; i < k ; i++)
     {
       deq.push_back(deq.front());
       deq.pop_front();
     }
  
}

//Function to rotate deque by k places in clockwise direction.
void right_Rotate_Deq_ByK(deque<int> &deq, int n, int k)
{
    // your code here
  void right_Rotate_Deq_ByK(deque<int> &deq, int n, int k)

{

    // your code here

    

    for(int i = 0 ; i < k ; i++)
    {
        deq.push_front(deq.back());
        deq.pop_back();
    }

}
}
