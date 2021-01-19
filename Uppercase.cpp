#include<iostream>
#include<cctype>
using namespace std;
int main()
{
    string word;
    int tcase;
    cin>>tcase;
    for(int i=0;i<tcase;i++){
        int count=0;
        cin>>word;
        for(int j=0;j<word.length();j++){
            if(isupper(word[j])){
                count++;
            }
        }
        cout<<count+1<<"\n";
    }
return 0;
}
