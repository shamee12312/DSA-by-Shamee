#include<bits/stdc++.h>
using namespace std;

int main()
{
    int arr[]={1,1,2,2,0,1,2,0,0,2,1,0,0};
    int n= sizeof(arr)/sizeof(arr[0]);
    int count =0;
    int count1 =0;
    int count2 =0;
    for(int i=0;i<n;i++)
    {
        if(arr[i]==0)
        {
            count++;
        }
        if(arr[i]==1)
        {
            count1++;
        }
        if(arr[i]==2)
        {
            count2++;
        }
        
    }
    cout<<count<<" "<<count1<<" "<<count2<<" "<<endl;

    for(int i=0;i<count;i++)
    {
        arr[i]=0;
    }
    for(int i=count;i<count1+count;i++)
    {
        arr[i]=1;
    }
    for(int i=count+count1;i<count2+count+count1;i++)
    {
        arr[i]=2;
    }
    for(int i=0;i<n;i++)
    {
        cout<<arr[i]<<" ";
    }
    
}