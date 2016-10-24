// Rainer Alvarado
// CSI 213

public class LinkedList
{
  private Node first; //list head
  private Node last; //last item in list
  
  public LinkedList()
  {
    first = null;
    last = null;
  }
  
  public boolean isEmpty()
  {
    return first == null;
  }
  
  public int size()
  {
    int count = 0;
    Node n = first;
    while(n != null)
    {
      //there is an element at n
      count ++;
      n = n.next;
    }
    return count;
  }
  
  public void add (double d)
  {
    if (isEmpty())
    {
      first = new Node(d);
      last = first;
    }
    else
    {
      //add to end of existing list
      last.next = new Node(d);
      last = last.next;
    }
  }
  
  public void add(int index, double d)
  {
    if (index < 0 || index > size())
    {
      String message = String.valueOf(index);
      throw new IndexOutOfBoundsException(message);
    }
    
    //index is at least 0
    if (index == 0)
    {
      //New element goes at beginning
      first = new Node(d, first);
      if (last == null)
        last = first;
      return;
    }
    
    Node pre = first;
    for (int i = 1; i <= index - 1; i++)
    {
      pre = pre.next;
    }
    
    pre.next = new Node(d, pre.next);
    
    if(pre.next.next == null)
      last = pre.next;
  }
  
  public String toString()
  {
    StringBuilder str = new StringBuilder();
    Node ref = first;
    
    while (ref != null)
    {
      str.append(ref.value + "\n");
      ref = ref.next;
    }
    
    return str.toString();
  }
  
  public double remove(int index)
  {
    if (index < 0 || index >= size())
    {
      String message = String.valueOf(index);
      throw new IndexOutOfBoundsException(message);
    }
    
    double element;
    if (index == 0)
    {
      element = first.value;
      first = first.next;
      if (first == null)
        last = null;
    }
    else
    {
      Node pre = first;
      
      for (int i = 1; i <= index - 1; i++)
        pre = pre.next;
      
      element = pre.next.value;
      pre.next = pre.next.next;
      
      if (pre.next == null)
        last = pre;
    }
    return element;
  }
  
  public boolean remove(double element)
  {
    if (isEmpty())
      return false;
    if (element == first.value)
    {
      first = first.next;
      if (first == null)
        last = null;
      return true;
    }
    
    Node pre = first;
    while (pre.next != null && !(pre.next.value == element))
    {
      pre = pre.next;
    }
    
    if (pre.next == null)
      return false;
    
    pre.next = pre.next.next;
    
    if (pre.next == null)
      last = pre;
    
    return true;
  }
}