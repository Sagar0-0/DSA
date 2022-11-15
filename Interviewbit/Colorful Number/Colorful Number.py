class Solution:
# @param A : integer
# @return an integer
    def colorful(self, A):
        A=str(A)
        if A=='0' or A=='1':
            return 1
        if len(A)>8:
            return 0
        digitset={ch for ch in A}
        if len(digitset)!=len(A):
            return 0
        if ('1' in digitset) or ('0' in digitset):
            return 0
        if '2' not in digitset:
            return 1

        bigrams={A[i:i+2] for i in range(len(A)-1)}
        if ('23'in bigrams or '32' in bigrams) and '6' in digitset:
            return 0
        if ('24'in bigrams or '42' in bigrams) and '8' in digitset:
            return 0
        if ('26'in bigrams or '62' in bigrams) and ('43' in bigrams or '34' in bigrams):
            return 0
        
        return 1
