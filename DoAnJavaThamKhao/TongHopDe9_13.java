package DoAnJavaThamKhao;



// Đề 9: Thư viện của trường đại học KHTN có nhu cầu cần quản lý việc mượn sách.
// Sinh viên đăng ký và tham gia mượn sách thông qua các thẻ mượn mà thư viện đã
// thiết kế. - Với mỗi thẻ mượn, có các thông tin sau: số phiếu mượn , ngày
// mượn, hạn trả , số hiệu sách, và các thông tin riêng về mỗi sinh viên đó. -
// Các thông tin riêng về mỗi sinh viên đó bao gồm: Họ tên, năm sinh, tuổi, lớp.
// 1. Hãy xây dựng lớp SinhVien để quản lý các thông tin riêng về mỗi sinh viên.
// 2. Xây dựng lớp TheMuon để quản lý việc mượn sách của mỗi đọc giả. 3. Xây
// dựng các phương thức để nhập và hiện thị các thông tin riêng cho mỗi sinh
// viên
import java.io.*;

class SinhVien {

    protected String hvt, ns, lop;

    SinhVien() {
    }
}

class TheMuon {
    protected String spm, nm, ht, shs;

    TheMuon() {
    }

    SinhVien sv;
}

class QL {
    static String nhapgt() throws IOException {
        String str;
        DataInputStream stream = new DataInputStream(System.in);
        str = stream.readLine();
        return str;
    }

    static void nhap(TheMuon svm) throws IOException {
        svm.sv = new SinhVien();
        System.out.println("Thong tin rieng cua sinh vie n ");
        System.out.print("Ho ten: ");
        svm.sv.hvt = nhapgt();
        System.out.print("Nam sinh: ");
        svm.sv.ns = nhapgt();
        System.out.print("Lop: ");
        svm.sv.lop = nhapgt();
    }

    static void hienthi(TheMuon svm) {
        System.out.println("Ho ten: " + svm.sv.hvt);
        System.out.println("Nam sinh: " + svm.sv.ns);
        System.out.println("Lop: " + svm.sv.lop);
    }

    public static void main(String args[]) throws IOException {
        int n;
        System.out.print("So Sinh vien: ");
        n = Integer.valueOf(nhapgt()).intValue();
        TheMuon SV[] = new TheMuon[n];
        System.out.println("--------NHAP THONG TIN------ ---");
        for (int j = 0; j < n; j++) {
            System.out.println("Sinh vien thu " + (j + 1));
            SV[j] = new TheMuon();
            nhap(SV[j]);
        }
        System.out.println("----------HIEN THI---------- --- ");
        for (int j = 0; j < n; j++) {
            System.out.println("-------------------- --- ");
            System.out.println("Sinh vien thu " + (j + 1));
            hienthi(SV[j]);
        }
    }
}


// Đề 10: Để quản lý các biên lai thu tiền điện, người ta cần các thông tin như
// sau: - Với mỗi biên lai, có các thông tin sau: thông tin về hộ sử dụng điện,
// chỉ số
// cũ, chỉ số mới, số tiền phải trả của mỗi hộ sử dụng điện - Các thông tin
// riêng của mỗi hộ sử dụng điện gồm: Họ tên chủ hộ, số nhà, mã số công tơ của
// hộ dân sử dụng điện. 1. Hãy xây dựng lớp KhachHang để lưu trữ các thông tin
// riêng của mỗi hộ sử dụng điện. 2. Xây dựng lớp BienLai để quản lý việc sử
// dụng và thanh toán tiền điện của các hộ dân. 3. Xây dựng các phương thức
// nhập, và hiển thị một thông tin riêng của mỗI hộ sử dụng điện. 4. Cài đặt
// chương trình thực hiện các công việc sau: + Nhập vào các thông tin cho n hộ
// sử dụng điện + Hiển thị thông tin về các biên lai đã nhập + Tính tiền điện
// phải trả cho mỗi hộ dân, nếu giả sử rằng tiền phải trả được tính theo công
// thức sau: số tiền phải trả=(Số mới - số cũ) * 750.
import java.io.*;

class KhachHang {
    protected String hvt, sn, mct;

    KhachHang() {
    }
}

class BienLai {
    protected int csc, csm, tt;
    KhachHang kh = new KhachHang();

    BienLai() {
    }

    static String nhapgt() throws IOException {
        String str;
        DataInputStream stream = new DataInputStream(System.in);
        str = stream.readLine();
        return str;
    }

    static void nhapttr(KhachHang khsd) throws IOExceptio n 
{ 
System.out.print("Ho ten: "); khsd.hvt=nhapgt(); System.out.print("So nha: "); khsd.sn=nhapgt(); System.out.print("Ma cong to: "); khsd.mct=nhapgt(); }

    static void hienthittr(KhachHang khsd) {
        System.out.println("Ho ten: " + khsd.hvt);
        System.out.println("So nha: " + khsd.sn);
        System.out.println("Ma cong to: " + khsd.mct);
    }
}

class QL {
    static void nhap(BienLai bl) throws IOException {
        bl.nhapttr(bl.kh);
        System.out.print("Chi so moi: ");
        bl.csm = Integer.valueOf(bl.nhapgt()).intValue();
        System.out.print("Chi so cu: ");
        bl.csc = Integer.valueOf(bl.nhapgt()).intValue();
        bl.tt = (bl.csm - bl.csc) * 750;
    }

    static void hienthi(BienLai bl) {
        bl.hienthittr(bl.kh);
        System.out.println("Chi so moi: " + bl.csm);
        System.out.println("Chi so cu: " + bl.csc);
        System.out.println("Tien tra: " + bl.tt);
    }

    public static void main(String args[]) throws IOException {
        int n;
        System.out.print("So khach hang: ");
        n = Integer.valueOf(BienLai.nhapgt()).intValue();
        BienLai KH[] = new BienLai[n];
        System.out.println("--------NHAP THONG TIN------ ---");
        for (int j = 0; j < n; j++) {
            System.out.println("Khach hang thu " + (j + 1));
            KH[j] = new BienLai();
            nhap(KH[j]);
        }
        System.out.println("----------HIEN THI --------- - ");
        for (int j = 0; j < n; j++) {
            System.out.println("-------------------- --- ");
            hienthi(KH[j]);
        }
    }
}


// Đề 11: Để xử lý văn bản người ta xây dựng lớp văn bản có thuộc tính riêng là
// một xâu ký tự. Hãy: 1. Xây dựng các toán tử tạo lập: VanBan(), VanBan(String
// st) 2. Xây dựng phương thức đếm số từ của một xâu. 3. Xây dựng phương thức
// đếm số ký tự H (không phân biệt chữ thường, chữ hoa) của xâu. 4. Chuẩn hoá
// một xâu theo tiêu chuẩn (Ở đầu và cuối của xâu không có ký tự trống, ở giữa
// xâu không có hai ký tự trắng liền nhau).
import java.io.*;

class VanBan {

    protected String str;

    VanBan() {
    }

    VanBan(String st) {
        str = st;
    }

    public static void main(String args[]) throws IOException {
        String st;
        System.out.print("Nhap xau: ");
        DataInputStream stream = new DataInputStream(System.in);
        st = stream.readLine();
        VanBan VB = new VanBan(st);
        System.out.println("So tu trong xau la: " + dem(VB));
        System.out.println("So kt H (hoac h) trong xau l a: " + demkt(VB));
        VB.str = ChuanHoa(VB);
        System.out.println("Xau chuan hoa: " + VB.str);
    }

    static int dem(VanBan vb) {
        int d;
        vb.str = ChuanHoa(vb);
        if (vb.str.charAt(0) == ' ')
            d = 0;
        else
            d = 1;
        for (int i = 0; i < vb.str.length(); i++)
            if (vb.str.charAt(i) == ' ' && vb.str.charAt(i + 1) != ' ')
                d++;
        return d;
    }

    static int demkt(VanBan vb) {
        int d = 0;
        for (int i = 0; i < vb.str.length(); i++)
            if (vb.str.charAt(i) == 'H' || vb.str.charAt(i) == 'h')
                d++;
        return d;
    }

    static String ChuanHoa(VanBan vb) {
        StringBuffer vbn = new StringBuffer(vb.str);
        while (vbn.charAt(0) == ' ')
            vbn = vbn.delete(0, 1);
        while (vbn.charAt(vbn.length() - 1) == ' ')
            vbn = vbn.delete(vbn.length() - 1, vbn.length());
        for (int i = 1; i < vbn.length(); i++)
            while (vbn.charAt(i) == ' ' && vbn.charAt(i + 1) == ' ')
                vbn = vbn.delete(i, i + 1);
        return (vbn.toString());
    }
}


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
