public class H42Main
{
  public static void main(String[] args)
  {
    H4Stack stack = new H4Stack();
    H4Queue queue = new H4Queue();
    H4Stack temp = new H4Stack();
    String element;
    System.out.printf("Size of queue = %d\n", queue.getSize());
    
    queue.enqueue("Inigo Montoya");
    queue.enqueue("Is");
    queue.enqueue("My Name");
    queue.enqueue("Hello");
    
    queue.forwardTraverse();
    
    while(!queue.isEmpty())
    {
      element = queue.dequeue();
      temp.push(element);
    }
    while(!temp.isEmpty())
    {
      element = temp.pop();
      stack.push(element);
    }
    
    stack.forwardTraverse();
  }
}