// Insertion sort

#include<iostream>
using namespace std;

void sort(int Arr[], int size)
{
  for(int i = 1; i < size; i++)
  {
     int temp = Arr[i];
     int j = i-1;
     for(; j >= 0; j--)
     {
         if(Arr[j] >  temp)
         {
             Arr[j+1] = Arr[j];
         }
         else
         {
             break;
         }
     }
     Arr[j + 1] = temp;
  }
}

void Display(int Arr[], int size)
{
    for(int i = 0; i < size; i++)
    {
        cout<<Arr[i]<<endl;
    }
}

int main()
{
    int Arr[5] = {6,2,8,4,10};

    sort(Arr,5);
    Display(Arr,5);




    return 0;
}