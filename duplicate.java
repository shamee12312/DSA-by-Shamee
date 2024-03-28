public class duplicate {
    public static void main(String[] args) {
        int arr[]=new int[]{1,1,1,1,1,2,2,2,3,3};
        public static int remove_duplicate(int arr[])
        {
            int i=0;
            for(int j=1;j<arr.length;j++)
            {
            if(arr[j]!=arr[i])
            {
                arr[i+1]=arr[j];
            }
            }
            return i+1;
        }
        int c=remove_duplicate( arr);
        System.out.println(c);
        // int arr2[]=new int[50];
        // int count=0;
        // for(int i=0;i<arr.length;i++)
        // {
        //     if(arr[i]!=arr[i+1])
        //     {
        //         arr2[i]
        //     }
        // }
        // System.out.println(count);
        // for(int i=0;i<arr.length;i++)
        // {
        //     System.out.println(arr[i]);
        // }
        

        

        
    }

    
    
}
