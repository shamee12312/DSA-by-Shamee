public class Queue_3 
    {
            // queue implementation using LinkedList
    public static class node{
        int data;
        node next;
        node(int data)
        {
             this.data=data;
        }
    } 
    public static class linkedlistqueue
    {
        node head=null;
        node tail=null;
        int size=0;
        public void add(int x)
        {
            node temp=new node(x);
            if(size==0)
            {
                head=tail=temp;
            }
            else
            {
                tail.next=temp;
                tail=temp;
            }
            size++;
        }
        public int peek()
        {
            if(size==0)
            {
                System.out.println("queue is empty");
                return -1;
            }
            return head.data;
        }
        public int remove()
        {
            if(size==0)
            {
                System.out.println("queue is empty");
                return -1;
            }
            int y=head.data;
            head=head.next;
            size--;
            return y;
        }
        public void display()
        {
            if(size==0)
            {
                System.out.println("queue is empty");
            }
            else
            {
                node temp=head;
                while(temp!=null)
                {
                    System.out.println(temp.data+" ");
                    temp=temp.next;
                }
                // System.out.println();

            }
        }
        public boolean isEmpty()
        {
            if(size==0)
            {
                return true;
            }
            return false;
        }
    }       
    public static void main(String[] args) {
        // queue implementation using LinkedList
        linkedlistqueue lq=new linkedlistqueue();
        lq.add(1);
        lq.add(2);
        lq.add(3);
        lq.add(4);
        lq.add(5);
        lq.display();
        System.out.println(lq.peek());
        System.out.println(lq.isEmpty());
        lq.remove();
        lq.display();


    }
    
}
