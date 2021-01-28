
#include <iostream>
using namespace std;


 // } Driver Code Ends


//User function Template for C++

void reverse_dig(int &a,int &b)
{
    int c=a,d=b;
    a=0;
    b=0;
    while(c!=0){
        a=a*10+c%10;
        c=c/10;

    }
     while(d!=0){
        b=b*10+d%10;
        d=d/10;

    }
}
void swap(int &a,int &b)
{   int g;
    if(a>b){
        g=b;
        b=a;
        a=g;
    }else{
        g=a;
        a=b;
        b=g;
    }
}


// { Driver Code Starts.

int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        int a, b;
	    cin>>a>>b;

	    reverse_dig(a,b);
	    swap(a,b);
	    cout<<a<<" "<<b<<endl;
    }
	return 0;
}  // } Driver Code Ends
