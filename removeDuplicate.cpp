/*
Problem Statement: Given an integer array sorted in non-decreasing order, remove the duplicates in place such that each unique element appears only once. The relative order of the elements should be kept the same.
*/

#include<iostream>
using namespace std;

int duplicates(int Arr[], int size)
{
    int i = 0;

    for(int j = 1; j < size; j++)
    {
        if(Arr[i] != Arr[j])
        {
            i++;
            Arr[i] = Arr[j];
        }
    }

   return i + 1;

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

   int ret =   duplicates(ptr, size);

   cout<<"Array is : "<<"\n";

   for(int j = 0; j < ret; j++)
   {
     cout << ptr[j]<<"\t";
   }

   
    




    return 0;
}

