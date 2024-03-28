 class largest_ele{
    
    public static void main(String[] args) {
        int arr[]=new int[]{4,3,6,1,8,99};
        int largest=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>largest)
            {
                largest=arr[i];
            }
        }
        System.out.println("the largest elemen is "+largest);
        int seclargest=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>seclargest && arr[i]!=largest)
            {
                seclargest=arr[i];
            }
        }
        System.out.println("so the seclargest elemnt is "+seclargest);


    }
}