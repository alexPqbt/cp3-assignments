import java.util.Scanner;
import java.lang.Math;

public class CalcTriangle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double side1, side2, side3, perimeter, area;

    System.out.println("Enter numbers to solve PERIMETER and AREA");
    System.out.print("a: ");
    side1 = sc.nextDouble();
    System.out.print("b: ");
    side2 = sc.nextDouble();
    System.out.print("c: ");
    side3 = sc.nextDouble();

    // This part shows that I understand what is and how to use "conditionals"
    if (side1 > 0 && side2 > 0 && side3 > 0) {
      if ((side1 + side2) > side3) {
        perimeter = getPerimeter(side1, side2, side3);
        area = getArea(side1, side2, side3);

        System.out.printf("Perimeter = %.2f\n", perimeter);
        System.out.printf("Area = %.4f\n", area);
      } else {
        System.out.println("Make sure that a + b is greater than c");
      }
    } else {
      System.out.println("Enter only numbers greater than ZERO");
    }
  }

  public static double getPerimeter(double a, double b, double c) {
    return a + b + c;
  }

  public static double getArea(double a, double b, double c) {
    /*
      Heron's formula, also known as Hero's formula,
      is the formula to calculate triangle area given three triangle sides.
      It was first mentioned in Heron's book Metrica, written in ca. 60 AD,
      which was the collection of formulas for various objects surfaces and volumes calculation.

      Reference: https://www.omnicalculator.com/math/herons-formula
     */

    return 0.25 * Math.sqrt((a + b + c) * (-a + b + c) * (a - b + c) * (a + b - c));
  }
}
