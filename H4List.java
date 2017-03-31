public class H4List
{
  private Node head, tail, curr;
  private int size;
  
  public H4List()
  {
    head = null;
    tail = null;
    curr = null;
    size = 0;
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
  
  
  //special case insert at end
  /*public int insertLast(String element)
  {
    Node node = new Node(element)
      
    if(this.isEmpty())
    {
      tail = node;
      head = node;
      curr = node;
    }
    else
    {
      tail.setNext(node);
      tail = node;
      curr = tail;
    }
    return ++size;
  }*/
    
  
  public int insertAfter(String element)
  {
    Node node = new Node(element);
    
    if(this.isEmpty())
    {
      tail = node;
      head = node;
      curr = node;
    }
    else if(curr == tail)
    {
      tail.setNext(node);
      tail = node;
      curr = tail;
    }
    else
    {
      node.setNext(curr.getNext());
      curr.setNext(node);
      curr = node;
    }
    return ++size;
  }
  
  public int insertBefore(String element)
  {
    Node node = new Node(element);
    Node temp;
    
    if(this.isEmpty())
    {
      tail = node;
      head = node;
      curr = node;
    }
    else if(curr == head)
    {
      node.setNext(curr);
      head = node;
      curr = node;
    }
    else
    {
      temp = head;
      
      while(temp.getNext() != curr)
      {
        temp.setNext(temp.getNext());
      }
      temp.setNext(node);
      node.setNext(curr);
      curr = node;
    }
    
    return ++size;
  }
  
  public String deleteCurr()
    {
    Node node;
    String element;
    
    if(this.isEmpty())
    {
      element = null;
    }
    else if(size == 1)
    {
      element = curr.getElem();
      head = null;
      curr = null;
      tail = null;
    }
    else if(curr == head)
    {
      element = curr.getElem();
      head = curr.getNext();
      curr = head;
    }
    
    else
    {
     node = head;
     while(node.getNext() != curr)
     {
       node = node.getNext();
     }
     node.setNext(curr.getNext());
     element = curr.getElem();
     if(curr == tail)
     {
       tail = node;
     }
     curr = node;
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
    element = curr.getElem();
  }
  
  return element;
}  
}
    
    
    
    
    
    
    