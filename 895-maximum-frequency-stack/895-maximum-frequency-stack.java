class FreqStack {
    Map<Integer,Integer> cnt;//frequency count for every digit
    int max;//max frequency present for any num(we don't know which)
    
    Map<Integer,ArrayList<Integer>> stack;//stack assigned with num of frequencies
    public FreqStack() {
        cnt=new HashMap<>();
        stack=new HashMap<>();
        max=0;
    }
    
    public void push(int val) {
        int valCnt=cnt.getOrDefault(val,0)+1;
        cnt.put(val,valCnt);
        if(valCnt>max){
            max=valCnt;
            stack.put(max,new ArrayList<>());
        }
        stack.get(valCnt).add(val);
    }
    
    public int pop() {
        int res=stack.get(max).remove(stack.get(max).size()-1);
        cnt.put(res,cnt.get(res)-1);
        if(stack.get(max).size()==0){
            max--;
        }
        return res;
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */