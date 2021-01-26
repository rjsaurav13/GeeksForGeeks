#include<iostream>
using namespace std;
int main(){

    int num;
    cin>>num;
    int temp,num2=0;
    while(num>0)
    {
        num2 = num2*10 + num%10;
        num = num/10;
    }
    cout<<num<<" "<<num2;

return 0;
}
