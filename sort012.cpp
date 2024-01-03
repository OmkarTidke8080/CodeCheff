
/*
 i/p -  0  2  2  1  0  1  1  0  2

 o/p - 0  0  0  1  1  1  2  2  2

*/

#include<iostream>
using namespace std;

void printArray(int Arr[] , int size)
{
    for(int i = 0; i < size; i++)
    {
        cout<< Arr[i] << " ";
    }
    cout<<endl;
}

void sort(int Arr[], int size)
{
   int low = 0;
   int mid = 0;
   int high = size - 1;

   while(mid < high)
   {
       if(Arr[mid] == 0)
       {
        swap(Arr[mid],Arr[low]);
        mid++;
       }
       else if(Arr[mid] == 1)
       {
        mid++;
        low++;
       }
       else
       {
        swap(Arr[mid], Arr[high]);
        high--;
       }
   }
}

int main()
{
     int Arr[9] = {0 , 2 , 2 , 1,  0 , 1 , 1 , 0 , 2};

    sort(Arr,9);
    printArray(Arr,9);




    return 0;
}