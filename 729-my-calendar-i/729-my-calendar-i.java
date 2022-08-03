class MyCalendar {
    PriorityQueue<int[]> pq;
    public MyCalendar() {
        pq=new PriorityQueue<>((a,b)->a[0]-b[0]);
    }
    
    public boolean book(int start, int end) {
        if(pq.size()==0){
            pq.add(new int[]{start,end});
            return true;
        }
        List<int[]> list=new LinkedList<>();
        boolean toAdd=true;
        while(!pq.isEmpty()){
            int[] iv=pq.remove();
            list.add(iv);
            if(iv[0] < end && start < iv[1]){
                toAdd=false;
                break;
            }
        }
        pq.addAll(list);
        if(toAdd){
            pq.add(new int[]{start,end});
            return true;
        }else{
            return false;
        }
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */