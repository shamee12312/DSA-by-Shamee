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
        void insertAt(int idx,int val)
        {
            node t =new node(val);
            node temp=head;
            if(idx==size())
            {
                insertAtEnd(val);
                return;
            }
            else if(idx==0)
            {
                insertAtHead(val);
                return;
            }
            else if(idx<0 || idx>size())
            {
                System.out.println("wrong index value provided");
            }
            for(int i=0;i<=idx-1;i++)
            {
                temp=temp.next;
            }
            t.next=temp.next;
            temp.next=t;
        }
        int getAt(int idx)
        {
            if(idx<0 || idx>size())
            {
                System.out.println("wrong index value provided");
            }
            node temp=head;
            for(int i=1;i<=idx;i++)
            {
                temp=temp.next;
            }
            return temp.data;
            
        }
        void deleteAt(int idx)
        {
            if(idx<0 || idx>size())
            {
                System.out.println("wrong index value provided");
                return;
            }
            if(idx==0)
            {
                head=head.next;
                return;
            }
            node temp=head;
            for(int i=1;i<=idx-1;i++)
            {
                temp=temp.next;
            }
            temp.next=temp.next.next;
            tail=temp;
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
        System.out.println("values after insertion");
        ll.insertAt(2,1200);
        ll.display();
        ll.insertAt(0, 100);
        ll.insertAt(6,56);
        System.out.println("display after insertion at 0th index and last index");
        ll.display();
        System.out.println("tha value at 2nd index is: "+ll.getAt(2));
        System.out.println("values after deletion");
        ll.deleteAt(2);
        ll.display();
    }
    
}
