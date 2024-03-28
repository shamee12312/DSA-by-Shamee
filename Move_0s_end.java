public class Move_0s_end {
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,0,3,0,4,5,0,6};
        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>0)
            {
                System.out.println(arr[i]);
            }
            if(arr[i]<=0)
            {
                count++;
            }
            
        }
        for(int i=0;i<n;i++)
        {
            
        }
        
    }
    
}
