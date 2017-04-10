public class H4Stack
{
  
  private Node head;
  private int size;
    
    
public H4Stack() 
{
  this.head = null;
  this.size = 0;
} 

public boolean isEmpty()
{
  if(size == 0)
  {
    return true;
  }
  else
  {
    return false;
  }
}
public boolean isFull()
{
 return false; 
}

public int getSize()
{
  return this.size;
}

public int push(String element) 
{
   Node node = new Node(element);
   
   if(this.isEmpty())
   {
     head = node;
   }
   else
   {
     node.setNext(head);
     head = node;
   }
   
   return ++size;
}

public String pop() 
{
  Node node;
  String element;
  
  if(this.isEmpty())
  {
    element = null;
  }
  else
  {  
  node = head;
  head = node.getNext();
  element = node.getElem();
  size--;
  }
  
  return element;
}

public String peek()
{
  String element;
  
  if(this.isEmpty())
  {
    element = null;
  }
  else
  {
    element = head.getElem();
  }
  
  return element;
}
 
public int forwardTraverse()
  {
    Node temp;
    int n = 0;
    System.out.println("S-----");
    
    if(!isEmpty())
    {
     temp = head;
     
     do
     {
       n++;
       if(temp == head)
       {
         System.out.printf("[%d] (%s) \n", n, temp.getElem());
       }
       else
       {
       System.out.printf("[%d] \"%s\" \n", n, temp.getElem());
       }
       temp = temp.getNext();
     }
     while(temp != null);
    }
    return n;
  }
}
