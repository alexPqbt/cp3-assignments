public class Lease {
  private String tenantName;
  private int apartmentNum, terms;
  private double rent;

  public Lease() {
    tenantName = "XXX";
    apartmentNum = 0;
    rent = 1000.0;
    terms = 12;
  }

  public Lease(String tenantName, int apartmentNum, double rent, int terms) {
    this.tenantName = tenantName;
    this.apartmentNum = apartmentNum;
    this.rent = rent;
    this.terms = terms;
  }

  public String getTenantName() {
    return tenantName;
  }

  public void setTenantName(String tenantName) {
    this.tenantName = tenantName;
  }

  public int getApartmentNum() {
    return apartmentNum;
  }

  public void setApartmentNum(int apartmentNum) {
    this.apartmentNum = apartmentNum;
  }

  public double getRent() {
    return rent;
  }

  public void setRent(double rent) {
    this.rent = rent;
  }

  public int getTerms() {
    return terms;
  }

  public void setTerms(int terms) {
    this.terms = terms;
  }

  public double addPetFee() {
    explainPetPolicy();
    return this.rent += 10.0;
  }

  public static void explainPetPolicy() {
    System.out.print("\nAdditional P10.00 to monthly rent value if you own pets.");
  }
}