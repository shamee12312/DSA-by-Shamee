public class bubble_sort {
    // we have to do n-1 iterations as it allowa us to sort 4 out out 5 arrays at its correct positiion
    public static void bubblesort(int arr[],int n)
    {
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
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
        bubblesort(arr,n);
        printarr(arr, n);
        // space complexity O(1)
        // time complexity O(n^2);
        
    }
    
}
