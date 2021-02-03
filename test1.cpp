#include<iostream>
using namespace std;
int main()
{
int N;
cin>>N;
int count=0;
for(int i=1;i<=N;i++){

    int number=i;
    while (number > 0)
    {
        if(number % 10 == 2)
            count++;

        number = number / 10;
    }

}
  cout<<count;

return 0;
}
