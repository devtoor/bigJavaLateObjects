[Back](../README.md)

## P2.16

Write a program that reads in an integer and breaks it into a sequence of individual digits. For example, the input 16384 is displayed as

```
1 6 3 8 4
``` 

You may assume that the input has no more than five digits and it not negative.

---

Solution:

```java
import static java.lang.System.in;
import static java.lang.System.out;

import java.util.Scanner;

class P0216 
{
  public static void main(String[] args) 
  {
    final Scanner input = new Scanner(in);
    out.print("Enter a positive integer no longer than five digits: ");
    input.nextLine()
                .chars()
                .forEach(x -> out.print(String.valueOf((char) x) + " "));
  }
}
```