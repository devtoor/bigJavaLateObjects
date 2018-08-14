package progsolutions.ch02.p11;

import static java.lang.System.in;
import static java.lang.System.out;

import java.util.Scanner;

/**
 * P0211.java
 *
 * @author Jay Morales
 */
class P0211 {
  /**
   * main.
   *
   * @param args args
   */
  public static void main(String[] args) {
    final Scanner input = new Scanner(in);
    out.print("Enter number of gallons of gas in the tank: ");
    final double gasGallon = input.nextDouble();
    out.print("Enter fuel efficiency in miles per gallon: ");
    final double milesPerGallon = input.nextDouble();
    out.print("Enter price of gas per gallon: ");
    final double pricePerGallon = input.nextDouble();

    final double costPer100Miles = 100 / milesPerGallon * pricePerGallon;
    final double maxDistanceInMiles = gasGallon * milesPerGallon;

    out.printf("Cost per 100 miles: $%,.2f\n", costPer100Miles);
    out.printf("Maximum distance for current gas in the tank: %,.0f miles\n", maxDistanceInMiles);
  }
}
