[Back](../README.md)

## P1.6

Write a program that prints your name in large letters, such as

```bash
*   *    **    ****    ****   *   *
*   *   *  *   *   *   *   *  *   *
*****  *    *  ****    ****    * *
*   *  ******  *   *   *   *    *
*   *  *    *  *    *  *    *   *
```

---

Solution:

```java
import static java.lang.System.out;

class P0106 
{
  public static void main(String[] args) 
  {
    out.println("       *    *   *     * ");
    out.println("       *   * *   *   *  ");
    out.println("       *  *   *   * *   ");
    out.println("       * *     *   *    ");
    out.println(" *     * *******   *    ");
    out.println(" *     * *     *   *    ");
    out.println("  *****  *     *   *    ");
  }
}
```