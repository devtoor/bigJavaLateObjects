[Back](../README.md)

## P2.17

Write a program that reads two times in military format (0900, 1730) and prints the number of hours and minutes between the two times. Here is a simple run. User input is in color.

```
Please enter the first time: 0900
Please enter the second time: 1730
8 hours 30 minutes
```

Extra credit if you can deal with the case where the first time is later than the second:

```
Please enter the first time: 1730
Please enter the second time: 0900
15 hours 30 minutes
```

---

Solution:

```java
import static java.lang.System.in;
import static java.lang.System.out;

import java.util.Scanner;

class P0217 
{
  private static final int MINUTES_PER_HOUR = 60;
  private static final int MINUTES_PER_DAY = 24 * 60;

  public static void main(String[] args) 
  {
    final Scanner input = new Scanner(in);
    out.print("Enter the first time: ");
    final int firstTime = input.nextInt();
    out.print("Please enter the second time: ");
    final int secondTime = input.nextInt();
    final int firstTimeInMinutes = firstTime / 100 * MINUTES_PER_HOUR + firstTime % 100;
    final int secondTimeInMinutes = secondTime / 100 * MINUTES_PER_HOUR + secondTime % 100;
    int diff = secondTimeInMinutes - firstTimeInMinutes;
    diff = (MINUTES_PER_DAY + diff) % MINUTES_PER_DAY;
    final int hours = diff / MINUTES_PER_HOUR;
    final int minutes = diff % MINUTES_PER_HOUR;
    
    out.printf("%d hours %d minutes", hours, minutes);
  }
}
```