#include<iostream>
using namespace std;
int main()
{
    int tcase;
    cin>>tcase;
    for(int i =0;i<tcase;i++){
        string s;
        int sum=0,pro=0;
        cin>>s;
        for(int j=0;j<s.length();j++){
            sum=sum+int(s[j]);
        }
        for(int i=0;i<sizeof(arr);i++){

            if(arr[i]==sum){
                cout<<"1\n";
                break;
            }
        else{
            cout<<"0\n";
            break;
        }
    }
    }


return 0;
}
