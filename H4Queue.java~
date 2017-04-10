public class H4Queue
{
  
  private Node head;
  private Node tail;
  private int size;
  
  public H4Queue()
  {
    this.tail = null;
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


  public int enqueue(String element)
  {
    Node node = new Node(element);
    
    if(this.isEmpty())
    {
      tail = node;
      head = node;
    }
    else
    {
      tail.setNext(node);
      tail = node;
    }
    return ++size;
  }
  
  public String dequeue()
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
      
      if(this.isEmpty())
      {
        tail = head;
      }
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
   