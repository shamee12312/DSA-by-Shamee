#include<bits/stdc++.h>
using namespace std;
void swap(int &a,int &b )
{
    // add   '&' to change address as  the swap function you've defined won't work as expected because
    //  it swaps local copies of a and b, not the actual elements in the array. To fix this, you need to pass the array elements by reference.
    int temp=a;
    a=b;
    b=temp;
}

int main()
{
    int arr[]={1,1,2,2,0,1,2,0,0,2,1,0,0};
    int n= sizeof(arr)/sizeof(arr[0]);
    int low =0;
    int mid=0;
    int high=n-1;
    while(mid<=high)
    {
        if(arr[mid]==0)
        {
            swap(arr[low],arr[mid]);
            low++;
            mid++;
        }
        else if(arr[mid]==1)
        {
            mid++;
        }
        else{
            swap(arr[mid],arr[high]);
            high--;
        }

    }
    cout<<"sorted arrray is "<<endl;
    for(int i=0;i<n;i++)
    {
        cout<<arr[i]<<" ";
    }
    return 0;

}