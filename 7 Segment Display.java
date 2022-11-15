class Solution {
    static String sevenSegments(String S, int N) {
        int sum=0;
        int nums[]={6,2,5,5,4,5,6,3,7,5};
        for(int i=0;i<N;i++){
            char ch=S.charAt(i);
            int y=Integer.parseInt(ch+"");
            sum+=nums[y];
        }
        int j=1;
        StringBuilder s1=new StringBuilder();
        while(j<N && (sum-6)>=2*(N-j)){
            s1.append("0");
            sum-=6;
            j++;
        }
        while(j<=N && sum>0){
            sum-=2;
            if(j==N && sum!=0){
                sum+=2;
                if(sum==5)
                    s1.append("2");
                else if(sum==4)
                    s1.append("4");
                else if(sum==3)
                    s1.append("7");
                else if(sum==7)
                    s1.append("8");
                break;
            }
            else{
                s1.append("1");
            }
            j++;
        }
        return s1+"";
    }
};
