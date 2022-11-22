class MedianFinder {
    
    ArrayList<Integer> list;

    public MedianFinder() {
        list = new ArrayList<>();
    }
    
    public void addNum(int num) {
        int i;
        if(list.size() > 0){
            for (i = 0; (i < list.size()  && list.get(i) < num); i++);
            if(i == -1){
                i = 0;
            }
            list.add(i , num);
        }else{
            list.add(num);
        }
    }
    
    public double findMedian() {
        // System.out.println(list);
        int index = list.size()/2;
        if(list.size() % 2 == 0){
            return (double) (list.get(index) + list.get(index - 1))/2;
        }else{
            return list.get(index);
        }
        
    }
}