class Solution:
	# @param A : root node of tree
	# @return a list of integers
	def postorderTraversal(self, A):
		ans=[]
		if A==None:
			return ans
		stack=[(A,0)]
		while len(stack)>0:
			(curr,vis)=stack.pop()
			if vis==1:
				ans.append(curr.val)
			else:
				stack.append((curr,1))
				if curr.right!=None:
					stack.append((curr.right,0))
				if curr.left!=None:
					stack.append((curr.left,0))
		return ans
