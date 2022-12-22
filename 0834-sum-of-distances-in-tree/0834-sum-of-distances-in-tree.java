class Solution {
    public int[] sumOfDistancesInTree(int n, int[][] edges) {
        final int[] parents = buildParents(n, edges);
        final int[] counts = new int[n];
        final int[] childrenCount = new int[n];
        final int[] distanceToChildren = new int[n];
        for (int p : parents) {
        	if (p >= 0) counts[p]++;
        }
        int start = 0, end = 0;
        for (int i = 0; i < parents.length; i++) {
        	if (counts[i] == 0) {
        		q[end++] = i;
        	}
        }
        while (start < end) {
        	final int node = q[start++];
        	final int parent = parents[node];
        	if (parent < 0) break;
        	final int c = childrenCount[node] + 1;
        	childrenCount[parent] += c;
        	distanceToChildren[parent] += distanceToChildren[node] + c;
        	if (--counts[parent] == 0) {
        		q[end++] = parent;
        	}
        }
//        System.out.println("Parents: " + Arrays.toString(parents));
//        System.out.println("ChildrenCount: " + Arrays.toString(childrenCount));
//        System.out.println("distanceToChildren: " + Arrays.toString(distanceToChildren));
        final int root = q[end - 1];
        final int[] r = new int[n];
        r[root] = distanceToChildren[root];
        for (int i = end - 2; i >= 0; i--) {
        	final int node = q[i];
        	final int parent = parents[node];
        	final int minus = childrenCount[node] + 1;
        	r[node] = r[parent] + n - 2 * minus;
        }
        return r;
    }
	
	static final int[] q = new int[30001];
	
	static int[] buildParents(int n, int[][] edges) {
		final int[][] next = buildNext(n, edges);
        final int[] parents = new int[n];
        Arrays.fill(parents, -1);
        int start = 0, end = 0;
        q[end++] = 0;
        while (start < end) {
        	final int parent = q[start++];
        	for (int c : next[parent]) {
        		if (parents[c] < 0) {
        			parents[c] = parent;
        			q[end++] = c;
        		}
        	}
        }
        parents[0] = -1;
        return parents;
	}
	
	static int[][] buildNext(final int n, final int[][] edges) {
		final int[] counts = new int[n];
		for (final int[] e : edges) {
			counts[e[0]]++;
			counts[e[1]]++;
		}
		final int[][] res = new int[n][];
		for (int i = 0; i < n; i++) {
			res[i] = new int[counts[i]];
		}
		for (final int[] e : edges) {
			final int l = e[0];
			final int r = e[1];
			res[l][--counts[l]] = r;
			res[r][--counts[r]] = l;
		}
		return res;
	}
}