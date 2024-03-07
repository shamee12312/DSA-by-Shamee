import java.lang.Math;
public class Maths_1 {
    public static void main(String[] args) {
        int n=(int) Math.sqrt(36);
        for(int i=1;i<=n;i++)
    {
        if(n%i==0)
        {
            System.out.println(i);
        }
        if((n/i)!= i)
        {
            System.out.println(n/i);
        }
    }
    }
    
}
