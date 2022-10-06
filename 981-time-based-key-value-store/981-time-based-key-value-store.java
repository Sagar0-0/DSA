class TimeMap {
    Map<String,Map<Integer,String>> map;
    public TimeMap() {
        map=new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        map.putIfAbsent(key,new HashMap<>());
        map.get(key).put(timestamp,value);
    }
    
    public String get(String key, int timestamp) {
        if(map.containsKey(key)){
            Map<Integer,String> curr=map.get(key);
            while(timestamp>=1){
                if(curr.containsKey(timestamp)){
                    return curr.get(timestamp);
                }
                timestamp--;
            }
            return "";
        }
        return "";
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */