package progsolutions.ch02.p07;

import static java.lang.Math.PI;
import static java.lang.Math.pow;
import static java.lang.System.in;
import static java.lang.System.out;

import java.util.Scanner;

/**
 * P0207.java
 *
 * @author Jay Morales
 */
class P0207 {
  /**
   * main.
   *
   * @param args args
   */
  public static void main(String[] args) {
    out.print("Enter radius: ");
    final double radius = new Scanner(in).nextDouble();

    out.printf("%-24s%,16.2f\n", "Area:", pow(radius, 2) * PI);
    out.printf("%-24s%,16.2f\n", "Circumference:", 2 * radius * PI);
    out.printf("%-24s%,16.2f\n", "Volume of sphere:", 4 * PI * pow(radius, 3) / 3);
    out.printf("%-24s%,16.2f\n", "Surface area of sphere:", 4 * PI * pow(radius, 2));
  }
}
