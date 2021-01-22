#include <bits/stdc++.h>
using namespace std;

class Solution{
  public:
    int middle(int A, int B, int C){
        if(A>C&&B>C){
            return B;
        }else if(B>A&&C>A){
            return C;
        }
        else if(C>B&&A>B){
            return A;
        }
    }
};

int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        int A,B,C;
        cin>>A>>B>>C;
        Solution ob;
        cout<<ob.middle(A,B,C) <<"\n";
    }
    return 0;
}
