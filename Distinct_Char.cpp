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
            for(int k=j+1;k<word.length();k++){
                if(word[j]==word[k]){
                    count++;
                }
            }
        cout<<count<<"\n";
        }
    }
return 0;
}
