class Solution {
    int[] parent = new int[26];
    public int find(int x) {
        // with path compression
        if (parent[x] == x) return x;
        return parent[x] = find(parent[x]);
        // without path compression
        // return parent[x] == x ? x : find(parent[x]);
    }
    // the idea is to put all characters in the same group if they are equal
    // in order to do that, we can use Disjoint Set Union (dsu) aka Union Find
    // for dsu tutorial, please check out https://wingkwong.github.io/leetcode-the-hard-way/tutorials/graph-theory/disjoint-set-union
    public boolean equationsPossible(String[] equations) {
        int n = equations.length;
        // at the beginning, put each character index in its own group
        // so we will have 26 groups with one character each
        // i.e. 'a' in group 0, 'b' in group 1, ..., 'z' in group 25
        for (int i = 0; i < 26; i++) parent[i] = i;
        for (String e : equations) {
            // if two character is equal, 
            if (e.charAt(1) == '=') {
                // e.g. a = b
                // then we group them together
                // how? we use `find` function to find out the parent group of the target character index
                // then update parent. a & b would be in group 1 (i.e. a merged into the group where b belongs to)
                // or you can also do `parent[find(e.charAt(3)- 'a')] = find(e.charAt(0) - 'a');` (i.e. b merged into the group where a belongs to)
                parent[find(e.charAt(0)- 'a')] = find(e.charAt(3) - 'a');
            }
        }
        // handle != case
        for (String e : equations) {
            // if two characters are not equal
            // then which means their parent must not be equal
            if (e.charAt(1) == '!' && find(e.charAt(0) - 'a') == find(e.charAt(3) - 'a')) {
                return false;
            }
        }
        return true;
    }
}