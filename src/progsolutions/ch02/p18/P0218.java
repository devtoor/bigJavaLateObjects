package progsolutions.ch02.p18;

import static java.lang.System.out;

/**
 * P0218.java
 *
 * @author Jay Morales
 */
class P0218 {
  /**
   * main.
   *
   * @param args args
   */
  public static void main(String[] args) {
    final String H = "**   **\n**   **\n*******\n**   **\n**   **\n\n";
    final String E = "*******\n**     \n*******\n**     \n*******\n\n";
    final String L = "**     \n**     \n**     \n**     \n*******\n\n";
    final String O = " ***** \n**   **\n**   **\n**   **\n ***** \n\n";
    out.println(H + E + L + L + O);
  }
}
