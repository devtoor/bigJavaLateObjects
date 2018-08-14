[Back](../README.md)

## P2.1

Write a program that displays the dimensions of a letter-size (8.5 x 11 inches) sheet of paper in millimeters. There are 25.4 millimeters per inch. Use constants and comments in your program.

---

Solution:

```java
import static java.lang.System.out;

class P0201 
{
  public static void main(String[] args) 
  {
    final double millimetersPerInch = 25.4;
    final double paperWidthInches = 8.5;
    final double paperLengthInches = 11.0;
    final double paperWidthMillimeters = paperWidthInches * millimetersPerInch;
    final double paperLengthMillimeters = paperLengthInches * millimetersPerInch;

    out.println("The dimensions of a letter-size sheet of paper in millimeters is "
            + paperWidthMillimeters + " x " + paperLengthMillimeters + " millimeters.");
  }
}
```