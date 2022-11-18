/**
 * 3. Security Check
 * Woah there, what are you doing roaming around past the curfew? I'm going to have to ask for some identification.
 * <br>
 * Instructions:
 * 1. Input an integer, this would represent age.
 * 2. If the age is greater than or equal to 18, then print out "Adult", else print "Minor".
 * <br>
 * @author xxx
 * @since xxx
 */ 

public class CheckAge {
  public static void main(String[] args) {
    System.out.println(ageCheck(14));
    System.out.println(ageCheck(18));
  }

  public static String ageCheck(int age) {
    return age < 18 ? "Minor" : "Adult";
  }
}
