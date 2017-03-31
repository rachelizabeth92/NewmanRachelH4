public class H4Main
{
  public static void main(String[] args)
  {
    H4Queue queue = new H4Queue();
    String element;
    System.out.printf("Size of queue = %d\n", queue.getSize());
    
    queue.enqueue("Hello");
    queue.enqueue("My Name");
    queue.enqueue("Is");
    
    System.out.printf("Size of queue = %d\n", queue.getSize());
    
    element = queue.dequeue();
    
    System.out.printf("Old head %s  New head %s\n", element, queue.peek());
    
  }
}