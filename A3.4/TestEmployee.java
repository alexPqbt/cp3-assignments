/**
 * Watch the video and create this guided practice activity with a twist.
 * https://youtu.be/V8SpQCaue7Q?list=PLiJI5grbTemj7fPkY0YFfZmv0XH-JwZNr
 * With a twist because of the user dynamic inputs.
 * The user is prompted to enter the data for 5 different objects.
 * <br>
 * Create a java class named Employee with field names, and getters and setters.
 * Create a client class named TestEmployee to allow the user to enter at least 5 employee data.
 * Use the class Scanner or JOptionPane to get the user's entries.
 *
 * @author xxx
 * @since xxx
 */

import javax.swing.*;
import java.awt.*;

public class TestEmployee {

  public static void main(String[] args) {

    // This creates a multiple input field for JOptionPane
    // https://stackoverflow.com/questions/6555040/multiple-input-in-joptionpane-showinputdialog
    JPanel panel = new JPanel();
    panel.setLayout(new GridLayout(0, 1));

    // Text field with label of ID
    panel.add(new JLabel("ID"));
    JTextField idText = new JTextField(10);
    panel.add(idText);

    // Text field with label of Last Name
    panel.add(new JLabel("Last Name"));
    JTextField firstnameText = new JTextField(10);
    panel.add(firstnameText);

    // Text field with label of First Name
    panel.add(new JLabel("First Name"));
    JTextField lastnameText = new JTextField(10);
    panel.add(lastnameText);

    // Text field with label of Email
    panel.add(new JLabel("Email"));
    JTextField emailText = new JTextField(10);
    panel.add(emailText);

    // Text field with label of Salary
    panel.add(new JLabel("Salary"));
    JTextField salaryText = new JTextField(10);
    panel.add(salaryText);

    // To call the window
    int value = JOptionPane.showConfirmDialog(
      null,
      panel,
      "Enter Employee Details",
      JOptionPane.OK_CANCEL_OPTION
    );

    // This part demonstrates the use of getter and setter.
    if (value == JOptionPane.OK_OPTION) {
      int id = Integer.parseInt(idText.getText());
      float salary = Float.parseFloat(salaryText.getText());

      Employee employee = new Employee(0, "", "", "", 0.0F);

      // Demo of setter
      employee.setID(id);
      employee.setLastname(lastnameText.getText());
      employee.setFirstname(firstnameText.getText());
      employee.setEmail(emailText.getText());
      employee.setSalary(salary);

      // Demo of getter
      System.out.printf(
        "ID: %d\nName: %s, %s\nEmail: %s\nSalary: %.2f\n\n",
        employee.getID(), employee.getLastname(), employee.getFirstname(), employee.getEmail(), employee.getSalary());

    }

    // Initialize for other 4 Employee objects
    Employee[] employees = new Employee[4];

    for (int i = 0; i < employees.length; i++) {
      // Clear input from before
      idText.setText("");
      lastnameText.setText("");
      firstnameText.setText("");
      emailText.setText("");
      salaryText.setText("");

      // To call the window
      int value2 = JOptionPane.showConfirmDialog(
        null,
        panel,
        "Enter Employee Details",
        JOptionPane.OK_CANCEL_OPTION
      );

      // If the user clicked OK or pressed Enter
      if (value2 == JOptionPane.OK_OPTION) {
        int id = Integer.parseInt(idText.getText());
        float salary = Float.parseFloat(salaryText.getText());

        // Create Employee object using constructor
        employees[i] = new Employee(
          id,
          lastnameText.getText(),
          firstnameText.getText(),
          emailText.getText(),
          salary);
      }

      employees[i].displayInfo();
    }

  }

}
