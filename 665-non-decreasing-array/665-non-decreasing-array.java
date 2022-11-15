class Solution {
	public boolean checkPossibility(int[] arr) {
		int index = helper(arr);
		if (index == -1) {
			return true;
		}
		int temp = arr[index];
		arr[index] = arr[index + 1];
		if (helper(arr) == -1) {
			return true;
		}

		arr[index] = temp;
		arr[index + 1] = temp;
		if (helper(arr) == -1) {
			return true;
		}
		return false;
	}

	public int helper(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				return i;
			}
		}
		return -1;
	}
}