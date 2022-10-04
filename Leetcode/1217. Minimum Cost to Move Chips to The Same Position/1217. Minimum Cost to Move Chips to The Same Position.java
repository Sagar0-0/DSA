class Solution {

public int minCostToMoveChips(int[] position) {
    int even = 0;
    int odd = 0;
    for(int i=0; i<position.length; i++) {
        if(position[i] % 2 == 0){ 
            odd++;
        } else { 
            even++;
     }
    }
    return Math.min(odd, even);
}
}
