[Back](../README.md)

## P2.7

Write a program that prompts the user for a radius and then prints
- The area and circumference of a circle with that radius
- The volume and surface area of a sphere with that radius

---

Solution:

```java
import static java.lang.Math.PI;
import static java.lang.Math.pow;
import static java.lang.System.in;
import static java.lang.System.out;

import java.util.Scanner;

class P0207 
{
  public static void main(String[] args) 
  {
    out.print("Enter radius: ");
    final double radius = new Scanner(in).nextDouble();

    out.printf("%-24s%,16.2f\n", "Area:", pow(radius, 2) * PI);
    out.printf("%-24s%,16.2f\n", "Circumference:", 2 * radius * PI);
    out.printf("%-24s%,16.2f\n", "Volume of sphere:", 4 * PI * pow(radius, 3) / 3);
    out.printf("%-24s%,16.2f\n", "Surface area of sphere:", 4 * PI * pow(radius, 2));
  }
}
```