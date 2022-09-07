def isStackPermutation(N, A, B):
        arr = []
        i = j = 0
        while True:
            if arr and arr[-1] == B[j]:
                if j>=len(B): break
                arr.pop()
                j+=1
            else:
                if i>=len(A): break
                arr.append(A[i])
                i+=1
        return 1 if len(arr) == 0 else 0
