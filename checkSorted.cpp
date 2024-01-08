/*
Problem Statement: Given an array of size n, write a program to check if the given array is sorted in (ascending / Increasing / Non-decreasing) order or not. If the array is sorted then return True, Else return False.
*/

#include<iostream>
using namespace std;

bool sorted(int Arr[], int size)
{
   for(int i = 0; i < size; i++)
   {
     for(int j = i + 1; j < size - 1; j++)
     {
        if(Arr[i] < Arr[j])
        {
            return true;
        }
        else
        {
            return false;
        }
     }
   }
}


int main()
{
    int *ptr = NULL;
    int size = 0;
    int bRet = false;

    cout<<"Enter size of array : "<<"\n";
    cin>>size;

    ptr = (int *)malloc(size * (sizeof(int)));

    cout<<"enter elements if array : "<<"\n";

    for(int i = 0; i < size; i++)
    {
        cin>>ptr[i];
    }

    bRet = sorted(ptr,size);

    if(bRet == true)
    {
        cout<<"Array is sorted "<<"\n";
    }
    else if(bRet == false)
    {
        cout<< "Array is not sorted "<<"\n";
    }


   
    




    return 0;
}

