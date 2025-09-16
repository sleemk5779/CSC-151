import javax.swing.JOptionPane;

public class AreaCircle_JOpt {
    private double radius;
    private double area;

    public void run() {
        getRadius();
        displayArea();
    }

    private void getRadius() {
        radius = Double.parseDouble(JOptionPane.showInputDialog("Enter the radius of the circle: "));
    }

    private void displayArea() {
        area = Math.PI * radius * radius;
        JOptionPane.showMessageDialog(null, "Area of circle is " + area);
    }
}
