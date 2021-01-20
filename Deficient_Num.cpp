// { Driver Code Starts
// Initial Template for C++
#include <bits/stdc++.h>
using namespace std;

 // } Driver Code Ends


// User function Template for C++
class Solution {
  public:
    string isDeficient(long long int x) {
        int sum=0;
        for(int i=1;i<=x;i++){
            if(x%i==0){

                sum=sum+i;
            }
        }
        if(sum>2*x){
            return "NO";
        }
        else{
            return "YES";
        }
    }
};

// { Driver Code Starts.
int main() {
    int t;
    cin >> t;
    while (t--) {
        long long int x;
        cin >> x;
        Solution ob;
        cout << ob.isDeficient(x) << endl;
    }
    return 0;
}
  // } Driver Code Ends
