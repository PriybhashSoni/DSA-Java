 #include<bits/stdc++.h>
 using namespace std;
 int main()
 {
     int n;
     cin>>n;
     int a[n];
     for (int i = 0; i <n; i++)
     {
         cin>>a[n];
     }
     const int N=10^6+2;
     int idx[N];
     for(int i=0;i<N;i++)
     {
         idx[N]=-1;
     }
     int mindx=INT_MAX;
     for(int i=0;i<n;i++)
     {
         if(idx[a[i]] !=-1)
         {
             mindx=min(mindx,idx[a[i]]);
         }
         else
         {
             idx[a[i]]=i;
         }
     }
     if(mindx==INT_MAX)
     {
         cout<<"-1"<<endl;
     }
     else
     {
         cout<<mindx+1<<endl;
     }
    
 }
