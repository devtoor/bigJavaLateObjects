[Back](../README.md)

## P2.4

Write a program that prompts the user for two integers and then prints
- The sum
- The difference
- The product
- The average
- The distance (absolute value of the difference)
- The maximum (the larger of the two)
= The minimum (the smaller of the two)
_Hint:_ The `max` and `min` functions are declared in the `Math` class.

---

Solution:

```java
import static java.lang.Math.abs;
import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.System.in;
import static java.lang.System.out;

import java.util.Scanner;

public class P0204 
{
  public static void main(String[] args) 
  {
    Scanner input = new Scanner(in);

    out.print("Enter the first number: ");
    final int first = input.nextInt();

    out.print("Enter the second number: ");
    final int second = input.nextInt();

    out.println("Sum: " + (first + second));
    out.println("Difference: " + (first - second));
    out.println("Product: " + (first * second));
    out.println("Average: " + (first + second) / 2.0);
    out.println("Distance: " + abs(first - second));
    out.println("Max: " + max(first, second));
    out.println("Min: " + min(first, second));
  }
}
```