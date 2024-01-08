/*
Problem Statement: Given an array, find the second smallest and second largest element in the array. Print ‘-1’ in the event that either of them doesn’t exist.
*/

#include<iostream>
using namespace std;

void largestElement(int Arr[], int size)
{
    int largest = Arr[0];
    int slargest = -1;

    for(int i = 1; i < size; i++)
    {
        if(Arr[i] > largest)
        {
       slargest = largest;
       largest = Arr[i];
        }
        else if(Arr[i] < largest && Arr[i] > slargest)
        { 
         slargest = Arr[i];
        }
    }
    

    cout<<"second Largest element is  : "<<slargest<<"\t";
}

void SmallestElement(int Arr[], int size)
{
  int smallest = Arr[0];
  int ssmallest = INT16_MAX;

  for(int i = 1; i < size; i++)
  {
    if(Arr[i] < smallest)
    {
        ssmallest = smallest;
        smallest = Arr[i];
    }
    else if(Arr[i] != smallest && Arr[i] < ssmallest)
    {
        ssmallest = Arr[i];
    }
  }

   cout<<"Second smallest  element is  : "<<ssmallest<<"\t";
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
    SmallestElement(ptr, size);
    




    return 0;
}

