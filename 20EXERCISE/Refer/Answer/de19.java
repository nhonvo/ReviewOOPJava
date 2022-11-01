package DoAnJavaThamKhao;

// Đề 19: Mỗi một điểm trong mặt phẳng được xác đinh duy nhất bởi hai giá trị là hoành độ và tung độ. 
// 1 Hãy xây dựng lớp Diem cùng với chứa các đốI tượng diểm trong mặt phẳng và xây dựng phương thức sau: 
// - Toán tử tạo lập - Phương thức in một đốI tượng thuọc lớp Diem - Tính khoảng cách giữa hai điểm
// 2 Xây dựng lớp HinhTron chứa các đốI tượng là các hình tròn vớI 2 thuộc tính là 1 đốI tượng thuộc lớp Diem để xác định tâm của hình tròn một giá trị nguyên để xác định bán kinh của hình tròn. cài đặt các phương thức: 
// - Xây dựng các toán tử tạo lập: HinhTron(), - HinhTron(Diem d, int bk) - HinhTron(int bk , Diem d) - Tính chu vi, diện tich hình tròn 
import java.io.*;

class Diem {
    protected double hd, td;

    Diem() {
    }

    Diem(int a, int b) {
        hd = a;
        td = b;
    }

    void in() {
        System.out.println("(" + hd + "," + td + ")");
    }

    double tinhkc(Diem d1, Diem d2) {
        double kc = 0;
        kc = Math.sqrt(Math.pow(d1.hd - d2.hd, 2) + Math.pow(d1.td - d2.td, 2));
        return kc;
    }
}

class HinhTron {
    private Diem O = new Diem();
    private int R;

    HinhTron() {
    }

    HinhTron(Diem d, int bk) {
        O = d;
        R = bk;
    }

    HinhTron(int bk, Diem d) {
        O = d;
        R = bk;
    }

    double chuvi() {
        double cv = 0;
        cv = 2 * Math.PI * R;
        return cv;
    }

    double dtich() {
        double dt;
        dt = R * R * Math.PI;
        return dt;
    }

    static String nhapgt() throws IOException {
        String str;
        DataInputStream stream = new DataInputStream(System.in);
        str = stream.readLine();
        return str;
    }

    static Diem nhapdiem() throws IOException {
        int a, b;
        System.out.println("Toa do tam: ");
        System.out.print("Hoanh do: ");
        a = Integer.valueOf(nhapgt()).intValue();
        System.out.print("Tung do: ");
        b = Integer.valueOf(nhapgt()).intValue();
        Diem nd = new Diem(a, b);
        return nd;
    }

    static HinhTron nhapht() throws IOException {
        int bk;
        Diem tam = new Diem();
        tam = nhapdiem();
        System.out.print("Nhap do dai ban kinh: ");
        bk = Integer.valueOf(nhapgt()).intValue();
        HinhTron ht = new HinhTron(tam, bk);
        return ht;
    }

    public static void main(String args[]) throws IOException {
        HinhTron HT = new HinhTron();
        HT = nhapht();
        System.out.println("Chu vi: " + HT.chuvi());
        System.out.println("Dien tich : " + HT.dtich());
    }
}
