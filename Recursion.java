/*
Rainer Alvarado
CSI213
*/
public class Recursion 
{
  private double guess; 
  private double num, error;
  
  public BabylonianMethod() 
  {
    num = 0.0;
    error = 0.0;
    guess = 0.0; 
  }
  
  public BabylonianMethod(double x, double y) 
  {
    num = x; 
    error = y;
    guess = num / 2.0;
  }

 public void setGuess(double lastGuess)
 {
   guess = .5*(lastGuess + (num / lastGuess)); 
 }
 
 public double BabylonianRoots()
 {
   if (Math.abs(num - (guess * guess)) <= error) 
     return guess;
    else
    {
      setGuess(guess);
      return babylonianRoot();
    }
  }
}