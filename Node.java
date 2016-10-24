// Rainer Alvarado
// CSI 213

public class Node
{
  double value; //value of list element
  Node next;    //Link to next node in the list
  
  Node(double val, Node n)
  {
    value = val;
    next = n;
  }
  
  Node(double val)
  {
    value = val;
    next = null;
  }
}