class Solution {
    public int maximum69Number (int num) {
        var temp = num;
        int firstDigit = -1;
        for (int i = 0; temp > 0; i++){
            if (temp % 10 == 6){
                firstDigit = i;
            }
            temp /= 10;
        }
        if (firstDigit == -1){
            return num;
        }
        temp = num / (int)Math.pow(10,firstDigit);
        return (temp + 3) * (int)Math.pow(10,firstDigit) + num % (int)Math.pow(10, firstDigit);
    }
}