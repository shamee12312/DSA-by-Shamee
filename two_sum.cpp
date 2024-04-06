#include<bits/stdc++.h>
using namespace std;
// string read(int n,vector<int>book,int target)
// {
//     map<int,int> mpp;
//     for(int i=0;i<n;i++)
//     {
//         int a=book[i];
//         int more=target-a;
//         if(mpp.find(more)!=mpp.end())
//         {
//             return "YES";
//         }
//         mpp[a]=i;
//     }
//     return "NO";
// }

// int main()
// {
//     vector<int> book{4,1,2,3,1};
//     read(5,book,5);
// }
int main()
{
    int arr[]={4,1,2,0,0};
    int n = sizeof(arr)/sizeof(arr[0]);
    sort(arr, arr + n);
 
    cout << "\nArray after sorting using "
            "default sort is : \n";
    for (int i = 0; i < n; ++i)
        cout << arr[i] << " ";
        
    int i=0;
    int j=n-1;
    int target=5;
    cout<<endl;
    while(i<j)
    {
        int sum=arr[i]+arr[j];
        if(sum==target)
        {
            cout<<i<<" "<<j<<" "<<"yes"<<endl;
            break;
        }
        else if(sum <target)
        {
            i++;
        }
        else
        {
            j--;
        }

    }
    return 0;
    
}