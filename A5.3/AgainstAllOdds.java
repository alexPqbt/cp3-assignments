import java.util.Scanner;

/**
 * Against All “Odds”
 * <br>
 * 1. Scan an integer that will accept an integer greater than 0 and store it in a variable.
 * 2. Using a while() loop, print out all the odd numbers starting from the inputted integer, until 0.
 *    The outputted numbers must all be separated by line, just like that of the sample output.
 * <br>
 * Also remember that since the loop goes to descending order, a decrement variable shall be created and
 * decreased per iteration for the loop to terminate when it reaches 0.
 *
 * @author Paquibot, Alexandre
 * @since 12-4-22
 */

public class AgainstAllOdds {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int startingNum;

    // Prompt the user for a number greater than zero
    System.out.print("Enter a number: ");
    startingNum = sc.nextInt();
    if (startingNum < 0) System.out.println("Enter a number greater than 0");

    // Displays the odd numbers starting from the number the user inputted
    while (startingNum >= 0) {
      if (startingNum % 2 != 0) System.out.println(startingNum);
      startingNum--;
    }
  }
}
