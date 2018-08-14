package progsolutions.ch01.p15;

import static java.lang.System.out;

import javax.swing.JOptionPane;

/**
 * P0115.java
 *
 * @author Jay Morales
 */
class P0115 {
  /**
   * main.
   *
   * @param args args
   */
  public static void main(String[] args) {
    String name = JOptionPane.showInputDialog("What is your name?");
    out.println("Hello, " + name + "!");
  }
}
