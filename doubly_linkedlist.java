public class doubly_linkedlist {
    public static class node{
        int data;
        node next;
        node prev;
        node(int data)
        {
            this.data=data;
        }
    }
    public static void display(node head)
    {
        node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public static void display_rev(node tail)
    {
        node temp=tail;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.prev;
        }
    }
    public static void display_bet(node tail)
    {
        node temp=tail;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.prev;
        }
    }
    public static void insertAtHead(node head)
    {
        node t = new node(9);
        t.next=head;
        head.prev=t;
        head=t;
        // return head;
    }
    public static void main(String[] args) {
        node a=new node(10);
        node b=new node(20);
        node c=new node(30);
        node d=new node(40);
        node e=new node(50);
        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=e;
        e.prev=d;
        display(a);
        System.out.println("displaying LL in reverse order");
        display_rev(e);
        insertAtHead(a);
        System.out.println("after insertions");
        display(a);
        
        

    }
    
}
