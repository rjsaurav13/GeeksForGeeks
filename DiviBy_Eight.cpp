#include<iostream>
using namespace std;
int main(){
int tcase;
cin>>tcase;
for(int i=0;i<tcase;i++){
    long num;
    cin>>num;
    long temp,num2=0;
    while(num>0)
    {
        num2 = num2*10 + num%10;
        num = num/10;
    }

    if(num%8==0 && num2%8==0){
        cout<<"Yes\n";
    }else{
        cout<<"No\n";
    }
}


return 0;
}
