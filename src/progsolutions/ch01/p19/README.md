[Back](../README.md)

## Business P1.19

In the United States there is no federal sales tax, so every state may impose its own sales taxes. Look on the Internet for the sales tax charged in five U.S. states, then write a program that prints the tax rate for five states of your choice.

```bash
Sales Tax Rates
---------------
Alaska:      0%
Hawaii:      4%
. . .
```

---

Solution:

```java
import static java.lang.System.out;

class P0119 
{
  public static void main(String[] args) 
  {
    out.println("  State Tax Rates  ");
    out.println("--------------------");
    out.println("New York\t\t4.0%");
    out.println("New Jersey\t\t6.6%");
    out.println("Connecticut\t\t6.3%");
    out.println("Vermont\t\t\t6.0%");
    out.println("Florida\t\t\t6.0%");
  }
}
```