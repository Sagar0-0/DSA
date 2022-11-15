class Solution {
    public static ArrayList<Integer> findLeastGreater(int n, int[] arr) {
        // code here
        TreeSet<Integer> set=new TreeSet<>();
        ArrayList<Integer> ans =new ArrayList<>();
        for(int i=n-1;i>=0;i--){
            set.add(arr[i]);
            if(set.higher(arr[i])==null)ans.add(-1);
            else ans.add(set.higher(arr[i]));
        }
        Collections.reverse(ans);
        return ans;
    }
}


// second Method using Binary Search Tree


class Solution {
    static class Node {
        int val;
        Node left;
        Node right;
        Node(int val) {
            this.val=val;
            this.left=null;
            this.right=null;
        }
    }
    public static ArrayList<Integer> findLeastGreater(int n, int[] arr) {
        Node head = null;
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=arr.length-1;i>=0;i--) {
            if(head==null) {
                head=new Node(arr[i]);
            }
            else {
                Node prev=addNodeInBST(arr[i], head, head);
                
                if(prev.val>arr[i]) {
                    prev.left=new Node(arr[i]);
                }
                else {
                    prev.right=new Node(arr[i]);
                }
            }
            
            int max[]=new int[1];
            max[0]=Integer.MAX_VALUE;
            leastGreater(head, max, arr[i]);
            if(max[0]==Integer.MAX_VALUE) {
                arr[i]=-1;
            }
            else {
                arr[i]= max[0];
            }
        }
        
        for(int i=0;i<arr.length;i++) res.add(arr[i]);
        
        return res;
    }
    public static Node addNodeInBST(int val, Node cur, Node prev) {
        if(cur==null) return prev;
        
        if(cur.val>val) {
            return addNodeInBST(val, cur.left, cur);
        }
        else {
           return addNodeInBST(val, cur.right, cur);
        }
    }
    
    public static void leastGreater(Node head, int []max, int value) {
        if(head==null) {
            return ;
        } 
        
        
        if(head.val>value) {
            max[0]=Math.min(max[0], head.val);
        }
        
        if(head.val>value) {
            leastGreater(head.left, max, value);
        }
        else {
            leastGreater(head.right, max, value);
        }
    }
}
        
