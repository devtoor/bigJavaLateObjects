[Back](../README.md)

## P2.15

_Printing a grid_. Write a program that prints the following grid to play tic-tac-toe.

```
+---+---+---+
|   |   |   |
+---+---+---+
|   |   |   |
+---+---+---+
|   |   |   |
+---+---+---+
```

Of course, you could simply write seven statements of the form

    System.out.println("+---+---+---+");

You should do it the smart way, though. Declare string variables to hold two kind of patterns: a comb-shaped pattern and the bottom line. Print the comb three times and the bottom line once.

---

Solution:

```java
import static java.lang.System.out;

class P0215 
{
  public static void main(String[] args) 
  {
    final String comb = "+---+---+---+\n|   |   |   |";
    final String base = "+---+---+---+";

    out.println(comb);
    out.println(comb);
    out.println(comb);
    out.println(base);
  }
}
```