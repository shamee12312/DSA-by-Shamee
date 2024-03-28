#include<bits/stdc++.h>
using namespace std;

int main()
{
    int arr[]={1,2,4,5};
    int n=4;
    int hash[n+1]={0};
    for(int i=0;i<n;i++)
    {
        hash[arr[i]]=1;
    }
    for(int i=0;i<n;i++)
    {
        if(hash[i]==0)
        cout<< i<<endl;
    }


    return 0;
}