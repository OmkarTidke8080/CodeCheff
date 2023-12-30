#include<iostream>
using namespace std;

void Reverse(int Arr[], int size)
{
    
    int start = 0;
    int end = size-1;
    int temp = 0;

     while(start <= end)
    {
        //swap(Arr[start],Arr[end]);

       
       temp =  Arr[start];
       Arr[start] =Arr[end];
       Arr[end] = temp;
       
        start++;
        end--;
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
    int arr[10] = {4,8,2,1,3};

     Reverse(arr,5);
     print(arr,5);
}