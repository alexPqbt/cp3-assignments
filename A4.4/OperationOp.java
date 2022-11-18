/**
 * 4. Operation: Operation
 * You have been cordially invited to partake in Operation: Operation. 
 * Your mission, should you choose to accept it, is to take the two numbers and;
 * the operator given then perform the operation successfully.
 * <br>
 * Instructions:
 * 1. Input one number (integer or decimal), an operator (+, -, *, /), and another number.
 * 2. Print the result of the operation between the two numbers, up to 2 decimal places.
 * <br>
 * @author xxx
 * @since xxx
 */

import java.util.Scanner;

public class OperationOp {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String input;
    String[] arrOfInput;
    double x, y;
    String op;

    System.out.print("Enter operation [1 + 1]: ");
    input = sc.nextLine();

    arrOfInput = input.split(" ", 0);
    x = Double.parseDouble(arrOfInput[0]);
    y = Double.parseDouble(arrOfInput[2]);
    op = arrOfInput[1];

    strToCalc(x, y, op);
  }

  public static void strToCalc(double x, double y, String op) {
    double result = 0;

    switch (op) {
      case "+" -> result = x + y;
      case "-" -> result = x - y;
      case "*" -> result = x * y;
      case "/" -> result = x / y;
    }

    System.out.printf("%.2f", result);
  }
}
