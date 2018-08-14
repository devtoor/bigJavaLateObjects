[Back](../README.md)

## P1.7

Write a program that prints a face similar to (but different from) the following:

```bash
  /////
 +"""""+
(| o o |)
 |  ^  |
 | '-' |
 +-----+
```

---

Solution:

```java
import static java.lang.System.out;

class P0107 
{
  public static void main(String[] args) 
  {
    out.println("    //////   ");
    out.println("  ..~~~~~..  ");
    out.println(" !         ! ");
    out.println("[!  @   @  !]");
    out.println(" !    ^    ! ");
    out.println(" !   ===   ! ");
    out.println(" !    '    ! ");
    out.println("  '#######'  ");
    out.println("     ###     ");
  }
}
```