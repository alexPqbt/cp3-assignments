/**
 * AUTHOR: xxx
 * DATE OF CREATION: xxx
 */

import javax.swing.JOptionPane;

public class CommentsDialog {

  public static void main(String[] args) {
    // Program comments are nonexecuting statements you add to a file for the purpose of documentation.
    /* Program comments are nonexecuting statements you add to a file for the purpose of documentation. */
    /** Program comments are nonexecuting statements you add to a file for the purpose of documentation. */

    JOptionPane.showMessageDialog(
      null,
      "Program comments are nonexecuting statements you add to a file for the purpose of documentation.",
      "Comments",
      JOptionPane.INFORMATION_MESSAGE
    );
  }

}
