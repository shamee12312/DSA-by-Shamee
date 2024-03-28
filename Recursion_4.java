import java.util.*;
public class Recursion_4 {
    public static boolean f(int i,String &s)
    {
        if(i>=n.size()/2)
        return true;
        if(s[i]!=n[s.size()-i-1])
        return false;
        return f(i+1,s);
    }
    public static void main(String[] args) {
        String s="madam";
        
        
        System.out.println(f(0,s));
    }
    
}
