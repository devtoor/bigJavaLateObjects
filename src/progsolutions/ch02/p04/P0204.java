package progsolutions.ch02.p04;

import static java.lang.Math.abs;
import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.System.in;
import static java.lang.System.out;

import java.util.Scanner;

/**
 * P0204.java
 *
 * @author Jay Morales
 */
class P0204 {
  /**
   * main.
   *
   * @param args args
   */
  public static void main(String[] args) {
    Scanner input = new Scanner(in);

    out.print("Enter the first number: ");
    final int first = input.nextInt();

    out.print("Enter the second number: ");
    final int second = input.nextInt();

    out.println("Sum: " + (first + second));
    out.println("Difference: " + (first - second));
    out.println("Product: " + (first * second));
    out.println("Average: " + (first + second) / 2.0);
    out.println("Distance: " + abs(first - second));
    out.println("Max: " + max(first, second));
    out.println("Min: " + min(first, second));
  }
}
