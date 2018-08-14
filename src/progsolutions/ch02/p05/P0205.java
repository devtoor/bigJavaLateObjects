package progsolutions.ch02.p05;

import static java.lang.Math.abs;
import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.System.in;
import static java.lang.System.out;

import java.util.Scanner;

/**
 * P0205.java
 *
 * @author Jay Morales
 */
class P0205 {
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

    out.printf("%-12s%10d\n", "Sum:", (first + second));
    out.printf("%-12s%10d\n", "Difference:", (first - second));
    out.printf("%-12s%10d\n", "Product:", (first * second));
    out.printf("%-12s%13.2f\n", "Average:", (first + second) / 2.0);
    out.printf("%-12s%10d\n", "Distance:", abs(first - second));
    out.printf("%-12s%10d\n", "Maximum:", max(first, second));
    out.printf("%-12s%10d\n", "Minimum:", min(first, second));
  }
}
