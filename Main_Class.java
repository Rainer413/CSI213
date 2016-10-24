// Rainer Alvarado
// CSI 213 

public class Main_Class
{
  public static void main(String[] args)
  {
    LinkedList list = new LinkedList();
    
    list.add(.4);
    list.add(77.1);
    list.add(0, 9.2);
    list.add(2, 2.3);
    list.add(4, 3.1415926);
    
    System.out.println("The elements of the list are:");
    System.out.print(list);
    
    System.out.println("\nThe element being removed at index 1 is:");
    System.out.println(list.remove(1));
    
    System.out.println("\nReturns true because the element 2.3 exists in the linked list and is successfully removed:");
    System.out.println(list.remove(2.3));    
    
    System.out.println("\nAttempting to remove the item at index 7 throws an exception:");
    System.out.println(list.remove(7));
  }
}