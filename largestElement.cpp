/*
Problem Statement: Given an array, we have to find the largest element in the array.
*/

#include<iostream>
using namespace std;

void largestElement(int Arr[], int size)
{
    int i = 0;
    int large = Arr[i];

    while(i < size)
    {
        if(Arr[i] > large)
        {
            large = Arr[i];
        }
        i++;
    }

    cout<<"Largest element is  : "<<large;
}

int main()
{
    int *ptr = NULL;
    int size = 0;

    cout<<"Enter size of array : "<<"\n";
    cin>>size;

    ptr = (int *)malloc(size * (sizeof(int)));

    cout<<"enter elements if array : "<<"\n";

    for(int i = 0; i < size; i++)
    {
        cin>>ptr[i];
    }

    largestElement(ptr,size);
    




    return 0;
}

