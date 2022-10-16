class Solution:
    def moveToFront(self, head : Optional['Node']) -> Optional['Node']:
        if not head or not head.next: return head
        
        tempNode = Node(0)
        tempNode.next = head
        h1 = head
        while h1.next.next:
            h1 = h1.next
        tempNode.data = h1.next.data
        h1.next = None
        head = tempNode
        return head
