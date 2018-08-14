[Back](../README.md)

## P2.3

Write a program that reads a number and displays the square, cube, and fourth power. Use the `Math.pow` method only for the fourth power.

---

Solution:

```java
import static java.lang.Math.pow;
import static java.lang.System.in;
import static java.lang.System.out;

import java.util.Scanner;

public class P0203 
{
  public static void main(String[] args) 
  {
    Scanner input = new Scanner(in);
    out.print("Enter a number: ");
    final double num = input.nextDouble();

    out.println("Square: " + num * num);
    out.println("Cube: " + num * num * num);
    out.println("Fourth power: " + pow(num, 4));
  }
}
```