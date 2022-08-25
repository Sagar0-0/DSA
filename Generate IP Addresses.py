class Solution:
    def genIp(self, s):
        n = len(s)
        arr = set()
        if len(s)<4: return []
        for i in range(1, n):
            if int(s[:i]) > 256 or str(int(s[:i])) != s[:i]:
                continue
            for j in range(i+1, n):
                if int(s[i:j]) > 256 or str(int(s[i:j])) != s[i:j]: continue
                for k in range(j+1, n):
                    if int(s[j:k]) > 256 or str(int(s[j:k])) != s[j:k]: continue
                    if int(s[k:]) > 256 or str(int(s[k:])) != s[k:]: continue
                        
                    ipAdd = s[:i] + "." + s[i:j] + "." + s[j:k]+ "." + s[k:]
                    arr.add(ipAdd)
        return list(arr)
