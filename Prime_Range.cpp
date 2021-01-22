#include <bits/stdc++.h>
using namespace std;


class Solution {
  public:
    vector<int> primeRange(int M, int N) {
        for(int i=M;i<=N;i++){
            for(int j=2;j<=i;j++){
                if(i%j==0){
                    break;
                }
                else{
                    cout<<i<<"\n";
                }
            }
        }
    }
};


int main() {
    int t;
    cin >> t;
    while (t--) {
        int N, M, K;
        cin >> M >> N;
        Solution ob;
        vector<int> ans = ob.primeRange(M, N);
        for (auto u : ans) cout << u << " ";
        cout << "\n";
    }
}  // } Driver Code Ends
