public class Food extends Item
{
  private int nutrition, quantity, weight; 
  String name;
  
  public Food (int nutrition, int quantity, String name, int weight)
  {
    super(name, weight);
    this.nutrition = nutrition; 
    this.quantity = quantity;
    this.weight = weight; 
  }
  
  public int getNutrition()
  {
    return nutrition;
  }
  
  public int getQuantity()
  {
    return quantity;
  }
  
  public void setQuantity(int newQuantity) 
  {
    quantity = newQuantity;
  }
  
 public int getWeight()
 {
   return weight;
 }
}
