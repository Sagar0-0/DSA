class Solution {
    public int countVowelPermutation(int n) {
        int mod=(int)Math.pow(10,9)+7;
        Map<Character,Integer> map=new HashMap<>();
        map.put('a',1);
        map.put('e',1);
        map.put('i',1);
        map.put('o',1);
        map.put('u',1);
        for(int x=2;x<=n;x++){
            int a=((map.get('e') +map.get('i'))%mod +map.get('u'))%mod;
            int e=(map.get('a') +map.get('i'))%mod;
            int i=(map.get('e')+map.get('o'))%mod;
            int o=map.get('i');
            int u=(map.get('i')+map.get('o'))%mod;
            map.put('a',a);
            map.put('e',e);
            map.put('i',i);
            map.put('o',o);
            map.put('u',u);
        }
        
        return
( ((map.get('a')+map.get('e'))%mod + (map.get('i')+map.get('o'))%mod)%mod + map.get('u'))%mod;
    }
}