class FreqStack {
    Map<Integer,Integer> cnt;//frequency count for every digit
    int max;//max frequency present for any num(we don't know which)
    
    //used to store frequency-wise stacks of inputs.eg.
    //([2,1,2,5,5,5])(1 freq-[2,1,5],2 freq-[2,5],3 freq-[5])
    Map<Integer,ArrayList<Integer>> stack;//stack assigned with num of frequencies
    public FreqStack() {
        //initialise our members
        cnt=new HashMap<>();
        stack=new HashMap<>();
        max=0;
    }
    
    public void push(int val) {
        //increment val count
        int valCnt=cnt.getOrDefault(val,0)+1;
        cnt.put(val,valCnt);
        //if current cal count is more than max
        if(valCnt>max){
            max=valCnt;
            stack.put(max,new ArrayList<>());//add new stack for this new max count
        }
        stack.get(valCnt).add(val);//add this num to its stacks
    }
    
    public int pop() {
        //remove last element of max freq
        int res=stack.get(max).remove(stack.get(max).size()-1);
        cnt.put(res,cnt.get(res)-1);//reduce freq of number
        if(stack.get(max).size()==0){//if now this freq have no num left
            max--;//reduce the freq
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