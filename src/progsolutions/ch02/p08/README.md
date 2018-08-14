[Back](../README.md)

## P2.8

Write a program that asks the user for the lengths of the sides of a rectangle. Then print
- The area and perimeter of the rectangle
- The length of the diagonal (use the Pythagorean theorem)

---

Solution:

```java
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import static java.lang.System.in;
import static java.lang.System.out;

import java.util.Scanner;

class P0208 
{
  public static void main(String[] args) 
  {
    final Scanner input = new Scanner(in);
    out.print("Enter width: ");
    final double width = input.nextDouble();
    out.print("Enter height: ");
    final double height = input.nextDouble();

    out.printf("%-12s%,12.2f\n", "Area:", width * height);
    out.printf("%-12s%,12.2f\n", "Perimeter:", width * 2 + height * 2);
    out.printf("%-12s%,12.2f\n", "Diagonal:", sqrt(pow(width, 2) + pow(height, 2)));
  }
}
```