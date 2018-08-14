package progsolutions.ch02.p10;

import static java.lang.System.in;
import static java.lang.System.out;

import java.util.Scanner;

/**
 * P0210.java
 *
 * @author Jay Morales
 */
class P0210 {
  /**
   * main.
   *
   * @param args args
   */
  public static void main(String[] args) {
    final Scanner input = new Scanner(in);
    final int yearsToOwn = 5;

    out.print("Cost of a new car: ");
    final double carCost = input.nextDouble();
    out.print("Estimated miles driven per year: ");
    final double milesPerYear = input.nextDouble();
    out.print("Estimated gas price: ");
    final double gasPrice = input.nextDouble();
    out.print("Miles per gallon: ");
    final double milesPerGallon = input.nextDouble();
    out.print("Estimated resale value after 5 years: ");
    final double resaleValue = input.nextDouble();

    final double totalCost = carCost + milesPerYear / milesPerGallon * gasPrice
            * yearsToOwn - resaleValue;

    out.printf("Total cost for %d years: $%,.2f", yearsToOwn, totalCost);
  }
}
