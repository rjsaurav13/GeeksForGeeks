#include <iostream>
using namespace std;

int main()
{
    int len,temp,tcase;
    cin>>tcase;
    for(int i =0;i<tcase;i++){
        cin>>len;
        int arr[len];
        for(int i=0;i<len;i++){
            cin>>arr[i];
        }
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                if(arr[i]>arr[j]){
                        temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;

                }
            }
        }
        for(int k=0;k<len;k++){
            if(len<2||arr[0]==arr[k]){
                cout<<"-1\n";
            }else if(arr[0]==arr[k]){
                cout<<arr[0]<<" "<<arr[k+1]<<"\n";
            }else{
                cout<<arr[0]<<" "<<arr[1]<<"\n";
            }
        }
    }
    return 0;
}
