import java.util.Stack;

public class Stack_4 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        // displaying or printing stacks without sout function
        Stack<Integer> rt = new Stack<>();
        while(st.size()>0)
        {
            rt.push(st.pop());
        }
        while(rt.size()>0)
        {
            int x=rt.pop();
            System.out.print(x+" ");
            st.push(x);
        }


    }
    
}
