/*
 algorithms
containers
functions 
iterators
*/ 
#include<bits/stdc++.h>
using namespace std;


void explainpairs()
{
    pair<int ,int> p={1,4};
    cout<<p.first<<" "<<p.second<<"\n";
    pair<int,pair<int,int>> q={1,{2,3}};
    cout<<q.first<<" "<<q.second.second<<" "<<q.second.first<<" \n";
    pair<int,int>arr[]={{55,66},{99,88},{33,44}};
    cout<<arr[1].second<<" "<<arr[2].first;
}


void explain_vectors()
{
    vector<int> v;
    v.push_back(7);
    v.push_back(89);
    v.push_back(8);
    v.push_back(9);
    v.push_back(9875);
    // for(int i=0;i<v.size();i++)
    // {
    //     cout<< v[i]<<",";
    // }
    v.emplace_back(67);
    vector<pair<int,int>>vec;
    vec.push_back({1,3});
    vec.emplace_back(23,45);
    
    vector<int>v3(5,100);
    vector<int>v1(5,200);
    vector<int>v2(v1);
    
    vector<int>::iterator it=v.begin();
    it++;
    cout<<*(it)<<" ";
    it++;
    cout<<*(it)<<" ";
    it++;
    cout<<*(it)<<" ";
    it++;
    cout<<*(it)<<" ";
    cout<<v[1]<<"\n";
    cout<<"\n\n\n\n\n";

    // sjdgfhid
    for(vector<int>::iterator it=v.begin();it!=v.end();it++)
    {
        cout<<*(it)<<" ";
    }
    // inshort can  be written as
    for(auto it=v.begin();it!=v.end();it++)
    {
        cout<<*(it)<<" ";
    }
    cout<<"\n\n\n\n\n\n\n\n\n\n";
    // inshort can  be written as
    for(auto it: v)
    {
        cout<< it<<" ";
    }
    cout<<"\n\n\n\n\n\n\n\n\n\n";
    cout<<"the size of vector is "<<v.size();
    v.erase(v.begin()+1);
    v.erase(v.begin()+2,v.begin()+4);
    cout<<"\n\n\n\n\n\n\n\n\n\n";
    cout<<"the size of vector is "<<v.size();
    vector<int>v(2,100);
    v.insert(v.begin(),300);


    void explainlist()
    {
        list<int> ls;
        ls.push_back(2);
        ls.emplace_back(4);
        ls.push_front(5);
        ls.emplace_front
    }
    void explain_dequeue()
    {

    }
    void stack()/*last in first out*/
    {

    }

    
}

int main()
{
    // explainpairs();
    // explain_vectors();
    explainlist();
    return 0;

}