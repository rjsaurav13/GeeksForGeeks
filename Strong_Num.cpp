

#include <bits/stdc++.h>
using namespace std;

class Solution {
  public:
    int isStrong(int N) {
        int pro=1;
        for(int i=N;i<=1;i--){
            pro=pro*i;
        }
        cout<<pro;
        return 1;
    }
};


// { Driver Code Starts.
int main() {
    int t;
    cin >> t;
    while (t--) {
        int N;

        cin>>N;

        Solution ob;
        cout << ob.isStrong(N) << endl;
    }
    return 0;
}
