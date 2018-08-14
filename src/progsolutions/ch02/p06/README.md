[Back](../README.md)

## P2.6

Write a program that prompts the user for a measurement in meters and then converts it to miles, feet, and inches.

---

Solution:

```java
import static java.lang.System.in;
import static java.lang.System.out;

import java.util.Scanner;

class P0206 
{
  private static final Scanner input = new Scanner(in);
  private static final double M_PER_MILE = 1609.334;
  private static final double M_PER_FOOT = 0.3048;
  private static final double M_PER_INCH = 0.0254;

  public static void main(String[] args) 
  {
    out.print("Enter measurement in meters: ");
    final double meter = input.nextDouble();

    out.printf("%-8s%.2f", "Miles:", meter / M_PER_MILE);
    out.printf("%-8s%.2f", "Feet:", meter / M_PER_FOOT);
    out.printf("%-8s%.2f", "Inches:", meter / M_PER_INCH);
  }
}
```