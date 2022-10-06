class TimeValue {
    
    public int time;
    public String value;
    
    public TimeValue(int time, String value) {
        
        this.time = time;
        this.value = value;
    }
    
    public String toString() {
        
        return "TimeValue with time " + this.time 
            + " and value " + this.value;
    }
}

class TimeMap {
    
    private Map<String, List<TimeValue>> map = new HashMap<>();

    public TimeMap() {
        
    }
    
    public void set(String key, String value, int timestamp) {
        
        // Add the given (key, timestamp) combination 
        
        TimeValue newTimeValue = new TimeValue(timestamp, value);
        
        if (!this.map.containsKey(key)) {
            
            this.map.put(key, new ArrayList<>());
        }
        
        this.map.get(key).add(newTimeValue);
        
        // System.out.println(this.map.get(key));
    }
    
    public String get(String key, int timestamp) {
        
        List<TimeValue> list = this.map.get(key);
        
        if (list == null) {
            
            return "";
        }
        
        // Binary search 
        int left = 0;
        int right = list.size() - 1;
        
        TimeValue best = null;
        
        while (left <= right) {
            
            int mid = left + (right - left) / 2;
            
            if (list.get(mid).time <= timestamp) {
                
                // Valid time 
                best = list.get(mid);
                left = mid + 1;
            } else {
                
                right = mid - 1;
            }
        }
        
        return (best != null ? best.value : "");
    }
}