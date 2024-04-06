vector<int> left,right,equal;
    for(int i=0;i<arr.size():i++)
    {
        if(arr[i]<arr[0]) left.push_back(arr[i]);
        else if(arr[i]>arr[0]) right.push_back(arr[i]);
        else equal.push_back(arr[i]);
        
    }
    left.insert(left.end(),equal.begin,equal.end());
    left/insert(left.end(),right.begin(),right.end());
    return left;
}