
#include <bits/stdc++.h>
using namespace std;


 // } Driver Code Ends


void merge(int arr1[], int arr2[], int n, int m)
{
    int o = n + m;
		int arr3[o];
		for (int i=0;i<n;i++) {

			arr3[i]=arr1[i];
		}

		for (int i=0;i<m;i++) {

			arr3[n+i]=arr2[i];
		}


		int temp;
		for(int i=0;i<o;i++){
            for(int j=i+1;j<o;j++){
                if(arr3[i]>arr3[j]){
                        temp=arr3[i];
                        arr3[i]=arr3[j];
                        arr3[j]=temp;

                }
            }
        }

		for (int i=0;i<n;i++) {
            cout<<arr1[i]<<" ";
            //arr1[i]=arr3[i];
            //arr2[n+i]=arr3[i];
		}

        for (int e=0;e<n;e++) {

			//cout<<arr2[e]<<" ";
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

        //for (int i = 0; i < n; i++)
          //  printf("%d ", arr1[i]);
            //cout<<"---------------------------------";


	  //  for (int i = 0; i < m; i++)
		//    printf("%d ", arr2[i]);

	   // cout<<endl;
	}

	return 0;
}
  // } Driver Code Ends
