class Solution {
    public List<List<String>> findDuplicate(String[] paths) {
        Map<String, List<String>> map = new HashMap<>();
        List<List<String>> res = new ArrayList<>();
        for(int i = 0; i < paths.length; i++){
            String s = paths[i];
            String[] str = s.split(" ");
            String prefix = str[0] + "/";
            for(int j = 1; j < str.length; j++){
                String nc = str[j];
                int t = nc.length() - 1;
                while(t >= 0 && nc.charAt(t) != '(') t--;
                String name = nc.substring(0, t);
                String content = nc.substring(t + 1, nc.length() - 1);
                map.computeIfAbsent(content, a -> new ArrayList<>());
                map.get(content).add(prefix + name);
            }
        }
        
        for(String key: map.keySet()){
            if(map.get(key).size() > 1){
                res.add(map.get(key));
            }
        }
        
        return(res);
        
    }
}