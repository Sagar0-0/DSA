# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def isPalindrome(self, head: Optional[ListNode]) -> bool:
        if head is None:
            return True
        slow = head
        fast = head
        while fast.next is not None and fast.next.next is not None:
            slow = slow.next
            fast = fast.next.next
        mid = slow.next
        slow.next = None
        prev = None
        while mid is not None:
            temp = mid.next
            mid.next = prev
            prev = mid
            mid = temp
        while prev is not None and head is not None:
            if prev.val != head.val:
                return False
            prev = prev.next
            head = head.next
        return True