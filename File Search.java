public class Solution {
    
    public int breakRecords(int A, int[][] B) {
        UnionFind uf = new UnionFind(A);
        
        for (int[] pair : B)
            uf.union(pair[0]-1, pair[1]-1);
        
        return uf.getSets();
    }
}

class UnionFind {
    
    private int[] root;
    private int[] rank;
    private int size;
    
    public UnionFind(int size) {
        this.root = new int[size];
        this.rank = new int[size];
        this.size = size;
        
        for (int i = 0; i < size; i++) {
            root[i] = i;
            rank[i] = 1;
        }
    }
    
    public int find(int x) {
        if (root[x] == x)
            return x;
        return root[x] = find(root[x]);
    }
    
    public void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);
        
        if (rootX != rootY) {
            if (rank[rootX] > rank[rootY])
                root[rootY] = rootX;
            else if (rank[rootX] < rank[rootY])
                root[rootX] = rootY;
            else {
                root[rootY] = rootX;
                rank[rootY]++;
            }
            size--;
        }
    }
    
    public int getSets() {
        return size;
    }
}
