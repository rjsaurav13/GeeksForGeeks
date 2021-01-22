
// Initial Template for C++
#include <bits/stdc++.h>
using namespace std;

 // } Driver Code Ends


// User function Template for C++
class Solution {
  public:
    long long int commDiv(long long int a,long long int b) {
        int count=0;
        for(int i=1;i<=b;i++){
            if(a%i==0&&b%i==0){
                count++;
            }
        }
        return count;
    }
};

// { Driver Code Starts.
int main() {
    int t;
    cin >> t;
    while (t--) {
        long long int a, b;
        cin >> a >> b;
        Solution ob;
        cout<<ob.commDiv(a, b)<<endl;
    }
    return 0;
}
  // } Driver Code Ends
