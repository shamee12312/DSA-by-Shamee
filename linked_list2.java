public class linked_list2 {
    public static class node{
        int data;
        node next;
        node(int data)
        {
            this.data=data;
        }
    }
    public static class linked_list02{
        node head=null;
        node tail=null;
        void insertAtEnd(int val)
        {
            node temp=new node(val);
            if(head==null)
            {
                head=temp;
                tail=temp;
            }
            else
            {
                tail.next=temp;
                tail=temp;
            }
        }
        void display()
        {   
            node temp=head;
           while(temp!=null)
           {
            System.out.println(temp.data);
            temp=temp.next;
           }
        }
        int size()
        {
            int count=0;
            node temp=head;
            while(temp!=null)
            {
                count++;
                temp=temp.next;
            }
            return count;
        } 
        void insertAtHead(int val)
        {
            node temp=new node(val);
            if(head==null)
            {
                head=temp;
                tail=temp;
            }
            else
            {
                temp.next=head;
                head=temp;
            }
        }
        
    }
    public static void main(String[] args) {
        linked_list02 ll=new linked_list02();
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.display();
        System.out.println("the size of linked list is "+ll.size());
        ll.insertAtEnd(12);
        ll.display();
        System.out.println("the size of linked list is "+ll.size());
        ll.insertAtHead(5677);
        ll.display();
        
        

        
    }
    
}
