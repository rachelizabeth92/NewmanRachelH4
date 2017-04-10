public class H41Main
{
  public static void main(String[] args)
  {
    H4Stack stack = new H4Stack();
    H4Queue queue = new H4Queue();
    H4Stack temp = new H4Stack();
    String element;
    System.out.printf("Size of stack = %d\n", stack.getSize());
    
    stack.push("Inigo Montoya");
    stack.push("Is");
    stack.push("My Name");
    stack.push("Hello");
    
    stack.forwardTraverse();
    
    while(!stack.isEmpty())
    {
      element = stack.pop();
      queue.enqueue(element);
    }
    
    queue.forwardTraverse();
  }
}