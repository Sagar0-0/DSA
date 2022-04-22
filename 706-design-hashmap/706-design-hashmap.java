class MyHashMap {
    int[]map;
    public MyHashMap() {
        map=new int[1000001];
        Arrays.fill(map,-1);
    }
    
    public void put(int key, int value) {
        map[key]=value;
    }
    
    public int get(int key) {
        if(map[key]==-1)return -1;
        return map[key];
    }
    
    public void remove(int key) {
        map[key]=-1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */