A.sort()
for i in range(n):
chk=X-A[i]
j=i+1
k=n-1
while j<k:
    if A[j]+A[k]==chk:
        return 1
    if A[j]+A[k]>chk:
        k-=1
    if A[j]+A[k]<chk:
        j+=1
return 0
