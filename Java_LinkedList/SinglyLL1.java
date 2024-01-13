// DSA Linked list in java
// singly Linear Linked list

import java.util.*;

public class SinglyLL1
{
   public static void main(String[] args) {
     
    int iRet = 0;

          SinglyLL obj =  new SinglyLL();

          obj.InsertFirst(121);  
          obj.InsertFirst(101);  
          obj.InsertFirst(51);
          obj.InsertFirst(21);
          obj.InsertFirst(11);  

          obj.InsertLast(100);


          obj.DeleteLast();

          obj.DeleteFirst();

         obj.InsertAtPos(105, 3);
         obj.DeleteAtPos(3);

          obj.Display(); 
        iRet =  obj.Count();

        System.out.println("Number of element are : "+iRet);
   
   }
}
// structure
class node
{
    public int data;
    public node next;  // struct node

    public node(int no)
    {
        data = no;
        next = null;
    }
}

class SinglyLL
{
    private node first;
    private int count;

    public SinglyLL()
    {
        first = null;
        count = 0;
    }

    public void InsertFirst(int no)
    {
        node newn = new node(no);

        if(first == null)   // LL is empty
        {
           first = newn;
        }
        else
        {
           newn.next = first;
           first = newn;
        }

        count++;
    }

    public void InsertLast(int no)
    {
        node newn = new node(no);

        if(first == null)   // LL is empty
        {
           first = newn;
        }
        else
        {
            node temp = first;

           while(temp.next != null)
           {
             temp = temp.next;
           }
           temp.next = newn;

        }

        count++;
    }

    public void DeleteFirst()
    {
        if(first == null)  // if LL is empty
        {
            return;
        }
        else if(first.next == null)  // if LL contains single node
        {
            first = null;
        }
        else 
        {
           first = first.next;
        }

        count--;
    }
    public void DeleteLast()
    {
        if(first == null)  // if LL is empty
        {
            return;
        }
        else if(first.next == null)  // if LL contains single node
        {
            first = null;
        }
        else 
        {
           node temp = first;

           while(temp.next.next != null)
           {
             temp = temp.next;
           }
           temp.next = null;
        }

        count--;
    }

    public void InsertAtPos(int no, int ipos)
    {
        
        if( (ipos < 1) || (ipos > (count + 1)))
        {
            return;
        }
        else if(ipos == 1)
        {
            InsertFirst(no);
        }
        else if(ipos == count)
        {
           InsertLast(no);
        }
        else
        {
            node newn = new node(no);
            node temp = first;

            for(int i = 1; i < ipos -1 ; i++)
            {
                temp = temp.next;
            }
            newn.next = temp.next;
            temp.next = newn;
            
            count++;

        }

    }

    public void DeleteAtPos(int ipos)
    {
         if( (ipos < 1) || (ipos > (count)))
        {
            return;
        }
        else if(ipos == 1)
        {
            DeleteFirst();
        }
        else if(ipos == count)
        {
           DeleteLast();
        }
        else
        {
            node temp = first;

            for(int i = 1; i < ipos -1 ; i++)
            {
                temp = temp.next;
            }

            temp.next = temp.next.next;

            count--;

        }

    }
    

    public void Display()
    {
        node temp = first;

        while(temp != null)
        {
            System.out.print("|"+temp.data+"|->");
            temp = temp.next;
        }

        System.out.println("Null");
    }

    public int  Count()
    {
        return  count;
    }

}





