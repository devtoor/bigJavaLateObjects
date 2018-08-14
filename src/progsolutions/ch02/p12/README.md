[Back](../README.md)

## P2.12

_File names and extensions._ Write a program that prompts the user for the drive letter `C`, the path `\Windows\System`, the file name `Readme`, and the extension `txt`. Then print the complete file name `C:\Windows\System\Readme.txt`. (If you use UNIX or a Macintosh, skip the drive name and use / instead of \ to separate directories.)

---

Solution:

```java
import static java.lang.System.in;
import static java.lang.System.out;

import java.util.Scanner;

class P0212 
{
  public static void main(String[] args) 
  {
    final Scanner input = new Scanner(in);

    out.print("Enter the drive letter: ");
    final String drive = input.next();
    System.out.print("Enter the path: ");
    final String path = input.next();
    out.print("Please enter the filename: ");
    final String filename = input.next();
    out.print("Please enter the extension: ");
    final String extension = input.next();

    out.println(drive + ":\\" + path + "\\" + filename + "." + extension);
  }
}
```