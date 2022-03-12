class Solution {
    public Node copyRandomList(Node head) {
        if (head == null){
            return null;
        }
        
        Node curr = head;
        while (curr != null){
            Node tmp = curr.next;
            curr.next = new Node(curr.val);
            curr.next.next = tmp;
            curr = tmp;
        }
        
        curr = head;
        while (curr != null){
            if (curr.random != null){
                curr.next.random = curr.random.next;
            } 
            curr = curr.next.next;
        }
        //extract the copy Node
        Node newHead = new Node(0);
        curr = head;
        Node p = newHead;
        while (curr != null){
            Node tmp = curr.next.next;
            p.next = curr.next;
            curr.next = tmp;
            curr = curr.next;
            p = p.next;
        }
        return newHead.next;
    }
}
