// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
    int i;
    ArrayList<Integer> arr;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
	    arr=new ArrayList<>();
        while(iterator.hasNext()){
            arr.add(iterator.next());
        }
        i=0;
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return arr.get(i);
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    int val=arr.get(i);
        i++;
        return val;
	}
	
	@Override
	public boolean hasNext() {
	    return i<arr.size();
	}
}