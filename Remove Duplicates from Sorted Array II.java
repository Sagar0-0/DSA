class Solution {
    public int removeDuplicates(int[] nums) {
        int count=1;
        int i=0;
        int j=1;
        while(j<nums.length){
            if(nums[i]==nums[j]){
                if(count<2){
                    i++;
                    nums[i]=nums[j];
                    count++;
                }
            }else{
                i++;
                count=1;
                nums[i]=nums[j];
            }
            j++;
        }
        return i+1;
    }
}



//====================================================================================
  
//faster
class Solution {
    public int removeDuplicates(int[] nums) {
        int count=0;
        for(int i=1;i<nums.length;i++){
            if(nums[count] != nums[i] || (count-1<0 || nums[count-1] != nums[i])){
                nums[++count] = nums[i];
            } 
        }
        return count+1;
    }
}

//=========================================================
public class Solution {
	public int removeDuplicates(ArrayList<Integer> a) {
        int extras=0;
        int i=0;
        int x=0;
        while(i<a.size()){
            int cnt=1;
            int j=i+1;
            while(j<a.size() && Objects.equals(a.get(j), a.get(i))){
                cnt++;
                j++;
            }
            if(cnt>1){
                a.set(x,a.get(i));
                x++;
                a.set(x,a.get(i));
                x++;
                i=j;
                extras+=cnt-2;
            }else{
                a.set(x,a.get(i));
                x++;
                i=j;
            }
        }
        return a.size()-extras;
	}
}
