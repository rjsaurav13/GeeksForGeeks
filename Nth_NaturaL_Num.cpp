
#include <bits/stdc++.h>

using namespace std;


int main() {

    long long N;

    cin >> N;
    vector<long long> num;

         for(long long j=0;j<=N*N;j++){
            long long temp=j;
            int t=1;
            while(temp>0)
            {

            if(temp%10==9){
                    t=0;
                break;
                }
                temp=temp/10;
            }
            if(t==1)
            {
                num.push_back(j);

            }
         }





    cout<<num[N];


return 0;
}
