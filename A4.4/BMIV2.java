/**
 * 7. Body Mass Index Version 2.0
 * Recall that according to the National Heart, Lung, and Blood Institute of the National Institutes of Health
 * body mass index (BMI) is a measure of body fat based on height and weight that applies to adult men and women.
 * It is used to monitor one's health by determining whether one is underweight, overweight, has normal weight or is obese.
 * It is computed based as follows (when using standard weight in pounds and height in inches):
 * <br>
 * BMI = 703 x (weight/(height2))
 * <br>
 * Furthermore, people with BMI scores that are less than 18.5 are said to be underweight. 
 * Those with scores between 18.5–24.9 (inclusive) are of normal weight. 
 * Those with scores between 25–29.9 (inclusive) are said to be overweight. 
 * And those with scores 30 or higher are obese.
 * <br>
 * @author xxx
 * @since xxx
 */

import java.util.Arrays;
import java.util.Scanner;

public class BMIV2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str;
    String[] arrOfStr;
    double weight, height;
    double[] doubledArray;

    System.out.print("Enter weight in pounds and height in inches: ");
    str = sc.nextLine();

    arrOfStr = str.split(" ", 0);
    // https://stackoverflow.com/questions/9101301/how-to-convert-string-array-to-double-array-in-one-line
    doubledArray = Arrays.stream(arrOfStr).mapToDouble(Double::parseDouble).toArray();
    weight = doubledArray[0];
    height = doubledArray[1];

    calcBMI(weight, height);
  }

  public static void calcBMI(double pound, double inches) {
    double bmi;
    String category;

    bmi = (703 * (pound / Math.pow(inches, 2)));

    if (bmi < 18.5) category = "underweight";
    else if (bmi >= 18.5 && bmi <= 24.9) category = "normal weight";
    else if (bmi >= 25 && bmi <= 29.9) category = "overweight";
    else category = "obese";

    System.out.printf("%.01f %s", bmi, category);
  }
}
