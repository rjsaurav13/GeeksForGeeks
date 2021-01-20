#include<iostream>

using namespace std;
int main(){
    int tcase;
    cin>>tcase;
    for(int i=0;i<tcase;i++){
        long long n;
        cin>>n;
        int num;
        for(int j=0;j<1000;j++){
            int sum=j*(j+1)/2;
            if(n==sum){
                num=j;
                break;
            }else{
                num=-1;
            }

        }
            if(num!=-1){
                cout<<num<<"\n";
            }
            else{
                cout<<num<<"\n";
            }
    }

return 0;
}
