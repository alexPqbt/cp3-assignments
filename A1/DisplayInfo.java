/*
 * AUTHOR: xxx
 * DATE OF CREATION: xxx
 */

import javax.swing.JOptionPane;

public class DisplayInfo {

  public static void main(String[] args) {
    String info = """
        Last name: xxx
        First name: xxx
        Section: xxx
        ID: xxx
        """;

    JOptionPane.showMessageDialog(
      null,
      info,
      "Information",
      JOptionPane.INFORMATION_MESSAGE
    );
  }

}