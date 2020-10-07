package exercise2;

import java.util.Scanner; 

public class SumOfDigits{

  public static void main(String[] args){

  Scanner input = new Scanner(System.in);

  System.out.println("Enter a number between 0 and 999: ");
  int a = input.nextInt();
  int d1 = a%10;
  a=a/10;
  int d2 = a%10;
  a=a/10;
  int d3 = a%10;

  System.out.println("Sum of digits: " + (d1+d2+d3));
  }
}