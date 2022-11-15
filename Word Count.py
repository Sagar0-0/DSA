class Solution:
    # @param A : string
    # @return an integer
    def solve(self, A):
        list1=A.split(' ')
        i=0
        k=len(list1)
        while i<k:
            if(list1[i]==''):
                list1.pop(i)
                k=len(list1)
            else:
                i=i+1
        return k
