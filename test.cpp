#include<iostream>
using namespace std;
int main(){
    int N;
    cin>>N;
    int pro=1;
        for(int i=1;i<=N;i++){
            pro=pro*i;
        }
        cout<<pro;
return 0;
}
