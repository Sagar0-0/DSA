public class Solution {
    public String getPermutation(int A, int B) {
        B--;
        
        int[] fact = new int[A];
        fact[0] = 1;
        for (int i = 1; i < A; i++) {
            fact[i] = i * fact[i - 1];
            if (fact[i] > B) {
                Arrays.fill(fact, i, A, B + 1);
                break;
            }
        }

        List<Integer> dig = new ArrayList<>();
        for (int i = 1; i <= A; i++)
            dig.add(i);

        StringBuilder res = new StringBuilder();
        
        for (; A > 0; A--) {
            int pos = (B / fact[A - 1]);
            res.append(dig.get(pos));
            dig.remove(pos);
            B = (B % fact[A - 1]);
        }

        return res.toString();
    }
}

