/*
 Rainer Alvarado
 CSI 213
*/ 

import java.util.*;

public class MainBabylonianMethod
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    double num, error; //declare variables
    
    //welcome user to the program and prompt user for preferences
    System.out.print("Enter the number that you would like to take the square root of?");
    num = scan.nextDouble();
    System.out.print("How much error will you tolerate in the estimation?");
    error = scan.nextDouble();
    
    //make an instance of the BabylonianSqrt class
    Recursion root = new Recursion(num, error);
    
    //print the babylonian square root according to the user's preferences
    System.out.println("The approximate square root of " + num + " is "
                      + root.BabylonianRoots());
  }
  
}