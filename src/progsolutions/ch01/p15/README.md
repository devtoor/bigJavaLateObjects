[Back](../README.md)

## P1.15

Type in and run the following program:

```java
import javax.swing.JOptionPane;

public class DialogViewer
{ 
  public static void main(String[] args)
  {
    String name = JOptionPane.showInputDialog("What is your name?");
    System.out.println(name);
  }
}
```

Then modify the program to print "Hello, *name*!", displaying the name that the user typed in.

---

Solution:

```java
import static java.lang.System.out;

import javax.swing.JOptionPane;

class P0115 
{
  public static void main(String[] args) 
  {
    String name = JOptionPane.showInputDialog("What is your name?");
    out.println("Hello, " + name + "!");
  }
}
```