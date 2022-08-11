# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        
        res = []
        
        # Breadth-First-Search Algo
        
        def traverse(node, i):
            if node:
                if i<len(res):
                    res[i].append(node.val)
                else:
                    res.append([node.val])
                    
                traverse(node.left, i+1)
                traverse(node.right, i+1)
                
                
        traverse(root, 0)
        return res
