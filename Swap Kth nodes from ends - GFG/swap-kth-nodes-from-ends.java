// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Node
{
    int data;
    Node next;
    
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}

class LinkedList
{
    static  Node head;  
    static  Node lastNode;
    
    public static void addToTheLast(Node node)
    {

        if (head == null)
        {
            head = node;
            lastNode = node;
        }
        else
        {
            Node temp = head;
            lastNode.next = node;
            lastNode = node;
        }
    }
    
    public static void main(String args[])
    {
        Scanner sc=  new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n, K;
            n = sc.nextInt();
            K = sc.nextInt();
            
            Node head = null;
            int val = sc.nextInt();
            head = new Node(val);
            addToTheLast(head);
            
            for(int i = 1; i< n; i++)
            {
                val = sc.nextInt();
                addToTheLast(new Node(val));
            }
            
            Node before[] = new Node[n];
            addressstore(before, head);
            GFG obj = new GFG();
            
            head = obj.swapkthnode(head, n, K);
        
           Node after[] = new Node[n];
          addressstore(after, head);
        
        if(check(before, after, n, K) == true)
            System.out.println("1");
        else
            System.out.println("0");
        
        }
    }
    
    static boolean check(Node before[], Node after[], int num, int K)
    {
          if(K > num)
           return true;
           
           return (before[K-1] == after[num - K]) && (before[num-K] == after[K-1]);
              
       
    }
    
    static void addressstore(Node arr[], Node head)
  {
      Node temp = head;
      int i = 0;
      while(temp != null){
        arr[i] = temp;
        i++;
        temp = temp.next;
    }
}
    
}// } Driver Code Ends


//User function Template for Java


/* Linked List Node class
   class Node  {
     int data;
     Node next;
     Node(int data)
     {
         this.data = data;
         next = null;
     }
  }
*/
class GFG{
    //Function to swap Kth node from beginning and end in a linked list.
    Node swapkthnode(Node head, int num, int k){
        // your code here
        if (head == null)return head;
        if (k > num)return head;
        // begining node will be at k
        // end node will be at n - k + 1
        Node x = head;
        Node prevX = null;
        Node y = head;
        Node prevY = null;
        for (int i = 1; i < k; i++) {
            prevX = x;
            x = x.next;
        }
        for (int i = 1; i < num - k + 1; i++) {
            prevY = y;
            y = y.next;
        }
        
        if (prevX != null) {
            prevX.next = y;
        }
        if (prevY != null) {
            prevY.next = x;
        }
        Node temp = x.next;
        x.next = y.next;
        y.next = temp;
        if (k == 1) {
            head = y;
        }
        if (k == num) {
            head = x;
        }
        return head;
    }
}