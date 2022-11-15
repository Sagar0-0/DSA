//fastest
class Solution {
    public int findMaximumXOR(int[] nums) {
        int max=0,mask=0;
        HashSet<Integer> set=new HashSet<Integer>();
        int maxNum=0;
        for(int i:nums)
            maxNum=Math.max(maxNum,i);
        for(int i=31-Integer.numberOfLeadingZeros(maxNum);i>=0;i--){
            set.clear();
            int bit=1<<i;
            mask=mask|bit;
            int temp=max|bit;
            for(int prefix:nums){
                if(set.contains((prefix & mask)^temp))
                { 
                    max=temp;
                    break;
                }
                set.add(prefix & mask);
            }
        }
        return max;
    }
}





//easy to understand
class Node {
    HashMap<Integer, Node> children;
    Node() {
        this.children = new HashMap<>();
    }
}

class Trie {
    Node root;
    
    Trie() {
        this.root = new Node();
    }
    
    public void insert(int[] A) {
        for(int num : A) {
            Node curr = this.root;
            for(int i=31;i>=0;i--) {
                int currBit = (num >> i) & 1;
                if(!curr.children.containsKey(currBit)) 
                    curr.children.put(currBit, new Node());
                curr = curr.children.get(currBit);
            }
        }
    }
}
class Solution {
    public int findMaximumXOR(int[] nums) {
        Trie trie = new Trie();
        trie.insert(nums);
        
        int max = 0;

        for(int num : nums) {
            Node curr = trie.root;
            int currSum = 0;
            for(int i=31;i>=0;i--) {
                int requiredBit = 1-((num >> i) & 1); // if A[i] is 0, we need 1 and if A[i] is 1, we need 0. Thus, 1 - A[i]
                if(curr.children.containsKey(requiredBit)) {
                    currSum |= (1<<i); // set ith bit of curr result
                    curr = curr.children.get(requiredBit);
                } else {
                    curr = curr.children.get(1-requiredBit);
                }
            }
            max = Math.max(max, currSum); // get max number
        }
        return max;
    }
}
