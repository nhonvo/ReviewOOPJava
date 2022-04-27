package DoAnJavaThamKhao;


// Đề 8: Khoa CNTT-DHTN cần quản lý việc thanh toán tiền lương cho các cán bộ
// giáo viên trong khoa. Để quản lý được, thì nhà quản lý cần có những thông tin
// như sau: - Với mỗi cán bộ giáo viên, có các thông tin như sau: lương cứng,
// thướng, phạt, lương thực lĩnh và các thông tin cá nhân của mỗi cán bộ giáo
// viên - Các thông tin cá nhân của mỗi cán bộ giáo viên: Họ và tên, năm sinh,
// quê quán. 1. Hãy xây dựng lớp Nguoi để quản lý các thông tin cá nhân về mỗi
// cán bộ giáo viên 2. Xây dựng lớp CBGV ( cán bộ giáo viên) để quản lý các
// thông tin về mỗi cán bộ giáo viên 3. Xây dựng các phương thức : nhập, hiển
// thị các thông tin cá nhân của mỗi cán bộ giáo viên 4. Tính lương thực lĩnh
// cho mỗi cán bộ nếu công thức tính lương được tính như sau: Lương thực
// lĩnh=Lương cứng + thưởng - phạt
import java.io.*;

class Nguoi {

    protected String hvt, qq;
    protected int ns;

    Nguoi() {
    }
}

class CBGV {
    protected int lc, tg, ph, tl;

    CBGV() {
    }

    Nguoi gv;
}

class QL {
    static String nhapgt() throws IOException {
        String str;
        DataInputStream stream = new DataInputStream(System.in);
        str = stream.readLine();
        return str;
    }

    static void nhap(CBGV cbgv) throws IOException {
        cbgv.gv = new Nguoi();
        System.out.println("Thong tin cua Giao vien ");
        System.out.print("Ho ten: ");
        cbgv.gv.hvt = nhapgt();
        System.out.print("Nam sinh: ");
        cbgv.gv.ns = Integer.valueOf(nhapgt()).intValue();
        System.out.print("Que quan: ");
        cbgv.gv.qq = nhapgt();
    }

    static int tinh(CBGV cbgv) throws IOException {
        System.out.print("Luong cung: ");
        cbgv.lc = Integer.valueOf(nhapgt()).intValue();
        System.out.print("Thuong: ");
        cbgv.tg = Integer.valueOf(nhapgt()).intValue();
        System.out.print("Phat: ");
        cbgv.ph = Integer.valueOf(nhapgt()).intValue();
        return cbgv.lc + cbgv.tg - cbgv.ph;
    }

    static void hienthi(CBGV cbgv) {
        System.out.println("Ho ten: " + cbgv.gv.hvt);
        System.out.println("Nam sinh: " + cbgv.gv.ns);
        System.out.println("Que quan: " + cbgv.gv.qq);
        System.out.println("Thuc linh: " + cbgv.tl);
    }

    public static void main(String args[]) throws IOException {
        int n;
        System.out.print("So giao vien: ");
        n = Integer.valueOf(nhapgt()).intValue();
        CBGV GV[] = new CBGV[n];
        System.out.println("--------NHAP THONG TIN------ ---");
        for (int j = 0; j < n; j++) {
            System.out.println("Giao vien thu " + (j + 1));
            GV[j] = new CBGV();
            nhap(GV[j]);
            GV[j].tl = tinh(GV[j]);
        }
        int d = 0;
        System.out.println("----------HIEN THI --------- - ");
        for (int j = 0; j < n; j++) {
            System.out.println("-------------------- --- ");
            hienthi(GV[j]);
        }
    }
}
