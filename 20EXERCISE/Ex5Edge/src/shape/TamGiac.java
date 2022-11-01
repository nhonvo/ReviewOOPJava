package shape;
import interface1.IOInterface;
import interface1.shapeInterface;

import javax.swing.JOptionPane;

public class TamGiac implements IOInterface, shapeInterface {
    double a, b, c;

    public TamGiac() {
        super();
        a = b = c = 0;
    }

    public TamGiac(double a, double b, double c) {
        super();
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public void input() {
        // TODO Auto-generated method stub
        String st = JOptionPane.showInputDialog(null, "Nhap canh 1: ", "0");
        a = Double.parseDouble(st);
        st = JOptionPane.showInputDialog(null, "Nhap canh 2: ", "0");
        b = Double.parseDouble(st);
        st = JOptionPane.showInputDialog(null, "Nhap canh 3: ", "0");
        c = Double.parseDouble(st);
    }

    @Override
    public String output() {
        // TODO Auto-generated method stub
        return String.format("Tam giac: <%.2f, %.2f, %.2f>", a, b, c);
    }

    @Override
    public double p() {
        // TODO Auto-generated method stub
        return a + b + c;
    }

    @Override
    public double area() {
        // TODO Auto-generated method stub
        double p = p() / 2;
        return (double) Math.sqrt((p - a) * (p - b) * (p - c) * p);
    }
}
