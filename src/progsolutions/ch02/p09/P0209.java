package progsolutions.ch02.p09;

import static java.lang.System.in;
import static java.lang.System.out;

import java.util.Scanner;

/**
 * P0209.java
 *
 * @author Jay Morales
 */
class P0209 {
  private static final int PENNIES_PER_DOLLAR = 100;
  private static final int PENNIES_PER_QUARTER = 25;

  /**
   * main.
   *
   * @param args args
   */
  public static void main(String[] args) {
    final Scanner input = new Scanner(in);
    out.print("Enter bill value (1 = $1 bill, 5 = $5 bill, etc.): ");
    final int bill = input.nextInt();
    out.print("Enter quarter value (1 = $.25, 2 = $.50, etc.): ");
    final int quarterValue = input.nextInt();
    out.print("Enter item price in pennies: ");
    final int itemPrice = input.nextInt();

    int changeDue = bill * PENNIES_PER_DOLLAR + quarterValue * PENNIES_PER_QUARTER - itemPrice;
    int dollarCoins = changeDue / PENNIES_PER_DOLLAR;
    changeDue %= PENNIES_PER_DOLLAR;
    int quarters = changeDue / PENNIES_PER_QUARTER;

    out.printf("%-15s%d\n", "Dollar coins:", dollarCoins);
    out.printf("%-15s%d\n", "Quarter:", quarters);
  }
}
