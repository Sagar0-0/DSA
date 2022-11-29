class RandomizedSet {
    List<Integer> list;
    HashMap<Integer,Integer> map;
    
    public RandomizedSet() {
        list=new ArrayList<>();
        map=new HashMap<>();
    }
    
    public boolean insert(int val) {
        if(!map.containsKey(val)){
            list.add(val);
            map.put(val,list.size()-1);
            return true;
        }
        return false;
    }
    
    // Swap value to be removed with last value. Remove now the value at last 
    // index & update map with new index and remove the value to be removed.
    public boolean remove(int val) {
        if(map.containsKey(val)){
            int index=map.get(val);
            swap(index);
            list.remove(list.size()-1);
            map.remove(val);
            return true;
        }
        return false;
    }
    
    // User defined.
    private void swap(int index) {
        int lastIndex=list.size()-1;
        int lastVal=list.get(lastIndex);
        
        int temp=list.get(index);
        list.set(index,lastVal);
        
        map.put(lastVal,index);
    }
    
    public int getRandom() {
        return list.get(new Random().nextInt(list.size()));
    }
}