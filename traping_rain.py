arr=[]
mx=-99999
l1=[]
l2=[]
for i in arr:
    mx=max(mx,i)
    l1.append(mx)
mx=-9999
for j in reversed(arr):
    mx=max(mx,j)
    l2.append(mx)
l2.reverse()
res=0
l3=[]
for k,m in zip(l1,l2):
    l3.append(min(k,m))
for n,p in zip(l3,arr):
    c=n-p
    res+=c
return res
