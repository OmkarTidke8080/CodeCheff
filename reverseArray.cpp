// Progrma ot reverse an array : 

#include<iostream>
using namespace std;

void reverse(int Arr[], int size)
{
    int start = 0;
    int end = size - 1;
    int temp = 0;

    while(start <=end)
    {
        temp = Arr[start];
        Arr[start] = Arr[end];
        Arr[end] = temp;    

        start++;
        end--;
    }
}

void Display(int Arr[], int size)
{
    for(int i = 0; i < size; i++)
    {
        cout<<Arr[i]<<"\t";
    }
}
int main()
{

    int Arr[4] = {1,2,3,4};

    reverse(Arr,4);
    Display(Arr,4);


  

    return 0;
}