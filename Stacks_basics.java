import java.util.Stack;
// or you can use java.util.*;

public class Stacks_basics {
    public static void main(String[] args) {
        Stack<Integer> st= new Stack<>();
        // returns true or false
        System.out.println(st.isEmpty());
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(50);
        st.push(78);
        st.push(89);
        // peak returns the top most value
        System.out.println(st.peek());
        // prints the complete stack
        System.out.println(st);
        // removes the last element
        st.pop();
        System.out.println(st);
        System.out.println("the size of stacks is "+ st.size());
        System.out.println(st);


    }
    
}
