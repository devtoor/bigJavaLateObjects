[Back](../README.md)

## P1.8

Write a program that prints an imitation of a Piet Mondrian painting. (Search the Internet if you are not familiar with his paintings.) Use character sequences such as @@@ or ::: to indicate different colors, and use - and | to form lines.

---

Solution:

```java
import static java.lang.System.out;

class P0108 
{
  public static void main(String[] args) 
  {
    out.println("+-------------+------------+");
    out.println("|:::::::::::::|@@@@@@@@@@@@|");
    out.println("|:::::::::::::|@@@@@@@@@@@@|");
    out.println("+-------------+@@@@@@@@@@@@|");
    out.println("|             |@@@@@@@@@@@@|");
    out.println("|             |@@@@@@@@@@@@|");
    out.println("|             +------------+");
    out.println("|             |::::::::::::|");
    out.println("+-------------+::::::::::::|");
    out.println("|@@@@@@@@|    |::::::::::::|");
    out.println("|@@@@@@@@|    |::::::::::::|");
    out.println("+-----+--+----+------+-----|");
    out.println("|:::::|              |@@@@@|");
    out.println("|:::::|              |@@@@@|");
    out.println("|:::::|              +-----+");
    out.println("|:::::|              |:::::|");
    out.println("+-----+--------------+-----+");
  }
}
```