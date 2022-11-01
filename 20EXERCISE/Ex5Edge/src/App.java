import shape.*;
import interface1.*;



import javax.swing.*;

public class App {
    public static void main(String[] args) {
        byte option;

        for (;;) {
            do {
                String st = JOptionPane.showInputDialog(null,
                        "(1) Hinh tron\n(2) Ellipse\n(3) Tam giac\n(4) Hinh chu nhat\n(5) Hinh vuong\n\n(0) Thoat",
                        "0");
                option = Byte.parseByte(st);
                if ((option < 0) || (option > 5))
                    JOptionPane.showMessageDialog(null, "Khong hop le!");
            } while ((option < 0) || (option > 5));

            switch (option) {
                case 1:
                    VongTron ht = new VongTron();
                    ht.input();
                    JOptionPane.showMessageDialog(null,
                            ht.output() + "\nDien tich: " + ht.area() + "\nChu vi: " + ht.p(),
                            "Ket Qua Hinh Tron", 1);
                    break;
                case 2:
                    Ellipse elip = new Ellipse();
                    elip.input();
                    JOptionPane.showMessageDialog(null,
                            elip.output() + "\nDien tich: " + elip.area() + "\nChu vi: " + elip.p(),
                            "Ket Qua Ellipse", 1);
                    break;
                case 3:
                    TamGiac tg = new TamGiac();
                    tg.input();
                    JOptionPane.showMessageDialog(null,
                            tg.output() + "\nDien tich: " + tg.area() + "\nChu vi: " + tg.p(),
                            "Ket Qua Tam Giac", 1);
                    break;
                case 4:
                    HCN hcn = new HCN();
                    hcn.input();
                    JOptionPane.showMessageDialog(null,
                            hcn.output() + "\nDien tich: " + hcn.area() + "\nChu vi " + hcn.p(),
                            "Ket Qua Hinh Chu Nhat", 1);
                    break;
                case 5:
                    Vuong hv = new Vuong();
                    hv.input();
                    JOptionPane.showMessageDialog(null,
                            hv.output() + "\nDien tich: " + hv.area() + "\nChu vi: " + hv.p(),
                            "Ket Qua Hinh Vuong", 1);
                    break;
                default:
                    int check = JOptionPane.showConfirmDialog(null, "Ban that su muon thoat?");
                    if (check == JOptionPane.YES_OPTION)
                        System.exit(0); // thoát chương trình
                    break;
            }
        }

    }
}
