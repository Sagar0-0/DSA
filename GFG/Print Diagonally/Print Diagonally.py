def downwardDigonal(N, arr): 
    n = len(arr)
    iBound = 0
    jBound = 0
    N = len(arr)
    ans = []
    while iBound<N:
        i = iBound
        j = jBound
        while i<N and j>=0:
            ans.append(arr[i][j])
            i +=1
            j -=1
            
        jBound += 1
        if jBound == N:
            jBound = N-1
            iBound += 1
    return ans 
