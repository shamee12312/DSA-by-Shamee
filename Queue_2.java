public class Queue_2 {
     // queue array implementation
    public static class queuearray{
        int f=-1;
        int r=-1;
        int size=0;
        int arr[]=new int[100];
        public void add(int x)
        {
            if(r==arr.length-1)
            {
                System.out.println("queue is full");
                return;
            }
            if(f==-1)
            {
                f=r=0;
                arr[0]=x;
            }
            else{
                arr[r+1]=x;
                r++;
            }
            size++;
        }
        public int remove()
        {
            if(size==0)
            {
                System.out.println("queue is empty");
                return -1;
            }
            int x=arr[f];
            size--;
            f++;
            return x;
        }
        public int peek()
        {
            return arr[f];
        }
        public boolean isEmpty()
        {
            if(size==0)
            {
                return true;
            }
            else 
            {
                return false;
            }
        }
        public void display()
        {
            if(size==0)
            {
                System.out.println("Queue is empty");
            }
            else{
                for(int i=f;i<=r;i++)
                {
                    System.out.print(arr[i]+" ");
                }
            }
        }

    }
    public static void main(String[] args) {
        // queue array implementation
        queuearray qa =new queuearray();
        System.out.println(qa.isEmpty());
        qa.add(1);
        qa.add(2);
        qa.add(3);
        qa.add(4);
        qa.display();
        System.out.println();
        System.out.println(qa.isEmpty());
        qa.remove();
        qa.display();
        System.out.println();
        System.out.println(qa.peek());


    }
    
}
