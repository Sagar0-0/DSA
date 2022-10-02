
/*Link list node 
struct Node {
	int data;
	struct Node *next;
	Node(int x) {
		data = x;
		next = NULL;
	}
};*/

class Solution
{
    public:
    Node* reverseBetween(Node* head, int m, int n)
    {
        if(head==NULL){
            return head;
        }
        if(head->next==NULL){
            return head;
        }
        Node* curr = head;
        Node* prev = NULL;
        for(int i=1;i!=m;i++){
            prev = curr;
            curr = curr->next;
        }
        Node* temp = prev;
        Node* og = curr;
        for(int i=m;i<=n;i++)
        {
            Node* next = curr->next;
            curr->next = prev;
            prev = curr;
            curr = next;
        }
        og->next = curr;
        if(temp != NULL)
        temp->next = prev;
        if(m == 1)
        return prev;
        else
        return head;
    }
};
