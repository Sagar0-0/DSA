class Solution {
    public int numSquares(int n) {
	int sqrt = (int) Math.sqrt(n);

	if (sqrt * sqrt == n) // Perfect square
		return 1;

	while (n % 4 == 0) // 4^a (8b + 7)
		n = n / 4;

	if (n % 8 == 7)
		return 4;

	for (int i = 1; i * i <= n; i++) { // Sum of two perfect squares
		int square = i * i;
		int base = (int) Math.sqrt(n - square);

		if (base * base == n - square)
			return 2;
	}

	return 3;
}
}