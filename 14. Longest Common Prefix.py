    def longestCommonPrefix(self, strs: List[str]) -> str:
        sub = ""
        counter = 0
        for i in range(len(strs[0])):
            for j in range(len(strs)):
                if len(strs[j]) <= i:
                    return sub
                if strs[j][i] == strs[0][i]:
                    counter += 1
                    
            if counter == len(strs):
                sub += strs[0][i]
                counter = 0
            else:
                return sub
        return sub
        
        
