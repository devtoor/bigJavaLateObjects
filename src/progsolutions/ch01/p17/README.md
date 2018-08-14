[Back](../README.md)

## P1.17

Type in and run the following program:

```java
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Test
{
  public static void main(String[] args) throws Exception
  {
    URL imageLocation = new URL("http://horstmann.com/java4everyone/duke.gif");
    JOptionPane.showMessageDialog(null, "Hello", "Title", JOptionPane.PLAIN_MESSAGE, 
                                        new ImageIcon(imageLocation));
  }
}
```

Then modify it to show a different greeting and image.

---

Solution:

```java
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

class P0117 
{
  public static void main(String[] args) throws Exception 
  {
    URL imageLocation = new URL("http://horstmann.com/java4everyone/cover.jpg");
    JOptionPane.showMessageDialog(null, "Java for Everyone", "Book",
            JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
  }
}
```