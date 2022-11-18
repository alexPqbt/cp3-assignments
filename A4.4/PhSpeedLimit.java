/**
 * 8. Speedy, Still Not, Gonzales
 * Recall that the general speed limits in the Philippines in 60 km/h on most highways and 100 km/h on expressways. 
 * Let's add a minimum speed when one is in an expressway and that minimum speed limit is 40 km/h. 
 * Your goal here is to compute the speed of automobiles based on distance travelled and time taken to cover this distance. 
 * And at the same time, whether the driver is over-speeding, within speed limit, or under-speeding.
 * <br>
 * @author xxx
 * @since xxx
 */

import java.util.Scanner;

public class PhSpeedLimit {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str;
    String[] arrOfStr;
    int road;
    double meters, minutes;

    System.out.println("Enter road [1-highway; 2-expressway]");
    System.out.println("Distance in meters and minutes to cover the distance:");
    str = sc.nextLine();

    arrOfStr = str.split(" ", 0);
    road = Integer.parseInt(arrOfStr[0]);
    meters = Double.parseDouble(arrOfStr[1]);
    minutes = Double.parseDouble(arrOfStr[2]);

    checkSpeedLimit(road, meters, minutes);
  }

  public static void checkSpeedLimit(int road, double meters, double minutes) {
    double kph;
    String status = "";

    kph = (meters / 1000) / (minutes / 60);

    if (road == 1 && kph <= 60) status = "within-speed-limit";
    else if (road == 2) {
      if (kph < 40) status = "under-speeding";
      else if (kph > 100) status = "over-speeding";
      else status = "within-speed-limit";
    }

    System.out.printf("%.2f %s", kph, status);
  }
}
