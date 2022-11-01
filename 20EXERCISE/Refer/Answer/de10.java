
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

