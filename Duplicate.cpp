#include<iostream>
using namespace std;
int main()
{
    int tcase;
    cin>>tcase;
    for(int i=0;i<tcase;i++){
        int arr[10],temp;
        for(int j=0;j<10;j++){
            cin>>arr[j];
        }
        for(int l=0;l<10;l++){
            for(int k=l+1;k<10;k++){
                if(arr[l]==arr[k]){
                    temp=arr[l];
                }
            }
        }
        cout<<temp<<"\n";
    }
return 0;
}
