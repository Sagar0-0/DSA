class Solution:
    def findMaxScore(self, root):
        ans = []
        temp = 1
        def recur(root,temp):
            temp = temp*root.data
            if root.left == None and root.right == None:
                ans.append(temp)
            if root.left:
                recur(root.left,temp)
            if root.right:
                recur(root.right,temp)
        recur(root,temp)
        return max(ans)
