
#include<bits/stdc++.h>
const int mod=1e9+7;
using namespace std;

int lcs(int, int, string, string);

int main()
{
    int t,n,k,x,y;

    cin>>t;
    while(t--)
    {
        cin>>x>>y;          // Take size of both the strings as input
        string s1,s2;
        cin>>s1>>s2;        // Take both the string as input

        cout << lcs(x, y, s1, s2) << endl;
    }
    return 0;
}
// } Driver Code Ends


// function to find longest common subsequence

int lcs(int x, int y, string s1, string s2){
    int count=0;
    for(int i=1;i<=x;i++){
        for(int j=1;j<=y;j++){
            if(s1[i]==s2[j]){
                count=count+1;
            }else if(s1.length()==1||s2.length()==1&&s1[i]!=s2[j]){
            return 0;
        }
        }
    }
    return count;
}
