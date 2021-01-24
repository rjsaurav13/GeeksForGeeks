
#include<iostream>
using namespace std;
int main(){
int tcase;
cin>>tcase;
for(int i=0;i<tcase;i++){
    long num;
    cin>>num;
    if(num%8==0){
        cout<<"Yes";
    }else{
        cout<<"No";
    }
}


return 0;
}
