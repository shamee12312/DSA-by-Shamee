public class Linked_list {
    public static void display(node head)
    {
        node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    
    // displaying using recursion
    public static void display_r(node head)
    {
        if(head==null)
        return;
        System.out.println(head.data);
        display_r(head.next);
    }
    // DISPLAY IN REVERSE
    public static void display_reverse(node head)
    {
        if(head==null)
        return;
        display_reverse(head.next);
        System.out.println(head.data);
    }
    public static int length(node a)
    {
        int count=0;
        while(a!=null)
        {
            count++;
            a=a.next;
        }
        return count;
    }
    public static class node{
        int data; /*value */
        node next; /*address of next node*/
        node(int data)
        {
            this.data= data;
        }
    }
    public static void main(String[] args) {
        node a=new node(5);
        node b=new node(6);
        node c=new node(25);
        node d=new node(55);
        node e=new node(56);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        // DISPLAYING LINKED LIST USING HEAD ONLY
        
        // for(int i=0;i<5;i++)
        // {
        //     System.out.println(temp.data);
        //     temp=temp.next;
        // }
        // while(temp!=null)
        // {
        //     System.out.println(temp.data);
        //     temp=temp.next;
        // }
        display_reverse(a);
        int len=length(a);
        System.out.print("the length of the linked_list is :");
        System.out.println(len);

        
        
    }
    
}
