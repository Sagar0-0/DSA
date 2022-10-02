public class Solution {
    public int minDistance(String A, String B) {
        int[][]list=new int[A.length()][B.length()];
        return editDist(A,B,0,0,list);
    }
    int editDist(String A,String B,int x,int y,int[][]memory){
        if(y==B.length())return A.length()-x;
        if(x==A.length())return B.length()-y;
        int ans=memory[x][y];
        if(ans!=0)return ans;
        if(A.charAt(x)==B.charAt(y)){
            ans=editDist(A,B,x+1,y+1,memory);
        }else{
            ans=1+Math.min(editDist(A,B,x+1,y,memory),Math.min(editDist(A,B,x,y+1,memory),editDist(A,B,x+1,y+1,memory)));
        }
        memory[x][y]=ans;
        return ans;
    }
}
