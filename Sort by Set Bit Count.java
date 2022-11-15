class Compute  
{ 
    static void sortBySetBitCount(Integer arr[], int n)
    { 
        // Your code goes here
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return countSetBits(o2)-countSetBits(o1);
            }
        });
    }
    static int countSetBits(int n)
    {
        int count = 0;
        while (n > 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }
==========================================================================
    class Compute  
{ 
    static void sortBySetBitCount(Integer arr[], int n)
    { 
        // Your code goes here
        Arrays.sort(arr,(o1,o2)-> Integer.bitCount(o2)-Integer.bitCount(o1));
    }
}
