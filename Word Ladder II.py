class Solution:
    def findLadders(self, beginWord: str, endWord: str, wordList: List[str]) -> List[List[str]]:
            #generate
        Nei = defaultdict(list)
        for word in wordList:
            for i in range(len(word)):
                pattern = word[:i]+'*'+word[i+1:]
                Nei[pattern].append(word)     
        
        #breadth first search + generate parent dictionary with path length limit
        seen = {beginWord:0}
        q = deque([(beginWord,0)])
        minDist = float("inf")
        Parent = defaultdict(set)
        while q:        
            for _ in range(len(q)):
                pre,dis = q.popleft()
                for i in range(len(pre)):
                    pattern = pre[:i] + "*" + pre[i+1:]
                    for neighbor in Nei[pattern]:
                        if neighbor not in seen or (seen[neighbor] == dis + 1 and seen[neighbor] <= minDist):
                            if neighbor == endWord: 
                                minDist = dis + 1
                            Parent[neighbor].add(pre)
                            if neighbor not in seen:   
                                q.append((neighbor,dis+1))
                                seen[neighbor] = dis + 1
								
        #generate path from parent dictionary
        def makeList(cur,Path):
            if cur == beginWord:
                res.append(Path)
            else:
                for parent in Parent[cur]:
                    makeList(parent,[parent] + Path)
        res = []
        makeList(endWord,[endWord])
        
        #return results
        return res
        
