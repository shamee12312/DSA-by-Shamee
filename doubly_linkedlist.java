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
    public static node insertAtHead(node head,int x)
    {
        node t = new node(x);
        t.next=head;
        head.prev=t;
        head=t;
        return head;
    }
    public static void insertAtTail(node head,int x)
    {
        node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        node t = new node(x);
        temp.next=t;
        t.prev=temp;
        return;
        
    }
    public static void insertAtIdx(node head,int idx,int x)
    {
        node s=head;
        for(int i=1;i<=idx-1;i++)
        {
            s=s.next;
        }
        node r=s.next;
        node t=new node(x);
        s.next=t;
        t.prev=s;
        t.next=r;
        r.prev=t;
    }
    public static void deleteAtHead(node head)
    {
        head=head.next;
        head.prev=null;
    }
    public static void deleteAtTail(node head)
    {
        node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp=temp.prev;
        temp.next=null;
    }
    public static void deleteAtIdx(node head,int idx)
    {
        node temp=head;
        for(int i=1;i<=idx-1;i++)
        {
            temp=temp.next;
        }
        temp.next=temp.next.next;
        temp.next.prev=temp;
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
        
        System.out.println("after insertions");
        node newhead=insertAtHead(a,9);
        display(newhead);
        insertAtTail(a, 6);
        System.out.println("inserton after new tail");
        display(a);
        System.out.println("insertion at any giver index");
        insertAtIdx(a,2,25);
        display(a);
        System.out.println("deletion from head");
        deleteAtHead(a);
        display(a);
        System.out.println("deletion from tail");
        deleteAtTail(a);
        display(a);
        System.out.println("deletion at given index");
        deleteAtIdx(a,2);
        display(a);
        


        
        


    }
    
}
