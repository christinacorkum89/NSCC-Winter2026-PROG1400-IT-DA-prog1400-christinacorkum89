import javax.swing.*;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {

    ArrayList<Friend> guestList = new ArrayList<>();

    JOptionPane.showMessageDialog(null,
            "Welcome to the Party Picker!\n\n" +
                    "Enter each guest's name, what food they bring,\n" +
                    "and whether they are invited.");

    boolean keepGoing = true;

    while (keepGoing) {

      String first = JOptionPane.showInputDialog("Enter the guest's FIRST name:");
      String last = JOptionPane.showInputDialog("Enter the guest's LAST name:");
      String food = JOptionPane.showInputDialog("What food do they bring?");

      int invitedChoice = JOptionPane.showConfirmDialog(
              null,
              "Is this person invited?",
              "Invitation",
              JOptionPane.YES_NO_OPTION
      );

      boolean isInvited = (invitedChoice == JOptionPane.YES_OPTION);

      Friend f = new Friend(first, last, isInvited, food);
      guestList.add(f);

      int continueChoice = JOptionPane.showConfirmDialog(
              null,
              "Add another guest?",
              "Continue?",
              JOptionPane.YES_NO_OPTION
      );

      if (continueChoice == JOptionPane.NO_OPTION) {
        keepGoing = false;
      }
    }

    StringBuilder report = new StringBuilder("Party Guest Report:\n\n");

    for (Friend f : guestList) {
      report.append(f.toString()).append("\n");
    }

    JOptionPane.showMessageDialog(null, report.toString());
  }
}
