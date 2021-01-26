#include <iostream>
using namespace std;

int main() {
	int tcase;
	cin>>tcase;
	for(int i=0;i<tcase;i++){
	    string s;
	    cin>>s;
	    for(int j=0;j<s.length();j++){
	        for(int k=j+1;k<s.length();k++){
                if(s[j]==s[k]){
                    s[j]++;
                    s[k]=s[k+1];
                    break;
                }

	        }
	    }
	    cout<<s;
	}
	return 0;
}
