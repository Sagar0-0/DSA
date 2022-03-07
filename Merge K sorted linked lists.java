class Solution
{
    Node mergeKList(Node[]arr,int K){
        PriorityQueue<Node> pq = new PriorityQueue<>((a,b) -> a.data - b.data);
        for(int i = 0 ; i < arr.length ; ++i){
            if(arr[i] != null){
                pq.add(arr[i]);
            }
        }
        Node head = null , curr = null ; 
        while(!pq.isEmpty()){
            Node temp = pq.poll();
            if(head == null){
                head = curr = temp;
            }
            else{
                curr.next = temp;
                curr = curr.next;
            }
            if(temp.next != null){
                pq.add(temp.next);
            }
        }
        return head;
    }
}
