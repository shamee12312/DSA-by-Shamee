public class selection_sort {
    public static void selectionsort(int arr[],int n)
    {
        
        for(int i=0;i<n-1;i++)
        {
            int min_idx=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[min_idx])
                {
                    min_idx=j;
                }

            }
            int temp=arr[i];
            arr[i]=arr[min_idx];
            arr[min_idx]=temp;
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
        int arr[]={5,8,9,3,6,2,2,2,2,2,1};
        int n=arr.length;
        selectionsort(arr,n);
        printarr(arr, n);
        // space complexity O(1)
        // time complexity O(n^2)
    
    }
}
