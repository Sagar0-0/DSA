
d={}
l=[]
a1=set(A)
b1=set(B)
c1=set(C)
for i in a1:
    if i not  in d:
        d[i]=1
    pass
for j in b1:
    if j in d:
        d[j]+=1
    pass
for k in c1:
    if k in d:
        d[k]+=1
    pass
for m in d:
    if d[m]==3:
        l.append(m)
    continue
l.sort()
if len(l)==0:
    return [-1]
else:
return l
