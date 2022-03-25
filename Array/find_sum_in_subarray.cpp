// ek array hai soze n ka.for every i=0 to n-1 output max(a[0],a[1],.....a[i])
 // apne pas ek array hai humai find krna hai usmai ki hr index pe max value konsi aarahi hai
 // 12245654 0th index->1,1th index->2,2th index->2,3th index->4.....

 //
#include<bits/stdc++.h>
using namespace std;
 int main()
{
    int mx=-199999;
    int n;
    int arr[n];
    cin>>n;
    for(int i=0;i<n;i++)
    {
        cin>>arr[n];
    }
    
    for(int i=0;i<n;i++)
    {
      mx=max(mx,arr[i]);
      cout<<mx<<endl;
    }

} 
