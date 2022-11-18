/**
 * 5. Negative Decimal Tally
 * We've been giving positive numbers too much attention lately, it's time to let negative numbers take the spotlight this time!
 * <br>
 * Instructions:
 * 1. Input four decimal numbers, they could be positive or negative.
 * 2. Add all the negative numbers, and print the sum, up to 2 decimal places.
 * <br>
 * @author xxx
 * @since xxx
 */

import java.util.Arrays;
import java.util.Scanner;

public class NegativeTally {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str;
    String[] arrOfStr;
    double[] doubledArray;

    System.out.print("Enter four decimal numbers: ");
    str = sc.nextLine();

    arrOfStr = str.split(" ", 0);
    // https://stackoverflow.com/questions/9101301/how-to-convert-string-array-to-double-array-in-one-line
    // filter(): https://stackoverflow.com/questions/7950468/filtering-negative-values
    doubledArray = Arrays.stream(arrOfStr).mapToDouble(Double::parseDouble).filter(i -> i < 0).toArray();

    calcNegatives(doubledArray);
  }

  public static void calcNegatives(double[] arr) {
    double sum = 0;

    for (double num : arr) {
      sum += num;
    }

    System.out.printf("%.02f", sum);
  }
}
