package progsolutions.ch02.p01;

import static java.lang.System.out;

/**
 * P0201.java
 *
 * @author Jay Morales
 */
class P0201 {
  /**
   * main.
   *
   * @param args args
   */
  public static void main(String[] args) {
    final double millimetersPerInch = 25.4;
    final double paperWidthInches = 8.5;
    final double paperLengthInches = 11.0;
    final double paperWidthMillimeters = paperWidthInches * millimetersPerInch;
    final double paperLengthMillimeters = paperLengthInches * millimetersPerInch;

    out.println("The dimensions of a letter-size sheet of paper in millimeters is "
            + paperWidthMillimeters + " x " + paperLengthMillimeters + " millimeters.");
  }
}
