#include<bits/stdc++.h>
using namespace std;


int main()
{
    int arr[]={1,1,0,0,0,1,1,1,1,0,1,1,0};
    int n = sizeof(arr)/sizeof(arr[0]);
    int maxi=0;
    int count=0;
    for(int i=0;i<n;i++)
    {
        if(arr[i]==1)
        {
            count++;
            maxi=max(count,maxi);
        }
        else{
            count=0;
        }
    }
    cout<<"maximum number of 1s are "<<maxi;
    
    return 0;
}