// { Driver Code Starts
import java.util.Scanner;
import java.io.*;
class Node{
    int coeff;
    int pow;
    Node next;
    Node(int a,int b)
    {
        coeff=a;
        pow=b;
        next=null;
    }
}
class GFG2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            Node start1=null,cur1=null,start2=null,cur2=null;
            while(n-->0)
            {
                int a=sc.nextInt();
                int b=sc.nextInt();
                Node ptr=new Node(a,b);
                if(start1==null)
                {
                    start1=ptr;
                    cur1=ptr;
                }
                else{
                    cur1.next=ptr;
                    cur1=ptr;
                }
            }
            n=sc.nextInt();
            while(n-->0)
            {
                int a=sc.nextInt();
                int b=sc.nextInt();
                Node ptr=new Node(a,b);
                if(start2==null)
                {
                    start2=ptr;
                    cur2=ptr;
                }
                else{
                    cur2.next=ptr;
                    cur2=ptr;
                }
            }
            Solution obj=new Solution();
            Node sum = obj.addPolynomial(start1,start2);
            for(Node ptr=sum ; ptr != null; ptr=ptr.next  )
            {
                // printing polynomial
                System.out.print(ptr.coeff + "x^" + ptr.pow);
                if(ptr.next != null)
                System.out.print(" + ");
            }
            System.out.println();
        }
    }
}// } Driver Code Ends


/*class Node{
    int coeff;
    int pow;
    Node next;
    Node(int a,int b)
    {
        coeff=a;
        pow=b;
        next=null;
    }
}*/

//Print the polynomial formed by adding both LL in the function itself.
class Solution
{
    public static Node addPolynomial(Node p1,Node p2)
    {
        //Add your code here.
        Node ans=new Node(-1,-1);
        Node curr=ans;
        Node temp1=p1;
        Node temp2=p2;
        while(temp1!=null && temp2!=null){
            if(temp1.pow==temp2.pow){
                Node newNode=temp1;
                newNode.coeff=temp1.coeff+temp2.coeff;
                temp1=temp1.next;
                temp2=temp2.next;
                newNode.next=null;
                curr.next=newNode;
                curr=curr.next;
            }else if(temp1.pow>temp2.pow){
                Node newNode=temp1;
                temp1=temp1.next;
                newNode.next=null;
                curr.next=newNode;
                curr=curr.next;
            }else{
                Node newNode=temp2;
                temp2=temp2.next;
                newNode.next=null;
                curr.next=newNode;
                curr=curr.next;
            }
        }
        if(temp1!=null){
            curr.next=temp1;
        }else if(temp2!=null){
            curr.next=temp2;
        }
        return ans.next;
    }
}