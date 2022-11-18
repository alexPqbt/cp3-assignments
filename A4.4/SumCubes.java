/**
 * 2. Sum Cubes
 * The square of an integer refers to the result of multiplying the integer with itself once. 
 * While the cube of an integer refers to the result of multiplying the integer with itself twice. 
 * As long as you know that, you could easily solve this!
 * <br>
 * Instructions:
 * 1. Input three integers (negative, positive, or zero) and compute the cubes of each of them.
 * 2. Check if the sum of the cubes are positive. If so, print out "Positive", and if not, print out "Negative".
 * <br>
 * @author xxx
 * @since xxx
 */ 

public class SumCubes {
  public static void main(String[] args) {
    System.out.println(sumCubes(-1, -2, -3));
    System.out.println(sumCubes(1, 2, 3));
  }

  public static String sumCubes(int x, int y, int z) {
    return (int) (Math.pow(x, 3) + Math.pow(y, 3) + Math.pow(z, 3)) > 0 ? "Positive" : "Negative";
  }
}
