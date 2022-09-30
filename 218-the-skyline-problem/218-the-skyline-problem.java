class Solution {
    public List<List<Integer>> getSkyline(int[][] buildings) {
        List<Pair> list = new ArrayList<>();
        
        for(int i=0;i<buildings.length;i++){
            int sp = buildings[i][0];       //start point
            int ep = buildings[i][1];       //end point
            int ht = buildings[i][2];       //height
            
            list.add(new Pair (sp, -ht));//add point (height as negative bez start of the rectangle)
            list.add(new Pair (ep, ht));//add point (height as positive bez end of the rectangle
        }
        
        Collections.sort(list);     //sort in ascending
         List<List<Integer>> res= new ArrayList<>();    //store result
        
        //for storing the heights
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());      //max heap
        
        int currheight =0;
        pq.add(0);      //add the base height;
        
        for(int i=0;i<list.size();i++){     //looping through the all points in the list
            int x= list.get(i).x;
            int ht = list.get(i).ht;
            
            if(ht<0){           //if height is negative means it is start point of rectangle      
                pq.add(-ht);    //therefore add it in heap
            }else{
                pq.remove(ht);   //if it is not start then remove it from heap
            }
            
            if(currheight != pq.peek()){    
                List<Integer> temp = new ArrayList<>(); 
                
                temp.add(x);            //add left coordinate
                temp.add(pq.peek());    //add maximum height in the heap
                
                res.add(temp);          
                currheight = pq.peek();     //update current height as peak of the heap
            }
            
        }
        
        return res;     //return result;
        
    }
    
    public class Pair implements Comparable<Pair>{
        int x;
        int ht;
        
        public Pair(int x, int ht){
            this.x=x;
            this.ht=ht;
        }
        
        public int compareTo(Pair o){
            if(this.x != o.x){
                return this.x -o.x;
            }
            else{
                return this.ht - o.ht;
            }
        }
    }
}