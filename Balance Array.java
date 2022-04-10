class Solution:
    # @param A : list of integers
    # @return an integer
    def solve(self, A):
            arr=A
            s1=0
            s2=0
            n=len(A)
            s3=0
            s4=0
            for i in range(n):
                if i%2:
                    s2+=arr[i]
                else:
                    s1+=arr[i]
            c=0
            for i in range(n):
                    if i%2:
                        s2-=arr[i]
                        if s2+s4==s1+s3:
                            c+=1
                        s3+=arr[i]
                    else:
                        s1-=arr[i]
                        if s2+s4==s3+s1:
                            c+=1
                        s4+=arr[i]
            return c
