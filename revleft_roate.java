public class revleft_roate {
    public static void rev(int arr[],int start,int end)
    {
        while (start<=end)
        {
            int temp=arr[start];
            arr[start]= arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void rotation(int arr[],int d,int n)
    {
        rev(arr,0,d-1);
        rev(arr,d,n-1);
        rev(arr,0,n-1);

    }
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,4,5,6,7};
        int n=arr.length;
        rotation(arr,3,n);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
    
}
