#include<bits/stdc++.h>
using namespace std;

int main()
{
    // map<int,int> m;
    // m[8]=2;
    // cout<<m[8]<<endl;
    

    map<int , int >mpp;
    mpp.insert({9,344});
    mpp.insert({2,4});
    mpp.insert({3,40});
    for(auto it : mpp)
    {
        cout<< it.first<<" "<<it.second<<endl;
    }
    cout<<mpp[2]<<endl;
    cout<<mpp[1];
}