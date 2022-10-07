from collections import defaultdict

class Solution:
    def countOfSubstrings(self, S, K):
        hashmap = defaultdict(int)
        res = 0
        for c in range(K):
            hashmap[S[c]] += 1
        
        for i in range(K, len(S)):
            if len(hashmap) == K-1:
                res += 1
            
            hashmap[S[i-K]] -= 1
            if hashmap[S[i-K]] == 0:
                del(hashmap[S[i-K]])
            
            hashmap[S[i]] += 1
        
        if len(hashmap) == K-1:
                res += 1
        
        return res
