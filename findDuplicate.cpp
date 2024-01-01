#include<iostream>
using namespace std;

void findDuplicate(int Arr[], int size)
{
     int iCnt = 0;  // counter of element
     int ans = 0;

     for(int i = 0; i<size; i++)
     {
        // XOR ing all elements of array
        ans = ans ^ Arr[i];
     }

     for(int i = 1; i < size; i++)
     {
        //XOR [1,n-1]
        ans = ans ^ i;

     }

     cout<<"The duplicate elements is "<<ans<<"\n";

}
int main()
{
   int *ptr = NULL;
   int size = 0;


   cout<<"Enter the size of array : "<<"\n";
   cin>>size;

    ptr = (int *)malloc(size * sizeof(int));

   cout<<"Enter elements of array : "<<"\n";

   for(int i = 0; i < size; i++)
   {
     cin>>ptr[i];
   }

   findDuplicate(ptr,size);
}