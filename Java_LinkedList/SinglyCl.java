// Singly circular linked list in Java

public class SinglyCl
{
    public static void main(String[] args) {
        SinglyCLL cobj = new SinglyCLL();

        cobj.InsertFirst(200);
        cobj.InsertFirst(100);
        cobj.InsertFirst(51);
        cobj.InsertFirst(21);
        cobj.InsertFirst(11);

        cobj.InsertLast(101);
        cobj.InsertAtPos(105, 3);
        cobj.DeleteAtPos(3);


       int iRet =  cobj.count();
        cobj.Display();

        System.out.println("The number of elements in linked list is : "+iRet);
    }
}

class node
{
    int data;
    node next;

    public node(int no)
    {
        data = no;
        next = null;
    }
}

class SinglyCLL
{
    private node first;
    private node last;
    private int count;

    public SinglyCLL()
    {
        first = null;
        last = null;
        count = 0;
    }

    public void InsertFirst(int no)
    {
        node newn = new node(no);

        if( (first == null) && (last == null))
        {
            first = newn;
            last = newn;
        }
        else 
        {
            newn.next = first;
            first = newn;
        }

        last.next = first;

        count++;
    }

    public void InsertLast(int no)
    {
        node newn = new node(no);

         if( (first == null) && (last == null))
        {
            first = newn;
            last = newn;

            last.next = first;
        }
        else
        {
            last.next = newn;
            last = newn;

            last.next = first;
        }

        count++;
    }

    public void DeleteFirst()
    {
        if( (first == null) && (last == null))
        {
            return;
        }
        else if(first == last)
        {
            first = null;
        }
        else
        {
            first = first.next;
            last.next = first;
        }
        count--;
    }

    public void DeleteLast()
    {
        node temp = first;

        if( (first == null) && (last == null))
        {
            return;
        }
        else if(first == last)
        {
            first = null;
        }
        else
        {
            while(temp.next != last)
            {
                temp = temp.next;
            }
            temp.next = null;

            last.next = first;
        }

        count--;
    }

    public void InsertAtPos(int no,int ipos)
    {
       node newn = new node(no);
       node temp = first;

       if( (ipos < 1) || (ipos > count+1))
       {
         System.out.println("Invalid Position");
       }
       else if(ipos == 1)
       {
        InsertFirst(no);
       }
       else if(ipos == count + 1)
       { 
         InsertLast(no);
       }
       else
       {
         for(int i = 1; i < ipos - 1; i++)
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
         node targetNode = null;

       if( (ipos < 1) || (ipos > count+1))
       {
         System.out.println("Invalid Position");
       }
       else if(ipos == 1)
       {
        DeleteFirst();
       }
       else if(ipos == count + 1)
       { 
        DeleteLast();       
       }
       else
       {
           node temp = first;

          for(int i = 1; i < ipos -1; i++)
          {
            temp = temp.next;
          }
          targetNode = temp.next;
          temp.next = temp.next.next;

          count--;
       }
    }

    public void Display()
    {
        System.out.print("null <==>");
        if( (first != null) && (last != null))
        {
            do
            {
                System.out.print("|"+first.data +"| <==>");
                first = first.next;
            }while(first != last.next);

        }
    }

    public int count()
    {
       return count;
    }
}