public class Weapon extends Item 
{
  private int damage, weight;
  String name; 
  
  public Weapon (int damage, String name, int weight) 
  {
    super(name, weight); 
    this.damage = damage; 
  }
  
  public int getDamage()
  {
    return damage;
  }
}