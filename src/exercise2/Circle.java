package exercise2;

import java.util.Scanner;

public class Circle{

  public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.println("Enter the Radius: ");
    double R = input.nextInt();
    double C = 2 * 3.14 * R;
    double A = 3.14 * R * R;

    System.out.println("Circumference: " + C);
    System.out.println("Area: " + A);

  }
}
