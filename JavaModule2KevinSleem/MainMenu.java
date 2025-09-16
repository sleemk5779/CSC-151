

import javax.swing.JOptionPane;

public class MainMenu {
    public static void main(String[] args) {
        int choice;

        do {
            String menu = """
                === Area Calculator Menu ===
                1. Area of Rectangle
                2. Area of Circle
                3. Exit
                """;
            choice = Integer.parseInt(JOptionPane.showInputDialog(menu + "\nEnter your choice:"));

            switch (choice) {
                case 1 -> {
                    AreaRec_JOpt rect = new AreaRec_JOpt();
                    rect.run();
                }
                case 2 -> {
                    AreaCircle_JOpt circle = new AreaCircle_JOpt();
                    circle.run();
                }
                case 3 -> JOptionPane.showMessageDialog(null, "Exiting program. Goodbye!");
                default -> JOptionPane.showMessageDialog(null, "Invalid choice. Please try again.");
            }
        } while (choice != 3);
    }
}