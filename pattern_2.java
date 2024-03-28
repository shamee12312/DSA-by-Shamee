public class pattern_2 {
    public static void f(int n,int i)
    {
        if(i>n)
        return;
        else
        // backtracking
        System.out.print(i);
        System.out.print(" ");
        f(n,i+1);
        System.out.print(" ");
        System.out.print(i);
        

    }
    public static void main(String[] args) {
        f(5,1);
        
    
}
}
