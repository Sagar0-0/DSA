class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int ans=0;
        Arrays.sort(tokens); //sorted the tokens as in question they mentioned to take in any order
        int i=0, j=tokens.length-1, steps=0;
        while(i<=j) {
            if(tokens[i]<=power) { //if current value is less than equal to power we reduce power and increase steps   
                power-=tokens[i];  
                steps+=1;
                i+=1;
            }
            else {     //else we need to increase power to continue further
                if(steps>0) {    //if steps > 0, we can increase power and reduces steps by 1
                    power+=tokens[j];
                    j-=1;
                    steps-=1;
                }
                else { // if steps ==0 , we cannot increase power according to question and we cannot increase power. As array is sorted, we cannot increase steps as power is less than all other tokens hence break loop
                    break;
                }                
            }     
            ans=Math.max(ans, steps);  // At each step calculate max Ans as we no need to consider all the tokens
        }
        return ans;
        
    }
}
