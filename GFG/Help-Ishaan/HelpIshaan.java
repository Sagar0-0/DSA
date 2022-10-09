class Solution {
	public int NthTerm(int n) {
		//if(isPrime(n)) return 0;
		int i = 0;
		while(true) { // or while(i<=n)
			if(isPrime(n-i) || isPrime(n+i)) {
				break;
			}
			i++;
		}
		return i;
	}
	boolean isPrime(int n) {
		if(n<2) return false;
		for(int i=2; i<=Math.sqrt(n);i++){
			if(n%i==0){
				return false;
			} 
		}
		return true;
	}
}
