#include<bits/stdc++.h>
using namespace std;

int main()
{
    int arr[]={1,1,2,2,3,4,4,5,5};
    int n = sizeof(arr)/sizeof(arr[0]);
    int xor1=0;
    for(int i=0;i<n;i++)
    {
        xor1=arr[i]^arr[i];
        
    }
    int c= xor1;
    cout<< c;


}    