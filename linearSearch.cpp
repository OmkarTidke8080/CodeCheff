#include<iostream>
using namespace std;

bool Search(int Arr[], int size, int targetElement)
{
   for(int i = 0; i < size; i++)
   {
    if(Arr[i] == targetElement)
    {
        return true;
    }
   
   }

   return  false;
}

int main()
{
    int arr[10] = {5, 7, -2, 10, 22, -2, 0, 5, 23, 1};

    // whether 10 is present in the array of not
    cout<<"Enter the target element to search"<<"\n";
    int targetElement;
    cin>>targetElement;

    bool found = Search(arr,10,targetElement);
    
    if(found == true)
    {
        cout<<"Target element is present inside the array "<<"\n";
    }
    else
    {
        cout<<"Target element is not present inside the array "<<"\n";

    }




}