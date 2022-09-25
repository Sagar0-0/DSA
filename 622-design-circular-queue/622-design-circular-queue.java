class MyCircularQueue {
    class Node{
        int val;
        Node next;
        boolean canUse;
        Node(){
            val=-1;
            canUse=true;
        }
    }
    Node head;
    Node tail;
    Node curr;
    public MyCircularQueue(int k) {
        head=new Node();
        curr=head;
        tail=head;
        k--;
        while(k-->0){
            Node node=new Node();
            curr.next=node;
            curr=curr.next;
            tail=curr;
        }
        curr=head;
        tail.next=head;
        tail=head;
    }
    
    public boolean enQueue(int value) {
        if(curr.canUse==false)return false;
        curr.val=value;
        curr.canUse=false;
        tail=curr;
        curr=curr.next;
        return true;
    }
    
    public boolean deQueue() {
        if(head.canUse){
            return false;
        }
        head.canUse=true;
        head=head.next;
        return true;
    }
    
    public int Front() {
        if(head.canUse)return -1;
        return head.val;
    }
    
    public int Rear() {
        if(tail.canUse)return -1;
        return tail.val;
    }
    
    public boolean isEmpty() {
        if(curr==head && head.canUse==true){
            return true;
        }
        return false;
    }
    
    public boolean isFull() {
        if(curr==head && curr.canUse==false){
            return true;
        }
        return false;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */