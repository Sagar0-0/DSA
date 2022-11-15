class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (o1, o2) -> o1[0] != o2[0] ? o2[0] - o1[0] : o1[1] - o2[1]);
        List<int[]> tempRes = new LinkedList<>();
        for (int[] person : people) {
            tempRes.add(person[1], person);
        }
        return tempRes.toArray(new int[people.length][]);
    }
}