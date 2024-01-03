#include<iostream>
using namespace std;

void printArray(int Arr[],int size)
{
    for(int i = 0; i < size; i++)
    {
        cout<< Arr[i] << " ";
    }
    cout<<endl;
}
void sort(int Arr[], int size)
{
    int left = 0;
    int right = size - 1;
    
    while(left < right)
    {        

        while(Arr[left] == 0  && left < right)
        {
            left++;
        }
        while(Arr[right] == 1  && left < right)
        {
            right--;
        }

        if(left < right)
        {
             swap(Arr[left],Arr[right]);
             left++;
             right--;
        }
    }


}




int main()
{
    int Arr[8] = {1,1,0,0,0,0,1,0};

    sort(Arr,8);
    printArray(Arr,8);


    return 0;
}