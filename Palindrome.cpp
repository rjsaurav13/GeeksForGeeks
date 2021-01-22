#include<iostream>
using namespace std;
int main(){
        string s1;
	    cin>>s1;
	    int n=s1.length();
	    char s2[n];
	    for(int i=0;i<n;i++){
	        s2[i]=s1[n-i-1];
	    }
	    for(int i=0;i<n;i++){
	        if(s2==s1){
                return 1;
                break;
	        }
	        else{
                return 0;
                break;
	        }
	    }
    for(int i=0;i<n;i++){
             cout<<s2[i]<<" ";
    }

    return 0;
}
