#include<iostream>
using namespace std;
int main(){
for(int i=1;i<=100;i++){
            int temp1,count=0,temp=i;
            while(i!=0){

                temp1=temp%10;
                if(temp1==9){
                    break;
                }
                else{
                    count++;
                }

            }
            cout<<count;
        }



return 0;
}
