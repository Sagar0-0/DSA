class GfG
{
        public static int fun(LinkedList<Integer>list,int start, int end){
            //System.out.println("Hi");
            
            while(start<end){
                if(list.get(start)!=list.get(end)){
                    return -1;
                }
                else{
                    start++;
                    end--;
                }
            }
           //System.out.println((end-start+1));
            return end-start+1;
        }
        public static int maxPalindrome(Node head)
        {
          LinkedList<Integer>list=new LinkedList<Integer>();
          Node temp=head;
          while(temp!=null){
              list.add(temp.data);
              temp=temp.next;
          }
          int max=01;
          int end=list.size()-1;
          int start=0;
          
         for(int i=0;i<list.size();i++){
             for(int j=list.size()-1;j>i;j--){
                 if(list.get(i)==list.get(j)){
                     //System.out.println("hi"+list.get(i));
                     int a=fun(list,i,j);
                     if(a!=-1){
                         max=Integer.max(max,j-i+1);
                         break;
                     }
                 }
                 
                 
                 
                
             }
         }
          
          return max;
          
        }
}
