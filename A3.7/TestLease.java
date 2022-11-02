import java.util.Scanner;

public class TestLease {
  public static void main(String[] args) {
    Lease lease1, lease2, lease3;
    Lease lease4 = new Lease();

    lease1 = getData(false);
    lease2 = getData(false);
    lease3 = getData(true);

    System.out.println("[i] Lease 1 using custom constructor");
    showValues(lease1);

    System.out.println("[i] Lease 2 using custom constructor");
    showValues(lease2);

    System.out.println("[i] Lease 3 using default constructor");
    showValues(lease3);

    System.out.println("[i] Lease 4 w/o pet fee");
    showValues(lease4);

    System.out.println("[i] Lease 4 w/ pet fee");
    lease4.addPetFee();
    showValues(lease4);
  }

  public static Lease getData(boolean useDefault) {
    Scanner sc = new Scanner(System.in);
    String tenantName;
    int apartmentNum, terms;
    double rent;

    if (!useDefault) {
      System.out.print("Enter name: ");
      tenantName = sc.nextLine();

      System.out.print("Enter apartment number: ");
      apartmentNum = sc.nextInt();

      System.out.print("Enter rent: ");
      rent = sc.nextDouble();

      System.out.print("Enter terms: ");
      terms = sc.nextInt();
      System.out.println();

      return new Lease(tenantName, apartmentNum, rent, terms);
    } else {
      return new Lease();
    }
  }

  public static void showValues(Lease lease) {
    System.out.printf(
      "\nName: %s\nApartment #: %d\nRent: P%.2f\nTerms of lease: %d\n\n",
      lease.getTenantName(), lease.getApartmentNum(), lease.getRent(), lease.getTerms()
    );
  }
}