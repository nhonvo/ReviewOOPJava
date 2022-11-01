
// Đề 13: Xây dựng lớp SoPhuc có các thuộc tính riêng PhanThuc, PhanAo kiểu
// double: 1: Xây dựng các toán tử tạo lập: SoPhuc(), SoPhuc(float a,float b) 2:
// Xây dựng các phương thức: - Nhập vào 1 số phức. - HIển thị 1 số phức. - Trừ 2
// số phức. - Chia 2 số phức. 3: Cài đặt chương trình thực hiện: Nhập vào 2 số
// phức A,B sau đó tính tích C=A/B rồi hiển thị kết quả ra màn hình.
import java.io.*;

class SoPhuc {

    protected double pt, pa;

    SoPhuc() {
    }

    SoPhuc(float a, float b) {
        pt = a;
        pa = b;
    }

    static String nhapgt() throws IOException {
        String str;
        DataInputStream stream = new DataInputStream(System.in);
        str = stream.readLine();
        return str;
    }

    void in(SoPhuc sp, String x) {
        System.out.println("----------------------");
        System.out.print(x);
        if (sp.pa > 0)
            System.out.println(sp.pt + "+" + sp.pa + " i");
        if (sp.pa < 0)
            System.out.println(sp.pt + "" + sp.pa + " i");
        if (sp.pa == 0)
            System.out.println(sp.pt);
        System.out.println("----------------------");
    }

    SoPhuc nhapsp() throws IOException {
        float a, b;
        System.out.print("Phan thuc: ");
        a = Float.valueOf(nhapgt()).floatValue();
        System.out.print("Phan ao: ");
        b = Float.valueOf(nhapgt()).floatValue();
        SoPhuc sp = new SoPhuc(a, b);
        return sp;
    }

    SoPhuc tru(SoPhuc sp1, SoPhuc sp2) {
        SoPhuc hieu = new SoPhuc();
        hieu.pt = sp1.pt - sp2.pt;
        hieu.pa = sp1.pa - sp2.pa;
        return hieu;
    }

    static double giaihe(double a, double a1, double b, double b1, double c, double c1, int lc) {
        double tv = 0;
        double d, dx, dy, x = 0, y = 0;
        d = a * b1 - b * a1;
        dx = c * b1 - b * c1;
        dy = a * c1 - c * a1;
        if (d != 0) {
            x = (double) dx / d;
            y = (double) dy / d;
        }
        switch (lc) {
            case 1:
                tv = x;
                break;
            case 2:
                tv = y;
                break;
            default:
                tv = 0;
        }
        return tv;
    }

    SoPhuc thuong(SoPhuc sp1, SoPhuc sp2) {
        SoPhuc thuong = new SoPhuc();
        thuong.pt = giaihe(sp1.pt, sp1.pa, -sp1.pa, sp1.pt, sp2.pt, sp2.pa, 1);
        thuong.pa = giaihe(sp1.pt, sp1.pa, -sp1.pa, sp1.pt, sp2.pt, sp2.pa, 2);
        return thuong;
    }

    public static void main(String args[]) throws IOException {
        SoPhuc SP1 = new SoPhuc();
        SoPhuc SP2 = new SoPhuc();
        System.out.println("So thu nhat");
        SP1 = SP1.nhapsp();
        System.out.println("So thu hai");
        SP2 = SP2.nhapsp();
        SP1.in(SP1, "So thu 1 A=");
        SP2.in(SP2, "So thu 2 B=");
        SoPhuc HIEU = new SoPhuc();
        SoPhuc THUONG = new SoPhuc();
        HIEU = HIEU.tru(SP1, SP2);
        HIEU.in(HIEU, "Hieu A-B=");
        HIEU = HIEU.tru(SP2, SP1);
        HIEU.in(HIEU, "Hieu B-A=");
        THUONG = THUONG.thuong(SP1, SP2);
        THUONG.in(THUONG, "Thuong B/A= ");
        THUONG = THUONG.thuong(SP2, SP1);
        THUONG.in(THUONG, "Thuong A/B= ");
    }
}
