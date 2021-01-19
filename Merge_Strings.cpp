#include<iostream>
using namespace std;
int main()
{
    int tcase ;
    cin>>tcase;
    for(int i=0;i<tcase;i++){
        string str1,str2;
        cin>>str1>>str2;
        int len=str1.length()+str2.length();
        char arr[len];
        for(int k=0;k<len;k++){


            if(k%2==0){

                arr[k]=str1[k];
            }

        }
        for(int k=0;k<len;k++){


            if(k%2!=0){

                arr[k]=str2[k];
            }

        }
        for(int l=0;l<len;l++){
        cout<<arr[l];
        }
         cout<<"\n";

    }


return 0;
}
