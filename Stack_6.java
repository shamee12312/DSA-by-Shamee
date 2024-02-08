public class Stack_6 {
    public static class stack{
        int arr[]=new int[200];
        int idx=0;
        void push(int x)
        {
            if(isFull())
            {
                System.out.println("stack is full");
                return;
            }
            arr[idx]=x;
            idx++;
        }
        int peek()
        {
            if(idx==0)
            {
                System.out.println("STACK IS EMPTY");
                return -1;
            }
            return arr[idx-1];
        }
        int pop()
        {
            if(idx==0)
            {
                System.out.println("STACK IS EMPTY");
                return -1;
            }
            int top=arr[idx-1];
            arr[idx-1]=0;
            idx--;
            return top;
        }
        void display()
        {
            for(int i=0;i<=idx-1;i++)
            {
                System.out.print(arr[i]+" ");
            }
        }
        int size()
        {
            return idx;
        }
        boolean isEmpty()
        {
            if(idx==0)
            {
                return true;
            }
            else
            return false;
        }
        boolean isFull()
        {
            if(idx==arr.length)
            {
                return true;
            }
            else 
            return false;
        }
        int capacity()
        {
            return arr.length;
        }
    }
    public static void main(String[] args) {
        // implementation of peeek ,push ,push ,size using array ie
        // implementation of stack suing array
        stack st = new stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(8);
        st.push(9);
        st.display();
        System.out.println();
        System.out.println(st.size());
        st.peek();
        st.pop();
        st.display();
        System.out.println();
        st.pop();
        st.display();
        System.out.println();
        System.out.println(st.isEmpty());
        System.out.println(st.isFull());
        st.push(300);
        System.out.println(st.isFull());
        System.out.println(st.capacity());
        System.out.println(st.size());
        st.display();
        


        

    }
    
}
