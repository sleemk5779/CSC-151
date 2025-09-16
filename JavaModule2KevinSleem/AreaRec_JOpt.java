

import javax.swing.JOptionPane;

public class AreaRec_JOpt {
    private double length;
    private double width;
    private double area;

    // This method does the entire process
    public void run() {
        getLength();
        getWidth();
        displayArea();
    }

    private void getLength() {
        length = Double.parseDouble(JOptionPane.showInputDialog("Enter the length of the rectangle: "));
    }

    private void getWidth() {
        width = Double.parseDouble(JOptionPane.showInputDialog("Enter the width of the rectangle: "));
    }

    private void displayArea() {
        area = length * width;
        JOptionPane.showMessageDialog(null, "Area of rectangle is " + area);
    }
}