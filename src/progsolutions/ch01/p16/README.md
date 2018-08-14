[Back](../README.md)

## P1.16

Modify the program from Exercise P1.15 so that the dialog continues with the message "My name is Hal! What would you like me to do?" Discard the user's input and display a message such as

```
I'm sorry, Dave. I'am afraid I can't do that.
```

Replace Dave with the name that was provided by the user.

---

Solution:

```java
import static java.lang.System.out;

import javax.swing.JOptionPane;

class P0116 
{
  public static void main(String[] args) 
  {
    String name = JOptionPane.showInputDialog("What is your name?");
    out.println("Hello, " + name + "!");

    JOptionPane.showInputDialog("My name is Hal! What would you like me to do?");
    out.println("I'm sorry, " + name + ". I'm afraid I can't do that.");
  }
}
```