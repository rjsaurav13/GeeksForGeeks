// { Driver Code Starts
// Initial Template for C++
#include <bits/stdc++.h>
using namespace std;

 // } Driver Code Ends


// User function Template for C++
class Solution {
  public:
    int countDivisibles(int A, int B, int M) {
        int count=0;
        for(int i=A;i<=B;i++){
            if(i%M==0){
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
        int A, B, M;
        cin >> A >> B >> M;
        Solution ob;
        cout<<ob.countDivisibles(A, B, M)<<endl;
    }
    return 0;
}
  // } Driver Code Ends
