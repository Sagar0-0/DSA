class GfG
{
    public static Node partition(Node l, Node h)
    {
        //code here.
        Node pivot=l;
        Node left=l;
        Node right=h;
        boolean flag=false;
        while(!flag){       
            while(left!=null && left.data<=pivot.data){
                if(left==right)flag=true;
                left=left.next;
            }
            while(right!=null && right.data>pivot.data){
                if(right==left)flag=true;
                right=right.prev;
            }
            if(!flag)swap(left,right);
        }
        swap(pivot,right);
        return right;
    }
    static void swap(Node a,Node b){
        int temp=a.data;
        a.data=b.data;
        b.data=temp;
    }
}
