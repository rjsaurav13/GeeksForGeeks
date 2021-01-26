#include <bits/stdc++.h>
using namespace std;

void rearrange(long long *arr, int n)
{   int arr2[n];
	 for(int i=0;i<n;i++){
            arr2[i]=arr[i];
            arr[i]=0;
	 }
	 for(int i=1;i<=n;i++){
      if(i%2==1){
            arr[i]=arr2[n-i];
	 }
	 for(int i=1;i<=n;i++){
      if(i%2==0){
            arr[i]=arr2[i];
	 }


}
	 }
}
int main()
{
    int t;

    //testcases
    cin >> t;

    while(t--){

        //size of array
        int n;
        cin >> n;

        long long arr[n];

        //adding elements to the array
        for(int i = 0;i<n;i++){
            cin >> arr[i];
        }

        //calling rearrange() function
        rearrange(arr, n);

        //printing the elements
        for (int i = 0; i < n; i++)
		    cout << arr[i] << " ";

		cout << endl;
    }
	return 0;
}
  // } Driver Code Ends
