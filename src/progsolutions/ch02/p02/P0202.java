package progsolutions.ch02.p02;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import static java.lang.System.out;

/**
 * P0202.java
 *
 * @author Jay Morales
 */
class P0202 {
  /**
   * main.
   *
   * @param args args
   */
  public static void main(String[] args) {
    final double paperWidthInches = 8.5;
    final double paperLengthInches = 11.0;
    final double perimeter = (2 * paperWidthInches) + (2 * paperLengthInches);
    final double diagonal = sqrt(pow(paperWidthInches, 2) + pow(paperLengthInches, 2));

    out.println("The perimeter of a letter-size sheet of paper is " + perimeter + " inches.");
    out.println("The length of its diagonal is " + diagonal + " inches.");
  }
}
