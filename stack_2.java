import java.util.Stack;
import java.util.Scanner;

public class stack_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack <Integer> st= new Stack<>();
        int n;
        System.out.println("enter the number of elments you want to insert ");
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("enter the element");
            int x=sc.nextInt();
            st.push(x);
        }
        System.out.println(st);
        // for printing the elements in reverse order
        Stack <Integer> rt= new Stack<>();
        while(st.size()>0)
        {
            int x=st.peek();
            rt.push(x);
            st.pop();
        }
        System.out.println(rt);
        // for printing the elemetns in the same order 
        Stack <Integer> gt= new Stack<>();
        while(st.size()>0)
        {
            int x=rt.peek();
            gt.push(x);
            rt.pop();
        }
    }
    
}
