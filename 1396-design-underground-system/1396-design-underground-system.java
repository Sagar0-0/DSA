class UndergroundSystem {
    class Pair{
        String place;
        int time;
        Pair(String p,int t){
            place=p;
            time=t;
        }
    }
    Map<Integer,Pair> inMap;
    Map<String,ArrayList<Integer>> map;
    public UndergroundSystem() {
        inMap=new HashMap<>();
        map=new HashMap<>();
    }
    
    public void checkIn(int id, String p, int t) {
        inMap.put(id,new Pair(p,t));
    }
    
    public void checkOut(int id, String stationName, int t) {
        Pair pair=inMap.get(id);
        String start=pair.place;
        int inTime=pair.time;
        String route=start+"-"+stationName;
        int avgTime=t-inTime;
        if(map.containsKey(route)){
            ArrayList<Integer> arr=map.get(route);
            arr.add(avgTime);
            map.put(route,arr);
        }else{
            ArrayList<Integer> arr=new ArrayList<>();
            arr.add(avgTime);
            map.put(route,arr);
        }
    }
    
    public double getAverageTime(String start, String end) {
        String route=start+"-"+end;
        ArrayList<Integer> arr=map.get(route);
        int len=arr.size();
        double sum=0;
        for(int i:arr){
            sum+=i;
        }
        return sum/len;
    }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */