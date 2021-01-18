#include<iostream>
using namespace std;
int main(){
    string s;
        int sum=0;
        cin>>s;
        for(int j=0;j<s.length();j++){
            sum=sum+int(s[j]);
        }
        cout<<"\n"<<sum;
return 0;
}
