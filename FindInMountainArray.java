public class FindInMountainArray {
    public static void main(String[] args) {
        int[] mountainArr = {1,5,2};
        int target = 2;
        System.out.println(findInMountainArray(target, mountainArr));
    }
    static int findInMountainArray(int target, int[] mountainArr) {
        int a = peak(mountainArr);
        int c = binarySearch(target, mountainArr,0,a);
        if (c!=-1)
            return c;
        return binarySearch(target, mountainArr,a,mountainArr.length-1);
    }
    static int peak(int[] mountainArr){
        int start = 0, end = mountainArr.length-1;
        while (start<end){
            int mid = start + (end-start)/2 ;
            if(mountainArr[mid+1]>mountainArr[mid])
                start = mid+1;
            else
                end = mid;
        }
        return start;
    }
    static int binarySearch(int t, int[] a, int start, int end) {
        boolean x = a[start] < a[end];
        while (start<=end){
            int mid = start + (end-start)/2 ;
            if (t<a[mid])
                if (x)
                    end = mid-1;
                else
                    start = mid+1;
            else if (t>a[mid])
                if (x)
                    start = mid+1;
                else
                    end = mid-1;
            else
                return mid;
        }
        return -1;
    }
}
