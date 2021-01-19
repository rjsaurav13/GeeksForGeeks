// { Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


 // } Driver Code Ends


void merge(int arr1[], int arr2[], int n, int m)
{
    int k=m+n;
    int arr3[k];
    for(int i=0;i<n;i++){
        arr3[i]=arr1[i];
    }
    for(int j=0;j<m;j++){
        arr3[j+m]=arr2[j];
    }
    for(int i=0;i<k;i++){
        cout<<arr3[i]<<" ";
    }


}


// { Driver Code Starts.

int main()
{

	int T;
	cin >> T;

	while(T--){
	    int n, m;
	    cin >> n >> m;

	    int arr1[n], arr2[m];

	    for(int i = 0;i<n;i++){
	        cin >> arr1[i];
	    }

	    for(int i = 0;i<m;i++){
	        cin >> arr2[i];
	    }

	    merge(arr1, arr2, n, m);

        for (int i = 0; i < n; i++)
            printf("%d ", arr1[i]);


	    for (int i = 0; i < m; i++)
		    printf("%d ", arr2[i]);

	    cout<<endl;
	}

	return 0;
}
  // } Driver Code Ends
