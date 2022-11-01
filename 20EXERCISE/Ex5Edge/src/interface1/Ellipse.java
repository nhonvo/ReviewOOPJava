package interface1;
import javax.swing.JOptionPane;

public class Ellipse implements IOInterface, shapeInterface {
    double x, y, rx, ry;

    public Ellipse() {
        super();
        x = y = rx = ry = 0;
    }

    public Ellipse(double x, double y, double rx, double ry) {
        super();
        this.x = x;
        this.y = y;
        this.rx = rx;
        this.ry = ry;
    }

    @Override
    public void input() {
        String st = JOptionPane.showInputDialog(null, "Nhap Toa do x: ", "0");
        x = Double.parseDouble(st);
        st = JOptionPane.showInputDialog(null, "Nhap Toa do y: ", "0");
        y = Double.parseDouble(st);
        st = JOptionPane.showInputDialog(null, "Nhap Ban Kinh r truc x: ", "0");
        rx = Double.parseDouble(st);
        st = JOptionPane.showInputDialog(null, "Nhap Ban Kinh r truc y: ", "0");
        ry = Double.parseDouble(st);
    }

    @Override
    public String output() {
        return String.format("Ellipse: [%.2f, %.2f](%.2f, %.2f)", x, y, rx, ry);
    }

    @Override
    public double p() {
        return pi * rx * ry;
    }

    @Override
    public double area() {
        return pi * (rx + ry);
    }
}
