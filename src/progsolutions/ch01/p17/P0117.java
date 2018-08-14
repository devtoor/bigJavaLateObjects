package progsolutions.ch01.p17;

import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * P0117.java
 *
 * @author Jay Morales
 */
class P0117 {
  /**
   * main.
   *
   * @param args args
   * @throws Exception Exception
   */
  public static void main(String[] args) throws Exception {
    URL imageLocation = new URL("http://horstmann.com/java4everyone/cover.jpg");
    JOptionPane.showMessageDialog(null, "Java for Everyone", "Book",
            JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
  }
}
