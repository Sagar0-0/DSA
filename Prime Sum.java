public class Solution {
    static boolean[] prime(int n) {
        boolean isPrime[]=new boolean[n+1];
        isPrime[0]=true;
        isPrime[1]=true;
        for(int i=2;i<=Math.sqrt(n);i++) {
            for(int j=2*i;j<=n;j+=i) {
                isPrime[j]=true;
            }
        }
        return isPrime;
    }
    public ArrayList<Integer> primesum(int A) {
        ArrayList<Integer> al=new ArrayList<>();
        boolean a[]=prime(A);
        for(int i=2;i<=A;i++){
            if(a[i]==false && a[A-i]==false){
                al.add(i);
                al.add(A-i);
                break;
            }   
        }
        return al;
    }
}
