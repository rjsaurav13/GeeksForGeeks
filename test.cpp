#include<iostream>
using namespace std;
int main(){
int a[]={1,2,3,4};
int n=4;
int num=0;
        for(int i=0;i<n;i++){
            num=(num*10)+a[i];
        }
        cout<<num;


return 0;
}
