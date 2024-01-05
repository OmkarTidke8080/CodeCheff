// Bubble sort problem


#include<iostream>
using namespace std;

void sort(int Arr[], int size)
{
    int i = 0;

   while(i < size)
   {
      if(Arr[i] > Arr[i + 1])
      {
         int temp = Arr[i];
         Arr[i] = Arr[i + 1];
         Arr[i + 1] = temp;
      }

      i++;
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