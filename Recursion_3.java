public class Recursion_3 {
    public static void f(int i,int n,int arr[])
    {
        if(i>=n/2)
        return;
        swap(arr[i],arr[n-i-1]);
        f(i+1,n,arr);
        
    }
    public static void swap(int i, int j) {
        int temp=i;
        i=j;
        j=temp;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        
        int n=arr.length;
        
        f(0,n-1,arr);
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }

        
    }
    
}
