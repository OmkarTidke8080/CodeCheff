/* Find First and Last element in a sorted array*/

#include<iostream>
using namespace std;

void Position(int Arr[],int size, int k)
{
   int Firstipos = 0;
   int LastiPos = 0;

   for(int i = 0; i < size; i++ )
   {
    if(Arr[i] == k)
    {
      Firstipos = i;
      break;
    }
   }

   cout<<"First Occurence "<<Firstipos;

   for(int j = size; j >= 0 ; j--)
   {
     if(Arr[j] == k)
     {
        LastiPos = j;
        break;
     }
   }

   cout<<"The Last Occurence is : "<<LastiPos<<"\n";


}

int main()
{ 
    
    int Arr[6] = {0,5,5,6,6,6};

    Position(Arr,6,6);




    return 0;
}