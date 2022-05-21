class Solution {
public int coinChange(int[] coins, int amount) {

    if (coins.length== 0 || amount== 0) {
      return 0;
    }

    int[] table= new int[amount+1];
    Arrays.fill(table, Integer.MAX_VALUE);
    table[0]=0;

    for (int coin : coins) {
        for (int j = coin; j <= amount; j++) {
            int index = j-coin;
            if(table[index] != Integer.MAX_VALUE){
              table[j] = Math.min(table[j], 1+table[index]);
            }
        }
    }
    return (table[amount] == Integer.MAX_VALUE)?-1:table[amount];
  }
}