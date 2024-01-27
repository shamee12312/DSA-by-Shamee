public class insertion_sort {
    public static void insertionsort(int arr[],int n)
    {
        for(int i=1;i<n;i++)
        {
            int j=i;
            while(j>0 && arr[j]<arr[j-1] )
            {
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
    }

    public static void printarr(int arr[],int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={5,8,9,3,6,2,1};
        int n=arr.length;
        insertionsort(arr,n);
        printarr(arr, n);
    }
}
