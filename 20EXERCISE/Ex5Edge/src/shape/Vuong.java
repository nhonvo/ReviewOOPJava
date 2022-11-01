package shape;
import interface1.IOInterface;
import interface1.shapeInterface;

import javax.swing.JOptionPane;

public class Vuong implements IOInterface, shapeInterface {
    double x;

    public Vuong() {
        super();
        x = 0;
    }

    public Vuong(double x) {
        super();
        this.x = x;
    }

    @Override
    public void input() {
        String st = JOptionPane.showInputDialog(null, "Nhap canh: ", "0");
        x = Double.parseDouble(st);
    }

    @Override
    public String output() {
        return String.format("Hinh vuong: <%.2f>", x);
    }

    @Override
    public double p() {
        return x * 4;
    }

    @Override
    public double area() {
        return x * x;
    }
}
