// Doubly Circular linked list in java

public class DoublyCLL {
    public static void main(String[] args) {

        DoublyCL dobj = new DoublyCL();

        dobj.InsertFirst(51);
        dobj.InsertFirst(21);
        dobj.InsertFirst(11);

        dobj.InsertLast(101);
        dobj.InsertLast(121);

        dobj.DeleteFirst();
        dobj.DeleteLast();

       dobj.InsertAtPos(105, 3);
       dobj.DeleteAtPos(3);
        dobj.Display();

        int iRet = dobj.count();

        System.out.println("number of element  : "+iRet);

        
    }
}

class node
{
    public int data;
    public node next;
    public node prev;

    public node(int no)
    {
        data = no;
        next = null;
        prev = null;
    }
}

class DoublyCL
{
    private node first;
    private node last;
    private int count;

    public DoublyCL()
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
            first.prev = newn;
            first = newn;
        }

        last.next = first;
        last.prev = newn;

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
           newn.prev = last;
           last.next = newn;
           last = newn;
        }

        last.next = first;
        newn.prev = last;

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

            first.prev = last;
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
            last = null;

        }
        else
        {
           while(temp.next != last)
            {
                temp = temp.next;
            }
            temp.next = null;

            first.prev = last;
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
         temp.next.prev = newn;

         temp.next = newn;
         newn.prev = temp;

         count++;
       }
    }

    public void DeleteAtPos(int ipos)
    {

       if( (ipos < 1) || (ipos > count))
       {
         System.out.println("Invalid Position");
         return;
       }
       else if(ipos == 1)
       {
        DeleteFirst();
       }
       else if(ipos == count )
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
          
          temp.next = temp.next.next;
          temp.next.prev = null;

          temp.next.prev = temp;

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