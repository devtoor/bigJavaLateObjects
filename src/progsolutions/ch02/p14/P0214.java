package progsolutions.ch02.p14;

import static java.lang.System.in;
import static java.lang.System.out;

import java.util.Scanner;

/**
 * P0214.java
 *
 * @author Jay Morales
 */
class P0214 {
  /**
   * main.
   *
   * @param args args
   */
  public static void main(String[] args) {
    final Scanner input = new Scanner(in);
    out.print("Enter an integer between 1000 and 999999: ");
    final String num = input.next();
    final String prefix = num.substring(0, num.length() - 3);
    final String postfix = num.substring(num.length() - 3);

    out.println(prefix + "," + postfix);
  }
}
