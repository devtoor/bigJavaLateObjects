package progsolutions.ch02.p06;

import static java.lang.System.in;
import static java.lang.System.out;

import java.util.Scanner;

/**
 * P0206.java
 *
 * @author Jay Morales
 */
class P0206 {
  private static final Scanner input = new Scanner(in);
  private static final double M_PER_MILE = 1609.334;
  private static final double M_PER_FOOT = 0.3048;
  private static final double M_PER_INCH = 0.0254;

  /**
   * main.
   *
   * @param args args
   */
  public static void main(String[] args) {
    out.print("Enter measurement in meters: ");
    final double meter = input.nextDouble();

    out.printf("%-8s%20.5f\n", "Miles:", meter / M_PER_MILE);
    out.printf("%-8s%20.5f\n", "Feet:", meter / M_PER_FOOT);
    out.printf("%-8s%20.5f\n", "Inches:", meter / M_PER_INCH);
  }
}
