public class binary_search {
    public static int binarysearch(int arr[],int key,int n)
    {
        int start=0;
        int end=n-1;
        
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]==key)
            {
                return mid;
            }
            if(arr[mid]<key)
            {
                end=mid-1;

            }
            else
            {
                start=mid+1;
            }
            
        }
        return -1;
        
    } 

    public static void main(String[] args) {
        int arr[]={5,8,9,3,6,1};
        int n=arr.length;
        int c=binarysearch(arr, 1, n);
        if(c==-1)
        {
            System.out.println("elment not present");
        }
        else{
            System.out.println("the position of key is "+c);
        }
        

    }
    
}
