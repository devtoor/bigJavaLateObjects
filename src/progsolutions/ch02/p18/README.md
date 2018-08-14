[Back](../README.md)

## P2.18

_Writing large letters_. A large letter H can be produced like this:

```
*    *
*    *
******
*    *
*    *
```

It can be declared as a string literal like this:

```
final string LETTER_H = "*    *\n*    *\n******\n*    *\n*    *\n";
```

(The `\n` escape sequence denotes a "newline" character that causes subsequent characters to be printed on a new line.) Do the same for the letters E, L, and O. Then write the message

```
H
E
L
L
O
```

in large letters.

---

Solution:

```java
import static java.lang.System.out;

class P0218 
{
  public static void main(String[] args) 
  {
    final String H = "**   **\n**   **\n*******\n**   **\n**   **\n\n";
    final String E = "*******\n**     \n*******\n**     \n*******\n\n";
    final String L = "**     \n**     \n**     \n**     \n*******\n\n";
    final String O = " ***** \n**   **\n**   **\n**   **\n ***** \n\n";
    out.println(H + E + L + L + O);
  }
}
```