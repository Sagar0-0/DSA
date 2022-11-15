class Solution {
    public int minimumLengthEncoding(String[] words) {
        Trie trie = new Trie();
        int sum = 0;
        Arrays.sort(words, (s1, s2) -> s2.length() - s1.length());
        for (String word : words) {
            boolean isNew = trie.insert(word);
            if (isNew) {
                sum += word.length() + 1;
            }
        }
        return sum;
    }
}

// 定义tire
class Trie {
    
    TrieNode root;
    
    public Trie() {
        root = new TrieNode();
    }

    public boolean insert(String word) {
        boolean isNew = false;
        TrieNode node = root;
        for (int i = word.length() - 1; i >= 0; --i) {
            int index = word.charAt(i) - 'a';
            if (node.children[index] == null) {
                isNew = true;
                node.children[index] = new TrieNode();
            }
            node = node.children[index];
        }
        return isNew;
    }
}

class TrieNode {
    TrieNode[] children = new TrieNode[26];

    public TrieNode() {}
}