#include<iostream>
#include <vector>
#include <climits>
using namespace std;

// optimized solution

vector<int> findInterSection(int Arr1[], int size1,int Arr2[],int size2)
{
   int i = 0;
   int j = 0;
   vector<int>ans;

   while(i < size1 && j < size2)
   {
      if(Arr1[i] == Arr2[j])
      {
        ans.push_back(Arr1[i]);
        i++;
        j++;
      }
      else if(Arr1[i] < Arr2[j])
      {
        i++;
      }
      else
      {
        j++;
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