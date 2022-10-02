class LUPrefix {
    int count=0;
            boolean [] arr;    
        public LUPrefix(int n) {
    arr=new boolean[n];
            
        }
        
        public void upload(int video) {
            
            
            arr[video-1]=true;
            while(count<arr.length && arr[count]){
                count++;
            }
                
        }
        
        public int longest() {
            return count;
            
            
        }
    }
    
    /**
     * Your LUPrefix object will be instantiated and called as such:
     * LUPrefix obj = new LUPrefix(n);
     * obj.upload(video);
     * int param_2 = obj.longest();
     */