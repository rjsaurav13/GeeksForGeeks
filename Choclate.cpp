
// { Driver Code Starts

#include<bits/stdc++.h>
using namespace std;


int chocolates(int arr[], int n);


int main()
{

    int t;cin>> t;
    while(t--)
    {
        int n;
        cin >> n;
        int arr[n];

        for(int i=0;i<n;i++)
            cin>>arr[i];


        cout << chocolates(arr, n);
        cout << endl;

    }

}



int chocolates(int arr[], int n)
{
    int temp;
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(arr[i]>arr[j]){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;

            }
        }
    }
    return arr[0];

}
