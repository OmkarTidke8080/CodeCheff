// Progrma ot reverse an array : 

#include<iostream>
#include<stdlib.h>
using namespace std;

void reverse(int Arr[], int size, int index)
{
    int start = index + 1;
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

    int *ptr = NULL;
    int size = 0;
    int index = 0;

    cout<<"Enter size of array : "<<"\n";
    cin>>size;

    ptr = (int *) malloc(size * sizeof(int));


    cout<<"ENter elements of array : "<<"\n";
    for(int i = 0; i < size; i++)
    {
        cin>>ptr[i];
    }

    cout<<"Enter index :"<<"\n";
    cin>>index;

    

    reverse(ptr,size,index);
    Display(ptr,size);


  

    return 0;
}