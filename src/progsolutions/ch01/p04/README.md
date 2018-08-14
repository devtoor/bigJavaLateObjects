[Back](../README.md)

## P1.4

Write a program that prints the balance of an account after the first, second, and third year. The account has an initial balance of $1,000 and earns 5 percent interest per year.

---

Solution:

```java
import static java.lang.System.out;

class P0104 
{
  public static void main(String[] args) 
  {
    out.println(1000 * 1.05);
    out.println(1000 * 1.05 * 1.05);
    out.println(1000 * 1.05 * 1.05 * 1.05);
  }
}
```