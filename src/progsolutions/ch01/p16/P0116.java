package progsolutions.ch01.p16;

import static java.lang.System.out;

import javax.swing.JOptionPane;

/**
 * P0116.java
 *
 * @author Jay Morales
 */
class P0116 {
  /**
   * main.
   *
   * @param args args
   */
  public static void main(String[] args) {
    String name = JOptionPane.showInputDialog("What is your name?");
    out.println("Hello, " + name + "!");

    JOptionPane.showInputDialog("My name is Hal! What would you like me to do?");
    out.println("I'm sorry, " + name + ". I'm afraid I can't do that.");
  }
}
