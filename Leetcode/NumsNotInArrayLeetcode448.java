import java.util.ArrayList;
import java.util.List;

public class NumsNotInArrayLeetcode448 {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(arr));
    }
    static List<Integer> findDisappearedNumbers(int[] arr) {
        List<Integer> ans = new ArrayList();
        int i = 0;
        while(i < arr.length)
        {
            int actual = arr[i]-1;
            if(arr[i] != arr[actual])
                swap(arr, i, actual);
            else
                i++;
        }
        for(int j = 0; j < arr.length; j++)
        {
            if(arr[j] != j+1)
                ans.add(j+1);

        }
        return ans;
    }

    static void swap(int[] arr, int first, int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
