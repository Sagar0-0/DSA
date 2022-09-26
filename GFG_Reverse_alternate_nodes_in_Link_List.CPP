// Reverse alternate nodes in Link List
// https://practice.geeksforgeeks.org/problems/given-a-linked-list-reverse-alternate-nodes-and-append-at-the-end/0
//{ Driver Code Starts
#include<stdio.h>
#include<stdlib.h>
#include<iostream>
using namespace std;
/* A linked list node */


struct Node
{
    int data;
    struct Node *next;
    
    Node(int x){
        data = x;
        next = NULL;
    }
    
};

struct Node *start = NULL;

/* Function to print nodes in a given linked list */
void printList(struct Node *node)
{
    while (node != NULL)
    {
        printf("%d ", node->data);
        node = node->next;
    }
    printf("\n");
    
}

void insert()
{
    int n,value;
    cin>>n;
    struct Node *temp;
    for(int i=0;i<n;i++)
    {
        cin>>value;
        if(i==0)
        {
            start = new Node(value);
            temp = start;
            continue;
        }
        else
        {
            temp->next = new Node(value);
            temp = temp->next;
        }
    }
}


// } Driver Code Ends
/*
  reverse alternate nodes and append at the end
  The input list will have at least one element  
  Node is defined as 
  struct Node
  {
      int data;
      struct Node *next;
    
      Node(int x){
        data = x;
        next = NULL;
      }
    
   };

*/
class Solution
{
    public:
     Node * reverse( struct Node *head){
        Node *prev=NULL,*next=NULL,*current=head;
        int data;
        while(current!=NULL){
            next=current->next;
            current->next=prev;
            prev=current;
            current=next;
            
        }
        head=prev;
        return  head;
    }
    void rearrange(struct Node *head)
    {
        Node* t=head->next,*temp=head->next, *h=head;
        if(temp==NULL){
            return;
        }
        while(temp->next!=NULL){
            h->next=temp->next;
            h=h->next;
            temp->next=h->next;
            temp=temp->next;
             if(temp==NULL or h==NULL){
                break;
            }
        }
        t=reverse(t);
        h->next=t;
        // return head;
        }
        //add code here
    };



   


//{ Driver Code Starts.
int main()
{
    int t;
    cin>>t;
    while (t--) {
        insert();
        Solution ob;
        ob.rearrange(start);
        printList(start);
    }
    return 0;
}

// } Driver Code Ends
