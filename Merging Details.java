class Solution {

    public List<List<String>> mergeDetails(List<List<String>> details) {
        // Your code here
        List<List<String>> ans=new ArrayList<>();
        for(int i=0;i<details.size();i++){
            List<String> detail=details.get(i);
            if(detail.size()==0)continue;
            Set<String> set=new TreeSet<>();
            String name=detail.get(0);
            for(int j=1;j<detail.size();j++){
                set.add(detail.get(j));
            }
            for(int j=i+1;j<details.size();j++){
                List<String> curr=details.get(j);
                if(curr.size()==0)continue;
                for(int k=1;k<curr.size();k++){
                    if(set.contains(curr.get(k))){
                        for(int x=1;x<curr.size();x++){
                            set.add(curr.get(x));
                        }
                        curr.clear();
                        break;
                    }
                }
            }
            List<String> merged=new ArrayList<>();
            merged.add(name);
            for(String s:set){
                merged.add(s);
            }
            ans.add(merged);
        }
        return ans;
    }
}
