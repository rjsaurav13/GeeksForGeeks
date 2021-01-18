#include <iostream>
using namespace std;

int main()
{
    int tcase;
    cin>>tcase;
    for(int i =0;i<tcase;i++){
        string str;
        int vl=0,con=0;
        cin>>str;
        for(int i=0;i<str.length();i++){
            if(str[i]=='a'||str[i]=='e'||str[i]=='i'||str[i]=='o'||str[i]=='u'){
                vl++;
            }
            else{
                con++;
            }
        }
        if(con==3||vl>5){
            cout<<"0\n";
        }else{
            cout<<"1\n";
        }

    }
return 0;
}

