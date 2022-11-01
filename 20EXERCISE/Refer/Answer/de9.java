
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

