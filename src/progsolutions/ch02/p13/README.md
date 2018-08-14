[Back](../README.md)

## P2.13

Write a program that reads a number between 1,000 and 999,999 from the user, where the user enters a comma in the input. Then print the number without a comma. Here is a simple dialog; the user input is in color:

```
Please enter an integer between 1,000 and 999,999: 23,456
23456
```

_Hint:_ Read the input as a string. Measure the length of the string. Suppose it contains _n_ characters. Then extract substrings consisting of the _n_-4 characters and the last three characters.

---

Solution:

```java
import static java.lang.System.in;
import static java.lang.System.out;

import java.util.Scanner;

class P0213 
{
  public static void main(String[] args) 
  {
    final Scanner input = new Scanner(in);
    out.print("Enter an integer between 1,000 and 999,999,"
            + "using a comma as separator: ");

    final String num = input.next();
    final String prefix = num.substring(0, num.length() - 4);
    final String postfix = num.substring(num.length() - 3);
    out.println(prefix + postfix);
  }
}
``` 