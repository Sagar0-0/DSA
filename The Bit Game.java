class Solution {
    public static int swapBitGame(long N) {
        // code here
        boolean player = false;
        StringBuilder sb = new StringBuilder(Long.toBinaryString(N));
        int strLen = sb.length(); 
        int counter = 0;
        while(counter < strLen){
            if(sb.charAt(counter) == '1'){
                player = !player;
            }
            counter++;
        }
        return player == false ? 2 : 1;
    }
}
