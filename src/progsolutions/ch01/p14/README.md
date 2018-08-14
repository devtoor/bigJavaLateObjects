[Back](../README.md)

## P1.14

Type in and run the following program:

```java
import javax.swing.JOptionPane;

public class DialogViewer
{
  public static void main(String[] args)
  { 
    JOptionPane.showMessageDialog(null, "Hello, World!"); 
  }
}
```

Then modify the program to show the message "Hello, *your name*!".

---

Solution:

```java
import javax.swing.JOptionPane;

class P0114 
{
  public static void main(String[] args) 
  {
    JOptionPane.showMessageDialog(null, "Hello, Jay!");
  }
}
```