package progsolutions.ch02.p08;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import static java.lang.System.in;
import static java.lang.System.out;

import java.util.Scanner;

/**
 * P0208.java
 *
 * @author Jay Morales
 */
class P0208 {
  /**
   * main.
   *
   * @param args args
   */
  public static void main(String[] args) {
    final Scanner input = new Scanner(in);
    out.print("Enter width: ");
    final double width = input.nextDouble();
    out.print("Enter height: ");
    final double height = input.nextDouble();

    out.printf("%-12s%,12.2f\n", "Area:", width * height);
    out.printf("%-12s%,12.2f\n", "Perimeter:", width * 2 + height * 2);
    out.printf("%-12s%,12.2f\n", "Diagonal:", sqrt(pow(width, 2) + pow(height, 2)));
  }
}
