[Back](../README.md)

## P2.5

Enhance the output of Exercise P2.4 so that the numbers are properly aligned:
```
Sum:            45
Difference:     -5
Product:       500
Average:        22.50
Distance:        5
Maximum:        25
Minimum:        20
```

---

Solution:

```java
import static java.lang.Math.abs;
import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.System.in;
import static java.lang.System.out;

import java.util.Scanner;

class P0205 
{
  public static void main(String[] args) 
  {
    Scanner input = new Scanner(in);

    out.print("Enter the first number: ");
    final int first = input.nextInt();

    out.print("Enter the second number: ");
    final int second = input.nextInt();

    out.printf("%-12s%10d\n", "Sum:", (first + second));
    out.printf("%-12s%10d\n", "Difference:", (first - second));
    out.printf("%-12s%10d\n", "Product:", (first * second));
    out.printf("%-12s%13.2f\n", "Average:", (first + second) / 2.0);
    out.printf("%-12s%10d\n", "Distance:", abs(first - second));
    out.printf("%-12s%10d\n", "Maximum:", max(first, second));
    out.printf("%-12s%10d\n", "Minimum:", min(first, second));
  }
}
```