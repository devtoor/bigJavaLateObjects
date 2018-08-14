package progsolutions.ch02.p17;

import static java.lang.System.in;
import static java.lang.System.out;

import java.util.Scanner;

/**
 * P0217.java
 *
 * @author Jay Morales
 */
class P0217 {
  private static final int MINUTES_PER_HOUR = 60;
  private static final int MINUTES_PER_DAY = 24 * 60;

  /**
   * main.
   *
   * @param args args
   */
  public static void main(String[] args) {
    final Scanner input = new Scanner(in);
    out.print("Enter the first time: ");
    final int firstTime = input.nextInt();
    out.print("Please enter the second time: ");
    final int secondTime = input.nextInt();
    final int firstTimeInMinutes = firstTime / 100 * MINUTES_PER_HOUR + firstTime % 100;
    final int secondTimeInMinutes = secondTime / 100 * MINUTES_PER_HOUR + secondTime % 100;
    int diff = secondTimeInMinutes - firstTimeInMinutes;
    diff = (MINUTES_PER_DAY + diff) % MINUTES_PER_DAY;
    final int hours = diff / MINUTES_PER_HOUR;
    final int minutes = diff % MINUTES_PER_HOUR;

    out.printf("%d hours %d minutes", hours, minutes);
  }
}
