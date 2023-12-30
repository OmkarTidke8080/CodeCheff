#include<iostream>
using namespace std;

void Reverse(int Arr[], int size)
{
    
    int start = 0;
    int end = size-1;
    int temp = 0;
/*
     while(start <= end)
    {
        //swap(Arr[start],Arr[end]);

       temp =  Arr[start];
       Arr[start] =Arr[end];
       Arr[end] = temp;
       
        start++;
        end--;
    } */

    for(int i = 0; i < size; i= i+2)
    {
        if( i+1 < size)
        {
            temp = Arr[i];
            Arr[i] = Arr[i+1];
            Arr[i+1] = temp;
        }
    }

}

void print(int Arr[], int size)
{
    for(int i = 0; i <= size; i++)
    {
        cout<<Arr[i]<<" ";
    }
    cout<<endl;
}

int main()
{
    int arr[10] = {1,2,3,4,5,6};

     Reverse(arr,5);
     print(arr,5);
}