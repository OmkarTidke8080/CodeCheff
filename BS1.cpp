// Binary search example

#include<iostream>
using namespace std;



int BinarySearch(int Arr[], int size, int key)
{
   int start = 0;
   int end = size - 1;
   int mid = (start + end) / 2;

   /*
     when we want to go to left : end = mid - 1
     when we want to go to right : start = mid + 1
   */

while(start <= end)
{
   if(Arr[mid] == key)
   {
     return mid;
   }
   
   // go to right part
    if(key > Arr[mid])
   {
     start = mid + 1;
   }
   else 
   {
     end = mid - 1;
   }

   mid = (start + end) / 2;
}
return -1;
   
}

int main()
{
    int iRet = 0;

     int Arr[6] = {2,4,6,8,12,18};

    iRet = BinarySearch(Arr,6,18);

    cout<<"The number found at : "<<iRet<<"\n";




    return 0;
}