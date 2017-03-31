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
}
