public class Solution {
    public int colorful(int num) {
        Set<Integer> set=new HashSet<>();
        String s=Integer.toString(num);
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(set.contains(product(s,i,j))){
                    return 0;
                }else{
                    set.add(product(s,i,j));
                }
            }
        }
        return 1;
    }
    public int product(String s,int i,int j){
        int product=1;
        int index=i;
        while(index<=j){
            product*=Integer.parseInt(s.charAt(index)+"");
            index++;
        }
        return product;
    }

}
