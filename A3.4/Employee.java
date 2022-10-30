public class Employee {
  private int id;
  private String lastname;
  private String firstname;
  private String email;
  private float salary;

  public Employee(int id, String lastname, String firstname, String email, float salary) {
    this.id = id;
    this.lastname = lastname;
    this.firstname = firstname;
    this.email = email;
    this.salary = salary;
  }

  public int getID() {
    return id;
  }

  public void setID(int id) {
    this.id = id;
  }

  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public float getSalary() {
    return salary;
  }

  public void setSalary(float salary) {
    this.salary = salary;
  }

  public void displayInfo() {
    System.out.printf(
      "ID: %d\nName: %s, %s\nEmail: %s\nSalary: %.2f\n\n",
      this.id, this.lastname, this.firstname, this.email, this.salary);
  }
}
