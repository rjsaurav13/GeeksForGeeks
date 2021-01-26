
#include <bits/stdc++.h>

using namespace std;


 // } Driver Code Ends


//User function template for C++
class Solution{
public:
	vector<int> kLargest(int arr[], int n, int k) {
	    int temp;
	     for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]<arr[j]){
                        temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;

                }
            }
        }
        for(int i=0;i<k;i++){
            cout<<arr[i]<<" ";

        }


	}

};

// { Driver Code Starts.

int main() {
    int t;
    cin >> t;
    while (t--) {
        int n, k;
        cin >> n >> k;
        int arr[n];
        for (int i = 0; i < n; i++) {
            cin >> arr[i];
        }
        Solution ob;
        auto ans = ob.kLargest(arr, n, k);
        for (auto x : ans) {
            cout << x << " ";
        }
        cout << "\n";
    }
    return 0;
}
  // } Driver Code Ends
