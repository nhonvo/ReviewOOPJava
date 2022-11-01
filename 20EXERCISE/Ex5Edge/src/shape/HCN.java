package shape;
import interface1.IOInterface;
import interface1.shapeInterface;

import javax.swing.JOptionPane;

public class HCN implements IOInterface, shapeInterface {
    double x, y;

    public HCN() {
        super();
        x = y = 0;
    }

    public HCN(double x, double y) {
        super();
        this.x = x;
        this.y = y;
    }

    @Override
    public void input() {
        // TODO Auto-generated method stub
        String st = JOptionPane.showInputDialog(null, "Nhap chieu dai: ", "0");
        x = Double.parseDouble(st);
        st = JOptionPane.showInputDialog(null, "Nhap chieu rong: ", "0");
        y = Double.parseDouble(st);
    }

    @Override
    public String output() {
        // TODO Auto-generated method stub
        return String.format("Hinh chu nhat: <%.2f, %.2f>", x, y);
    }

    @Override
    public double p() {
        // TODO Auto-generated method stub
        return x + y + x + y;
    }

    @Override
    public double area() {
        // TODO Auto-generated method stub
        return x * y;
    }
}
