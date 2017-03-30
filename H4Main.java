public class H4Main
{
  public static void main(String[] args)
  {
    Stack i = new Stack();
    System.out.println("stack: " + i);
    
    push(i, "1");
    push(i, "2");
    push(i, "3");
    
    System.out.println(i);
  }
}