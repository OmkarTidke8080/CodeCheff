//Accept number from user and  print that number of even numbers 

#include<iostream>
using namespace std;

void printEven(int iNo)
{
    int iCnt = 1;
    int i = 0;

    while(iCnt <= iNo)
    {
        
            if( (i % 2) == 0)
            {
                cout<<i<<"\n";
            }
            i = i + 2;
            iCnt++;
        
    }
}

int main()
{
    int iNo = 0;

    cout<<"Enter number : "<<"\n";
    cin>>iNo;

    printEven(iNo);

    return 0;
}