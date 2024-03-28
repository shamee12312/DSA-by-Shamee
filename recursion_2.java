public class recursion_2 {
    public static int f(int n)
    {
        if(n==1)
        {
            return 1;
        }
        else
        return n * f(n-1);
        

    }
        
    public static void main(String[] args) {
        int c=f(5);
        System.out.println(c);
        
    }
    
}
