package exercise2;

import java.util.Scanner;
import java.lang.Math;

public class Circle{

  public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    double R = input.nextInt();
    double C = 2 * Math.PI * R;
    double A = Math.PI * R * R;

    System.out.println("Circumference: " + C);
    System.out.println("Area: " + A);

  }
}
