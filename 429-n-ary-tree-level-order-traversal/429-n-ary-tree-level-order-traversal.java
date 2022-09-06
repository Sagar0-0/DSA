/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> list=new ArrayList<>();
        if(root==null)return list;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> l=new ArrayList<>();
            for(int i=0;i<size;i++){
                Node temp=q.poll();
                l.add(temp.val);
                for(Node node: temp.children){
                    q.add(node);
                }
            }
            list.add(l);
            
        }
        return list;
    }
}

Approach 2 by @Jay-Thesia:


class Solution {
    public List<List<Integer>> levelOrder(Node root) {

        List<List<Integer>> outter=new ArrayList<>();

        if(root==null)
            return outter;

        Deque<Node> q=new LinkedList<>();

        q.add(root);
        List<Integer> inner=new ArrayList<>();
        inner.add(root.val);
        outter.add(inner);

        while(q.size()>0){
            //R P A
            int len=q.size();
            inner=new ArrayList<>();

            for(int i=0;i<len;i++){
                Node curr=q.remove();

                List<Node> child=curr.children;

                if(child.size()==0)
                    continue;

                int run=child.size();

                for(int j=0;j<run;j++){
                    q.add(child.get(j));
                    inner.add(child.get(j).val);
                }

            }

            if(inner.size()>0)
             outter.add(inner);
        }

        return outter;
    }
}
