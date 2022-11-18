/**
 * 6. Largest Digit
 * This one is a bit tricky. You're going to have to isolate each digit of the integer to determine which one is the largest, so good luck!
 * <br>
 * Instructions:
 * 1. Input one 3-digit integer.
 * 2. Print the largest digit in the integer. (Hint: use % 10 to get the rightmost digit and / 10 to remove it)
 * <br>
 * @author xxx
 * @since xxx
 */

import java.util.Scanner;

public class MaxNum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number, x, y, z;

    System.out.print("Please enter 3-digit number: ");
    number = sc.nextInt();

    x = number / 100 % 10;
    y = number / 10 % 10;
    z = number % 10;

    System.out.println(max(x, y, z));
//    System.out.println(Math.max(Math.max(x, y), z));
  }

  public static int max(int x, int y, int z) {
    if (x > y) {
      if (x > z) return x;
      else return z;
    } else {
      if (y > z) return y;
      else return z;
    }
  }
}
