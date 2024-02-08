public class Stack_7 {
    public static class node{
        int data;
        node next;
        node(int data)
        {
            this.data=data;
        }
    }
    public static class llstack{
        node head=null;
        int size=0;
        void push(int x)
        {
            node temp=new node(x);
            temp.next=head;
            head=temp;
            size++;
        }
        int pop()
        {
            if(head==null)
            {
                System.out.println("stack is empty");
                return -1;
            }
            int x=head.data;
            head=head.next;
            return x;
        }
        int peak()
        {
            if(head==null)
            {
                System.out.println("stack is empty");
                return -1;
            }
            return head.data;
        }
        void displayrec(node h)
        {
            if(h==null)
            {
                return;
            }
            displayrec(h.next);
            System.out.print(h.data+" ");
        }
        void display()
        {
            displayrec(head);
            System.out.println();
        }


        void displayrev()
        {
            node temp=head;
            while(temp!=null)
            {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
        int size()
        {
            return size;
        }
        boolean isEmpty()
        {
            if(size==0)
            {
                return true;
            }
            return false;
        }
    }
    public static void main(String[] args) {
        // Linked list implementation
        llstack st = new llstack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.display();
        st.pop();
        st.display();
        System.out.println(st.size);



    }
    
}
