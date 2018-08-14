[Back](../README.md)

## P2.10

Write a program that helps a person decide whether to buy a hybrid car. Your program's inputs should be:

- The cost of a new car
- The estimate miles driven per year
- The estimated gas price
- The efficiency in miles per gallon
- The estimated resale value after 5 years

Compute the total cost of owning the car for five years. (For simplicity, we will not take the cost of financing into account.) Obtain realistic prices for a new and used hybrid and a comparable car from the Web. Run your program twice, using today's gas price and 15,000 miles per year. Include pseudocode and the program runs with your assignment.

---

Solution:

```java
import static java.lang.System.in;
import static java.lang.System.out;

import java.util.Scanner;

class P0210 
{
  public static void main(String[] args) 
  {
    final Scanner input = new Scanner(in);
    final int yearsToOwn = 5;

    out.print("Cost of a new car: ");
    final double carCost = input.nextDouble();
    out.print("Estimated miles driven per year: ");
    final double milesPerYear = input.nextDouble();
    out.print("Estimated gas price: ");
    final double gasPrice = input.nextDouble();
    out.print("Miles per gallon: ");
    final double milesPerGallon = input.nextDouble();
    out.print("Estimated resale value after 5 years: ");
    final double resaleValue = input.nextDouble();

    final double totalCost = carCost + milesPerYear / milesPerGallon * gasPrice
            * yearsToOwn - resaleValue;

    out.printf("Total cost for %d years: $%,.2f", yearsToOwn, totalCost);
  }
}
```