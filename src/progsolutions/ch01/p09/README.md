[Back](../README.md)

## P1.9

Write a program that prints a house that looks exactly like the following:

```bash
   +
  + +
 +   +
+-----+
| .-. |
| | | |
+-+-+-+
```

---

Solution:

```java
import static java.lang.System.out;

class P0109 
{
  public static void main(String[] args) 
  {
    out.println("   +");
    out.println("  + +");
    out.println(" +   +");
    out.println("+-+-+-+");
    out.println("| .-. |");
    out.println("| | | |");
    out.println("+-+-+-+");
  }
}
```