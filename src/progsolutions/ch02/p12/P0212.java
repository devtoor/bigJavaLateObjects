package progsolutions.ch02.p12;

import static java.lang.System.in;
import static java.lang.System.out;

import java.util.Scanner;

/**
 * P0212.java
 *
 * @author Jay Morales
 */
class P0212 {
  /**
   * main.
   *
   * @param args args
   */
  public static void main(String[] args) {
    final Scanner input = new Scanner(in);

    out.print("Enter the drive letter: ");
    final String drive = input.next();
    System.out.print("Enter the path: ");
    final String path = input.next();
    out.print("Please enter the filename: ");
    final String filename = input.next();
    out.print("Please enter the extension: ");
    final String extension = input.next();

    out.println(drive + ":\\" + path + "\\" + filename + "." + extension);
  }
}
