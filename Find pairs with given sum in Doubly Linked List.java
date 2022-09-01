Approach 1:

Time Complexity:O(N)[Linked List traversal]
Auxiliary Space:O(N)[Storing into Another Arraylist]
GFG Time:1.89s

Code:

ArrayList<ArrayList<Integer>>list=new ArrayList<ArrayList<Integer>>();
       
        
        ArrayList<Integer>aa=new ArrayList<Integer>();
        Node temp=head;
        while(temp!=null){
            aa.add(temp.data);
            temp=temp.next;
        }
        int start=0;
        int end=aa.size()-1;

        while(start<end){
            if(aa.get(start)+aa.get(end)==target){
                ArrayList<Integer>ab=new ArrayList<Integer>(2);
                ab.add(aa.get(start));
                ab.add(aa.get(end));
                start++;
                end--;
                list.add(ab);
            }
            else if(aa.get(start)+aa.get(end)>target){
                end--;
            }
            else{
                start++;
            }
        }
        return list;
        



Approach 2:

Time Complexity:O(N)[Linked List traversal][2 times paas]
Auxiliary Space:O(1)[No any data structure for storing data is used.]
GFG Time:1.67s

Code:

ArrayList<ArrayList<Integer>>aa=new ArrayList<ArrayList<Integer>>();
       
        Node temp1=head;
        Node temp2=head;
        
        while(temp1.next!=null){
            temp1=temp1.next;
            
        }
        Node temp3=temp1;
        
        while(temp2.data<temp3.data){
            if((temp2.data+temp3.data)==target){
                ArrayList<Integer>ab=new ArrayList<Integer>(2);
                ab.add(temp2.data);
                ab.add(temp3.data);
                aa.add(ab);
                temp2=temp2.next;
                temp3=temp3.prev;
                
            }
            else if((temp2.data+temp3.data)>target){
                temp3=temp3.prev;
            }
            else{
                temp2=temp2.next;
            }
        }
        
        return aa;






