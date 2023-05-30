from collections import defaultdict

class Solution:
    def groupAnagrams(self, strs):
        letters_to_words = defaultdict(list)
        for word in strs:
            letters_to_words[tuple(sorted(word))].append(word)
        return list(letters_to_words.values())