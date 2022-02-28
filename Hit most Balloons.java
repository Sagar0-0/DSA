class Solution {
    public int mostBalloons(int N, int arr[][]) {
        int ans=0;
        for(int i=0;i<N;i++){
            int x1=arr[i][0],y1=arr[i][1];
            HashMap<Double,Integer> hm=new HashMap<>();
            int count=0;
            for(int j=0;j<N;j++){
                int x2=arr[j][0],y2=arr[j][1];
                if(x1==x2 && y1==y2){
                    count++;
                    continue;
                }
                double tan_theta=(y2-y1)/(1.0*(x2-x1));
                hm.putIfAbsent(tan_theta,0);
                hm.put(tan_theta,hm.get(tan_theta)+1);
            }
            for(double z:hm.keySet())
                ans=Math.max(ans,count+hm.get(z));
        }
        return ans;
    }
}
