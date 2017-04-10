public class H43Main
{
  public static void main(String[] args)
  {
    H4Stack source = new H4Stack();
    H4Stack temp = new H4Stack();
    H4Stack target = new H4Stack();
    String element;
    System.out.printf("Size of stack = %d\n", source.getSize());
    
    source.push("Inigo Montoya");
    source.push("Is");
    source.push("My Name");
    source.push("Hello");
    
    source.forwardTraverse();
    
    while(!source.isEmpty())
    {
      element = source.pop();
      temp.push(element);
    }
    while(!temp.isEmpty())
    {
      element = temp.pop();
      target.push(element);
    }
    
    target.forwardTraverse();
  }
}