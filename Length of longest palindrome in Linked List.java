class GfG
{
   
        public static int maxPalindrome(Node head)
        {
          //add code here.
          ArrayList<Integer> al = new ArrayList<>();
          while(head != null){
              al.add(head.data);
              head = head.next;
          }
          int[] arr = new int[2];
          int center = 0;
          while(center < al.size()){
              center = binary(al,center,arr);
              center++;
          }
          return(arr[1]-arr[0]-1);
        }
        public static int binary(ArrayList<Integer> al , int i, int[] arr){
            int n = al.size();
            int new_center = i;
            int t = i;
            while(new_center < n-1 && al.get(new_center) == al.get(new_center+1) ){
                new_center++;
            }
            int center = new_center;
            while(t >= 0 && new_center < n && al.get(t) == al.get(new_center) ){
                t--;
                new_center++;
            }
            if(arr[1]-arr[0]-1 < new_center-t-1){
                arr[0] = t;
                arr[1] = new_center;
            }
            return center;
        }
}
