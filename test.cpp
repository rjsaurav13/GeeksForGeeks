#include<iostream>
using namespace std;
int main(){
int a;
cin>>a;
int c=0,d=0;
    while(a != 0){
        c=c*10+a%10;
        a=a/10;
    }
    cout<<c;


return 0;
}
