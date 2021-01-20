#include<iostream>
using namespace std;
int main(){
    int tcase,len;
    cin>>tcase;
    for(int i=0;i<tcase;i++){
        char ch;
        string s;
        cin>>s;
        for(int j=0;j<s.length();j++){
            for(int k=j+1;k<s.length();k++){
                if(int(s[j])>int(s[k])){
                    ch=s[j];
                    s[j]=s[k];
                    s[k]=ch;
                }
            }
        }
        cout<<s<<"\n";

    }
return 0;
}
