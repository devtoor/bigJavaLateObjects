package progsolutions.ch02.p13;

import static java.lang.System.in;
import static java.lang.System.out;

import java.util.Scanner;

/**
 * P0213.java
 *
 * @author Jay Morales
 */
class P0213 {
  /**
   * main.
   *
   * @param args args
   */
  public static void main(String[] args) {
    final Scanner input = new Scanner(in);
    out.print("Enter an integer between 1,000 and 999,999,"
            + "using a comma as separator: ");

    final String num = input.next();
    final String prefix = num.substring(0, num.length() - 4);
    final String postfix = num.substring(num.length() - 3);
    out.println(prefix + postfix);
  }
}
