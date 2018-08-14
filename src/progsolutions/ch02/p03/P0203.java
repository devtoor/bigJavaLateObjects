package progsolutions.ch02.p03;

import static java.lang.Math.pow;
import static java.lang.System.in;
import static java.lang.System.out;

import java.util.Scanner;

/**
 * P0203.java
 *
 * @author Jay Morales
 */
class P0203 {
  /**
   * main.
   *
   * @param args args
   */
  public static void main(String[] args) {
    Scanner input = new Scanner(in);
    out.print("Enter a number: ");
    final double num = input.nextDouble();

    out.println("Square: " + num * num);
    out.println("Cube: " + num * num * num);
    out.println("Fourth power: " + pow(num, 4));
  }
}
