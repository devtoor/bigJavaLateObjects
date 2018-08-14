[Back](../README.md)

## Business P1.20

To speak more than one language is a valuable skill in the labor market today. One of the basic skills is learning to greet people. Write a program that prints a two-column list with the greeting phrases shown in the following table; in the first column, print the phrase in English, in the second column, print the phrase in a language of your choice. If you don't speak any language other than English, use an online translator or ask a friend.

| List of Phrases to Translate  |
| ----------------------------- |
| Good morning.                 |
| It is a pleasure to meet you. |
| Please call me tomorrow.      |
| Have a nice day!              |

---

Solution:

```java
import static java.lang.System.out;

class P0120 
{
  public static void main(String[] args) 
  {
    out.println("English\t\t\t\t\t\t\tTagalog  ");
    out.println("-------------------------------------------------------------");
    out.println("Good morning.\t\t\t\t\tMagandang umaga.");
    out.println("It’s a pleasure to meet you.\tIkinagagalak kong makilala ka.");
    out.println("Please call me tomorrow.\t\tMangyaring tawagan ako bukas.");
    out.println("Have a nice day!\t\t\t\tMagandang araw!");
  }
}
```