Approach 1:
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        TreeMap<Integer,LinkedList<Integer>>map=new TreeMap<Integer,LinkedList<Integer>>();
        
        for(int i=0;i<arr.length;i++){
            int a=(int)Math.abs(arr[i]-x);
            if(map.containsKey(a)){
                LinkedList<Integer>set=map.get(a);
                set.add(arr[i]);
                map.put(a,set);
            }
            else{
                LinkedList<Integer>set=new LinkedList<Integer>();
                set.add(arr[i]);
                map.put(a,set);
            }
        }
        //System.out.println(map);
        List<Integer>list=new ArrayList<Integer>();
        boolean flag=false;
        for(int a:map.keySet()){
            LinkedList<Integer>set=map.get(a);
            for(int b:set){
                list.add(b);
                if(list.size()==k){
                    flag=true;
                    break;
                }
            }
            if(flag==true){
                break;
            }
        }
        Collections.sort(list);
        return list;
    }
}
Time Taken:130ms  

+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

Approach 2:
class Solution {
    public static class Pair implements Comparable<Pair>{
        
    int ele;
    int diff;
    
    public Pair(int a, int b){
        ele=a;
        diff=b;
    } 
    
     public int compareTo(Pair p){
         if((p.diff)==(this.diff)){
             return this.ele-p.ele;
         }
         return this.diff-p.diff;
     }
     
}
    
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
       Pair obj[]=new Pair[arr.length];
       for(int i=0;i<arr.length;i++){
           int a=(int)(Math.abs(arr[i]-x));
           
           obj[i]=new Pair(arr[i],a);
           
       }
        
       Arrays.sort(obj);
       
       List<Integer>aa=new ArrayList<Integer>();
       for(int i=0;i<k;i++){
           aa.add(obj[i].ele);
       } 
        Collections.sort(aa);
        return aa;
        
    }
}

Time Taken:53ms
