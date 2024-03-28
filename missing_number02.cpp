#include<bits/stdc++.h>
using namespace std;

int main()
{
    // sum method
    // int arr[]={1,2,4,5,};
    // int n = sizeof(arr)/sizeof(arr[0]);
    // int N=5;
    // int sum=(N*(N+1))/2;
    // int arrsum=0;
    // for(int i=0;i<n;i++)
    // {
    //     arrsum=arrsum + arr[i];
    // }
    
    // cout<<"missing number is "<<sum-arrsum;

    // XOR method
    // int arr[]={1,2,3,4,5,6,8};
    // int n=8;
    // int xor1=0;
    // for(int i=1;i<=n;i++)
    // {
    //     xor1=xor1^i;
    // }
    // int xor2=0;
    // int n1 = sizeof(arr)/sizeof(arr[0]);
    // for(int i=0;i<n-1;i++)
    // {
    //     xor2=xor2^arr[i];

    // }
    // int y= xor1^xor2;
    // cout<<"missing number is "<<y;

    // optimised xor technique
    int arr[]={1,2,3,4,5,6,8};
    int n=8;
    int xor1=0;
    // for(int i=1;i<=n;i++)
    // {
    //     xor1=xor1^i;
    // }
    int xor2=0;
    int n1 = sizeof(arr)/sizeof(arr[0]);
    for(int i=0;i<n-1;i++)
    {
        xor2=xor2^arr[i];
        xor1=xor1^i+1;

    }
    xor1=xor1^n;
    int y= xor1^xor2;
    cout<<"missing number is "<<y;
}