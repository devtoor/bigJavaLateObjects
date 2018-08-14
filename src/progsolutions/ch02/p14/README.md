[Back](../README.md)

## P2.14

Write a program that reads a number between 1,000 and 999,999 from the user and prints it with a comma separating the thousands. Here is a simple dialog; the user input is in color:

```
Please enter an integer between 1000 and 999999: 23456
23,456
```

---

Solution:

```java
import static java.lang.System.in;
import static java.lang.System.out;

import java.util.Scanner;

class P0214 
{
  public static void main(String[] args) 
  {
    final Scanner input = new Scanner(in);
    out.print("Enter an integer between 1000 and 999999: ");
    final String num = input.next();
    final String prefix = num.substring(0, num.length() - 3);
    final String postfix = num.substring(num.length() - 3);

    out.println(prefix + "," + postfix);
  }
}
```