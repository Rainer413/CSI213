import java.util.*;

public class Main
{
  public static void main(String[] args)
  {
    Food banana = new Food(100, 5, "Banana", 10); 
    Armor shield = new Armor(50, "Shield", 45); 
    Weapon knife = new Weapon(75, "Knife", 30); 
    
    //Testing Get Nutrition 
    System.out.println("The nutrition of a " + banana.getName() + " is " + banana.getNutrition());
    
    //Testing Get Quantity, Set Quantity 
    System.out.println("The original quantity of a " + banana.getName() + " is " + banana.getQuantity());
    banana.setQuantity(9); 
    System.out.println("The new quantity of a " + banana.getName() + " is " + banana.getQuantity());
    
    //Testing Get Weight 
    System.out.println("The weight of a " + banana.getName() + " is " + banana.getWeight());
    
    //Testing Get Defense 
    System.out.println("The defense of the " + shield.getName() + " is " + shield.getDefense());
    
    //Testing Get Damage
    System.out.println("The amount of damage a " + knife.getName() + " causes is " + knife.getDamage()); 
    
 
  }
}