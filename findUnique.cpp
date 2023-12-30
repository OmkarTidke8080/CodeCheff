/*You have been given an integer array/list(ARR) of size N. Where N is equal to [2M + 1].

Now, in the given array/list, 'M' numbers are present twice and one number is present only once.

You need to find and return that number which is unique in the array/list.*/

#include<iostream>
using namespace std;

class findUnique
{
   public :
    int unique(int Arr[],int size)
    {
           int ans = 0;

           for(int i = 0; i < size; i++)
           {
              ans = ans^Arr[i];
           }

           return ans;
    }

};

int main()
{
   int size;
   int iRet = 0;

   cout<<"ENter the size of array :"<<"\n";
   cin>>size;

   int i = 0;

   int *ptr = NULL;
   cout<<"Enter the elements : "<<"\n";

    ptr = (int *)malloc(size * sizeof(int));

   for( i = 0; i < size; i++)
   {
     cin>>ptr[i];
   }

   findUnique obj;


   iRet = obj.unique(ptr,size);

   cout<<"The Unique element is : "<<iRet<<"\n";
   
}