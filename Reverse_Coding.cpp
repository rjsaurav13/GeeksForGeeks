
// { Driver Code Starts

#include <bits/stdc++.h>
using namespace std;

 // } Driver Code Ends



class Solution {
  public:
    int revCoding(int n, int m) {
        int t=n/2;
        float m1;
        if(n%2==0){
            m1=n*t+t;
        }
        else{
            m1=n*(t+0.5)+(t+0.5);
        }

        cout<<m1<<"\n";
        if(m1==m){
            return 1;
        }
        else{
            return 0;
        }
    }
};

// { Driver Code Starts.
int main() {
    int t;
    cin >> t;
    while (t--) {
        int n,m;

        cin>>n>>m;

        Solution ob;
        cout << ob.revCoding(n,m) << endl;
    }
    return 0;
}  // } Driver Code Ends
