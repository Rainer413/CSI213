public class Armor extends Item 
{
  private int defense, weight;
  String name;
  
  public Armor (int defense, String name, int weight)
  {
    super(name, weight);
    this.defense = defense;
  }
  
  public int getDefense()
  {
    return defense;
  }
}
