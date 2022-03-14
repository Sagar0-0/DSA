class Solution {
    static int biGraph(int[] arr, int n, int e) {
        if (n == 2 && e == 1) {
            return 1;
        }
        final List<Integer> allEdges = new ArrayList<>(e*2);
        Arrays.stream(arr).forEach(x -> allEdges.add(x));
        for(int i=0; i<n; i++) {
            if (Collections.frequency(allEdges, i) <= 1) {
                return 0;
            }
        }
        return 1;
    }
};
