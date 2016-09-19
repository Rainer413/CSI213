import java.util.*;

public class Main
{
  public static void main(String[] args)
  {
    Food banana = new Food(100, 5, "Banana", 10); 
    Armor shield = new Armor(50, "Shield", 45); 
    Weapon knife = new Weapon(75, "Knife", 30); 
    
    System.out.println("The weight of a " + banana.getName() + " is " + banana.getWeight());
    banana.setQuantity(9); 
    System.out.println("The new quantity for " + banana.getName() + " is " + banana.getQuantity());
  }
}