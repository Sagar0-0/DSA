// { Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
import java.lang.*;

class Node {
    int data;
    Node next;
    Node(int key) {
        data = key;
        next = null;
    }
}

class Partition {
    static Node head;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            Node tail = head;
            for (int i = 1; i < n; i++) {
                int a = sc.nextInt();
                // addToTheLast(new Node(a));
                tail.next = new Node(a);
                tail = tail.next;
            }

            int k = sc.nextInt();
            Solution ob = new Solution();
            Node res = ob.partition(head, k);
            printList(res);
            System.out.println();
        }
    }

    public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
}// } Driver Code Ends


// User function Template for Java

/*class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

*/

class Solution {
    public static Node partition(Node node, int x) {
        Queue<Node> fis=new LinkedList<>();
        Queue<Node> sec=new LinkedList<>();
        Queue<Node> thir=new LinkedList<>();
        Node temp=node;
        while(temp!=null){
            if(temp.data<x){
                Node curr=temp;
                temp=temp.next;
                curr.next=null;
                fis.add(curr);
            }else if(temp.data==x){
                Node curr=temp;
                temp=temp.next;
                curr.next=null;
                sec.add(curr);
            }else{
                Node curr=temp;
                temp=temp.next;
                curr.next=null;
                thir.add(curr);
            }
        }
        Node head=new Node(-1);
        temp=head;
        while(fis.size()>0){
            temp.next=fis.remove();
            temp=temp.next;
        }
        while(sec.size()>0){
            temp.next=sec.remove();
            temp=temp.next;
        }
        while(thir.size()>0){
            temp.next=thir.remove();
            temp=temp.next;
        }
        return head.next;
    }
}