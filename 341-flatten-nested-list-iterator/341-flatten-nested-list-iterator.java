public class NestedIterator implements Iterator<Integer> {
    
    List<Integer> list;
    int index = 0;
    
    public NestedIterator(List<NestedInteger> nestedList) {
        list = new ArrayList<Integer>();
        worker(nestedList);
    }

    void worker(List<NestedInteger> node) {
        if(node==null) {
            return;
        }
        for(NestedInteger next:node) {
            if(next.isInteger()) {
                list.add(next.getInteger());
            } else {
                worker(next.getList());
            }
        }
    }
    
    @Override
    public Integer next() {
        int val = list.get(index);
        index++;
        return val;
    }

    @Override
    public boolean hasNext() {
        return index<list.size();
    }
}