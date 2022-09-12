class Solution
{
    public int MinimumExchange(char[][] matrix)
    {
        
        int m = matrix.length , n = matrix[0].length;
        int seq1 = 0 , seq2 = 0;
        
        for(int i = 0 ; i < m ; i++){
            
            for(int j = 0 ; j < n ; j++){
                
                if(matrix[i][j] == 'A'){
                    
                    if((i+j)%2 == 1){
                        
                        seq1++;
                    }
                    
                    else{
                        
                       seq2++; 
                    }
                    
                }
                
                else{
                    
                    if((i+j)%2 == 1){
                        
                        seq2++;
                    }
                    
                    else{
                        
                        seq1++;
                    }
                }
            }
        }
        
        return Math.min(seq1 , seq2);
    }
    
}
