
// { Driver Code Starts
//Initial Template for C++
#include <iostream>
using namespace std;

// Function prototype
void evenOdd(int, int);


 // } Driver Code Ends


//User function Template for C++

// Function to check if number is even or odd
void evenOdd(int a, int b){
    if(a%2==0){
        cout<<a<<"\n";
        cout<<b<<"\n";
    }
    else{
        cout<<b<<"\n";
        cout<<a<<"\n";
    }

}

// { Driver Code Starts.

// Driver code to test above function
int main() {

	int t;
	cin >> t;

	while(t--){
	    int a, b;

	    cin >> a >> b;

	    evenOdd(a, b);

	}

	return 0;
}  // } Driver Code Ends
