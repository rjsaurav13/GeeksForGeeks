// { Driver Code Starts
#include<bits/stdc++.h>
using namespace std;

 // } Driver Code Ends


//User function Template for C++
class Solution
{
public:
    int sumOfDivisors(int N)
    {
        int sum=0;
        for(int i=1;i<=N;i++){
            if(N%i==0){
                    cout<<i<<"\n";
                sum=sum+i+N;
            }
        }
        return sum;
    }
};

// { Driver Code Starts.
int main()
{
    int t;
    cin >> t;
    while (t--)
    {
        int N;
        cin>>N;
        Solution ob;
        int ans  = ob.sumOfDivisors(N);
        cout<<ans<<endl;
    }
    return 0;
}  // } Driver Code Ends
