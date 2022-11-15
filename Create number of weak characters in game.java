class Solution {
    public int numberOfWeakCharacters(int[][] properties) {

         Arrays.sort(properties, (a,b) -> (a[0] == b[0]) ? Integer.compare(b[1], a[1]) : Integer.compare(a[0], b[0]));

        int noOfWeakCharacters = 0;
        int len = properties.length;
       // improvization here - // we need to keep track of the max value
        int max = properties[len-1][1];

        for(int i = len-2; i>=0 ;i--) {

            if(properties[i][1] < max) {
                noOfWeakCharacters++;
            } else {
                max = properties[i][1];
            }
        }
        return noOfWeakCharacters;
    }
}
