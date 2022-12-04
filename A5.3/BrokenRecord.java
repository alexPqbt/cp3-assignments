import java.util.Scanner;

/**
 * Broken Record
 * <br>
 * 1. Scan a positive integer and store it in a variable.
 * 2. Using while() loop, repeatedly print out "<Your Name> is awesome" for the same number of times
 *    as that of the inputted integer. Each outputted string must be separated in new lines.
 * <br>
 * Don't forget to make an increment variable that will increase its value per iteration so as to not encounter
 * a forever loop and have errors, okay?
 *
 * @author Paquibot, Alexandre
 * @since 12-4-22
 */

public class BrokenRecord {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int limit, counter;

    // Prompt the user for a number
    System.out.print("How many times you want to repeat: ");
    limit = sc.nextInt();

    // Displays the output multiple times based on the number user inputted
    counter = 0;
    while (counter < limit) {
      System.out.println("Alex is awesome");
      counter++;
    }
  }
}
