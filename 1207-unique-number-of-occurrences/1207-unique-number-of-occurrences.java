class Solution {
    public boolean uniqueOccurrences(int[] arr) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		for (int num : arr) {
			min = Math.min(min, num);
			max = Math.max(max, num);
		}

		int[] frequency = new int[max - min + 1];
		boolean[] frequency2 = new boolean[arr.length + 1];

		for (int num : arr) {
			frequency[num - min]++;
		}

		for (int num : frequency) {
			if (num > 0) {
				if (frequency2[num]) return false;

				frequency2[num]=true;
			}
		}
		
		return true;
    }
}