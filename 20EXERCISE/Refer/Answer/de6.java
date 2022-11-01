package DoAnJavaThamKhao;

// Đề 6: Để quản lý khách hàng đến **** phòng trọ của một khách sạn, người ta cần quản lý những thông tin sau: - Số ngày trọ, loại phòng trọ, giá phòng, và các thông tin cá nhân về mỗi 
// khách trọ. - Với mỗi cá nhân, người ta cần quản lý các thông tin : Họ và tên, tuổi, năm sinh, số chứng minh thư nhân dân. 1. Hãy xây dựng lớp Nguoi để quản lý thông tin cá nhân về mỗi cá nhân 2. Xây dựng lớp KhachSan để quản lý các thông tin về khách trọ. 3. Viết các phương thức : nhập, hiển thị các thông tin về mỗi khách trọ 4. Cài đặt chương trình thực hiện các công việc sau: - Nhập vào một dãy gồm n khách trọ ( n - nhập từ bàn phím) - Hiển thị ra màn hình thông tin về các cá nhân hiện đang trọ ở khách sạn đó. 
import java.io.*;

class Nguoi {
    protected String hvt, ns, scm;

    Nguoi() {
    }
}

class KhachSan {
    protected String snt, lp, gp;

    KhachSan() {
    }

    Nguoi kt;
}

class QL {
    static String nhapgt() throws IOException {
        String str;
        DataInputStream stream = new DataInputStream(System.in);
        str = stream.readLine();
        return str;
    }

    static void nhap(KhachSan ks) throws IOException {
        System.out.print("So ngay tro: ");
        ks.snt = nhapgt();
        System.out.print("Loai phong: ");
        ks.lp = nhapgt();
        System.out.print("Gia phong(d/ngay): ");
        ks.gp = nhapgt();
        ks.kt = new Nguoi();
        System.out.println("Thong tin ca nhan cua khach ");
        System.out.print("Ho ten: ");
        ks.kt.hvt = nhapgt();
        System.out.print("Nam sinh: ");
        ks.kt.ns = nhapgt();
        System.out.print("So CM nhan dan: ");
        ks.kt.scm = nhapgt();
    }

    static void hienthi(KhachSan ks) {
        System.out.println("Ho ten: " + ks.kt.hvt);
        System.out.println("Nam sinh: " + ks.kt.ns);
        System.out.println("So CMND: " + ks.kt.scm);
    }

    public static void main(String args[]) throws IOException {
        int n;
        System.out.print("So khach tro: ");
        n = Integer.valueOf(nhapgt()).intValue();
        KhachSan KT[] = new KhachSan[n];
        System.out.println("--------NHAP THONG TIN------ ---");
        for (int j = 0; j < n; j++) {
            System.out.println("Khach tro thu " + (j + 1));
            KT[j] = new KhachSan();
            nhap(KT[j]);
        }
        System.out.println("----------HIEN THI---------- --- ");
        for (int j = 0; j < n; j++) {
            System.out.println("-------------------- --- ");
            System.out.println("Khach tro thu " + (j + 1));
            hienthi(KT[j]);
        }
    }
}
