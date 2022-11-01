package shape;
import interface1.IOInterface;
import interface1.shapeInterface;

import javax.swing.JOptionPane;

public class VongTron implements IOInterface, shapeInterface {
    double x, y, r;

    public VongTron() {
        super();
        x = y = r = 0;
    }

    public VongTron(double x, double y, double r) {
        super();
        this.x = x;
        this.y = y;
        this.r = r;
    }

    @Override
    public void input() {
        // TODO Auto-generated method stub
        String st = JOptionPane.showInputDialog(null, "Nhap Toa do x: ", "0");
        x = Double.parseDouble(st);
        st = JOptionPane.showInputDialog(null, "Nhap Toa do y: ", "0");
        y = Double.parseDouble(st);
        st = JOptionPane.showInputDialog(null, "Nhap Ban Kinh r: ", "0");
        r = Double.parseDouble(st);
    }

    @Override
    public String output() {
        // TODO Auto-generated method stub
        return String.format("Vong tron: [%.2f, %.2f](%.2f)", x, y, r);
    }

    @Override
    public double p() {
        // TODO Auto-generated method stub
        return pi * r * r;
    }

    @Override
    public double area() {
        // TODO Auto-generated method stub
        return 2 * pi * r;
    }
}
