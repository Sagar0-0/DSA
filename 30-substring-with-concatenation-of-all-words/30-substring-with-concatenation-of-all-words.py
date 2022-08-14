class Solution:
    def findSubstring(self, s: str, words: List[str]) -> List[int]:

        words_counter = Counter(words)
        WORDLEN = len(words[0])
        MATCHLEN = (len(words) - 1) * WORDLEN

        res = []
        stack = deque()
        
        for offset in range(WORDLEN):
            counter = words_counter.copy()
            for i in range(offset, len(s), WORDLEN):
                word = s[i: i + WORDLEN]
                while len(stack) and word not in counter:
                    prev = stack.popleft()
                    if prev == word:
                        stack.append(word)
                        break
                    counter[prev] += 1
                
                if word in counter:
                    counter[word] -= 1
                    stack.append(word)
                    if counter[word] == 0:
                        del counter[word]
                    
                if len(counter) == 0:
                    res.append(i - MATCHLEN)
                    
            stack.clear() # Clears stack in the cases there are left overs from previous offset
                
        return res
