
// Đề 12: Xây dựng lớp SoPhuc có các thuộc tính riêng PhanThuc, PhanAo kiểu
// double: 1: Xây dựng các toán tử tạo lập: SoPhuc(), SoPhuc(float a,float b) 2:
// Xây dựng các phương thức: - Nhập vào 1 số phức. - HIển thị 1 số phức. - Cộng
// 2 số phức. - Nhân 2 số phức. 3: Cài đặt chương trình thực hiện: Nhập vào 2 số
// phức A,B sau đó tính tích C=AxB rồi hiển thị kết quả ra màn hình.
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
        System.out.println("So " + x);
        System.out.println(sp.pt + "+(" + sp.pa + ")i");
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

    SoPhuc cong(SoPhuc sp1, SoPhuc sp2) {
        SoPhuc tong = new SoPhuc();
        tong.pt = sp1.pt + sp2.pt;
        tong.pa = sp1.pa + sp2.pa;
        return tong;
    }

    SoPhuc tich(SoPhuc sp1, SoPhuc sp2) {
        SoPhuc tich = new SoPhuc();
        tich.pt = sp1.pt * sp2.pt + sp1.pa * sp2.pa;
        tich.pa = sp1.pt * sp2.pa + sp1.pa * sp2.pt;
        return tich;
    }

    public static void main(String args[]) throws IOException {
        SoPhuc SP1 = new SoPhuc();
        SoPhuc SP2 = new SoPhuc();
        System.out.println("So thu nhat");
        SP1 = SP1.nhapsp();
        System.out.println("So thu hai");
        SP2 = SP2.nhapsp();
        SP1.in(SP1, "thu 1");
        SP2.in(SP2, "thu 2");
        SoPhuc TONG = new SoPhuc();
        SoPhuc TICH = new SoPhuc();
        TONG = TONG.cong(SP1, SP2);
        TONG.in(TONG, "tong");
        TICH = TICH.tich(SP1, SP2);
        TICH.in(TICH, "tich");
    }
}