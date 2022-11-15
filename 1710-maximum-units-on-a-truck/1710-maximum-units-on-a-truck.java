class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int units = 0;
        
        int [] unitsVsBoxesCount = new int[1001];//value = number of boxes with i units per box
        for(int [] boxType : boxTypes) { //O(N)
            unitsVsBoxesCount[ boxType[1] ] += boxType[0];
        }
        for(int i = 1000; i > 0; i--) { //O(1001) = O(1)
            if(unitsVsBoxesCount[i] > truckSize) {
                units += (truckSize * i);
                break;
            } else if (unitsVsBoxesCount[i] > 0) {
                units += (unitsVsBoxesCount[i] * i);
                truckSize -= unitsVsBoxesCount[i];
            }
        }
        return units;
    }
}