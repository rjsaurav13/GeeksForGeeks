// { Driver Code Starts
// Initial Template for C++
#include <bits/stdc++.h>
using namespace std;

 // } Driver Code Ends


// User function Template for C++
class Solution {
  public:
    long long int nthOfSeries(long long int n){
        return 8*n*n+1;
    }
};

// { Driver Code Starts.
int main() {
    int t;
    cin >> t;
    while (t--) {
        long long int n;
        cin >> n;
        Solution ob;
        cout << ob.nthOfSeries(n) << endl;
    }
    return 0;
}
  // } Driver Code Ends
