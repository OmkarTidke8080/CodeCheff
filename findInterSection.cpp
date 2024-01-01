#include<iostream>
#include <vector>
#include <climits>
using namespace std;

vector<int> findInterSection(int Arr1[], int size1,int Arr2[],int size2)
{
    std::vector<int> ans;

   for(int i = 0; i < size1; i++)
   {
    int element = Arr1[i];

    for(int j = 0; j < size2; j++)
    {
        if(element < Arr2[j])  // for optimization
        {
            break;
        }
        if(element == Arr2[j])
        {
            ans.push_back(element);
            Arr2[j] = INT_MIN;
            break;
        }
    }
   }

   return ans;

}
int main()
{
   int *ptr1 = NULL;
   int *ptr2 = NULL;
   int iRet = 0;

   int size1 = 0;
      int size2 = 0;

   cout<<"Enter the size of array : "<<"\n";
   cin>>size1;
   cout<<"Enter the size of array : "<<"\n";
   cin>>size2;

    ptr1 = (int *)malloc(size1 * sizeof(int));
    ptr2 = (int *)malloc(size1 * sizeof(int));


   cout<<"Enter elements of array 1 : "<<"\n";

   for(int i = 0; i < size1; i++)
   {
     cin>>ptr1[i];
   }

    cout<<"Enter elements of array 2 : "<<"\n";

   for(int i = 0; i < size2; i++)
   {
     cin>>ptr2[i];
   }
   
   // use the returned vector from InterSection 
  vector<int> result = findInterSection(ptr1, size1, ptr2, size2);

    cout << "Intersection of array is: ";
    for (int i = 0; i < result.size(); i++)
    {
        cout << result[i] << " ";
    }

    // Free allocated memory
    free(ptr1);
    free(ptr2);
   
}