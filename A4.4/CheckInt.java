/**
 * 1. Positive or Negative?
 * When you're feeling good, they call you positive. But when you're feeling down, they call you negative. 
 * Try to determine whether a number is positive or negative!
 * <br>
 * Instructions:
 * 1. Input one integer.
 * 2. If the integer is positive, then print out "Positive", else print out "Negative".
 * <br>
 * @author xxx
 * @since xxx
 */

public class CheckInt {
  public static void main(String[] args) {
    System.out.println(checkInteger(-12));
    System.out.println(checkInteger(12));
  }

  public static String checkInteger(int x) {
    return x > 0 ? "Positive" : "Negative";
  }
}
