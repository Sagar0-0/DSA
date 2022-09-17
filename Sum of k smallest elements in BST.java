class Tree {

    public static void fun(Node root,ArrayList<Integer>aa){

        if(root==null){

            return ;

        }

        else{

            fun(root.left,aa);

            aa.add(root.data);

            fun(root.right,aa);

        }

    }

    int sum(Node root, int k) { 

        ArrayList<Integer>aa=new ArrayList<Integer>();

        fun(root,aa);

        int sum=0;

        for(int i=0;i<k;i++){

            sum=sum+aa.get(i);

        }

        return sum;

        

    } 

}


For More Information About Code

https://yashboss116.blogspot.com/2022/09/sum-of-k-smallest-elements-in-bst-geeks.html



