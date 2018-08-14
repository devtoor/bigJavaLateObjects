package progsolutions.ch02.p16;

import static java.lang.System.in;
import static java.lang.System.out;

import java.util.Scanner;

/**
 * P0216.java
 *
 * @author Jay Morales
 */
class P0216 {
  /**
   * main.
   *
   * @param args args
   */
  public static void main(String[] args) {
    final Scanner input = new Scanner(in);
    out.print("Enter a positive integer no longer than five digits: ");
    input.nextLine()
            .chars()
            .forEach(x -> out.print(String.valueOf((char) x) + " "));
  }
}
