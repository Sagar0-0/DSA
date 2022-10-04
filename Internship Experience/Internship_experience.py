
def internshipExp(d, k, n, minExp, expGained):
	# Write your code here
    ex = []
    for i,j in zip(minExp,expGained):
        ex.append((i,j))
    ex.sort(key=lambda x:x[1],reverse=True)
#     Sorting to get high experience first
    for i in range(k):
        for j in ex:
            if j[0]<=d:
                d+=j[1]
                ex.remove(j)
                break
    return d
