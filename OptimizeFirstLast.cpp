/* Find First and Last element in a sorted array*/
// using binary search

#include<iostream>
using namespace std;

int FirstPosition(int Arr[],int size, int k)
{
   
   int start = 0;
   int end = size - 1;
   int mid =  start +(end - start) / 2;
   int ans = -1;

   while(start <= end)
   {
    if (Arr[mid] == k)
    {
        ans = mid;
        end = mid - 1;
    }
      if(k  > Arr[mid])
      {
         start = mid + 1;
      }

      if(k < Arr[mid])
      {
         end = mid - 1;
      }

       mid =  start + (end - start) / 2;
   }

   return ans;


}


int LastPosition(int Arr[],int size, int k)
{
   
   int start = 0;
   int end = size - 1;
   int mid =  start +(end - start) / 2;
   int ans = -1;

   while(start <= end)
   {
    if (Arr[mid] == k)
    {
        ans = mid;
        start = mid + 1;
    }
      if(k  > Arr[mid])
      {
         start = mid + 1;
      }

      if(k < Arr[mid])
      {
         end = mid - 1;
      }

       mid =  start +(end - start) / 2;
   }

   return ans;

}
int main()
{ 
    
    int Arr[6] = {0,5,5,6,6,6};
    int FirstOccurence = 0;
    int LastOccurence = 0;

     FirstOccurence = FirstPosition(Arr,6,6);

     cout<<"The first occurence is at index : "<<FirstOccurence<<"\n";


     LastOccurence = LastPosition(Arr,6,6);

     cout<<"The first occurence is at index : "<<LastOccurence<<"\n";

    return 0;
}