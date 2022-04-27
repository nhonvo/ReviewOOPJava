// Đề 5: Để quản lý các hộ dân trong một khu phố, người ta quản lý các thông tin như sau: 
// - Với mỗi hộ dân, có các thuộc tính: 
//     + Số thành viên trong hộ ( số người) 
//     + Số nhà của hộ dân đó. ( Số nhà được gắn cho mỗi hộ dân) 
//     + Thông tin về mỗi cá nhân trong hộ gia đình. 
// - Với mỗi cá nhân, người ta quản lý các thông tin như: họ và tên, tuổi, năm sinh, nghề nghiệp. 
// 1. Hãy xây dựng lớp Nguoi để quản lý thông tin về mỗi cá nhân. 
// 2. Xây dựng lớp KhuPho để quản lý thông tin về các hộ gia đình. 
// 3. Viết các phương thức nhập, hiển thị thông tin cho mỗi cá nhân. 
// 4. Cài đặt chương trình thực hiện các công việc sau: 
//     - Nhập vào một dãy gồm n hộ dân (n - nhập từ bàn phím). 
//     - Hiển thị ra màn hình thông tin về các hộ trong khu phố. 

package DoAnJavaThamKhao;

import java.io.*;


class Nguoi {
    protected String hvt, ns, nn;

    Nguoi() {
    }
}

class KhuPho {
    protected int stv, sn;

    KhuPho() {
    }

    Nguoi tv[];
}

class QL {
    static String nhapgt() throws IOException {
        String str;
        DataInputStream stream = new DataInputStream(System.in);
        str = stream.readLine();
        return str;
    }

    static void nhap(KhuPho kp) throws IOException {
        System.out.print("So nha: ");
        kp.sn = Integer.valueOf(nhapgt()).intValue();
        System.out.print("So thanh vien: ");
        kp.stv = Integer.valueOf(nhapgt()).intValue();
        kp.tv = new Nguoi[kp.stv];
        for (int i = 0; i < kp.stv; i++) {
            System.out.println("Thanh vien thu " + (i + 1));
            kp.tv[i] = new Nguoi();
            System.out.print("Ho ten: ");
            kp.tv[i].hvt = nhapgt();
            System.out.print("Nam sinh: ");
            kp.tv[i].ns = nhapgt();
            System.out.print("Nghe nghiep: ");
            kp.tv[i].nn = nhapgt();
        }
    }

    static void hienthi(KhuPho kp) {
        System.out.println("So thanh vien: " + kp.stv);
        System.out.println("So nha: " + kp.sn);
        for (int i = 0; i < kp.stv; i++) {
            System.out.println("Thanh vien thu " + (i + 1));
            System.out.println("Ho ten: " + kp.tv[i].hvt);
            System.out.println("Nam sinh: " + kp.tv[i].ns);
            System.out.println("Nghe nghiep: " + kp.tv[i].nn);
        }
    }

    public static void main(String args[]) throws IOException {
        int n;
        System.out.print("So ho: ");
        n = Integer.valueOf(nhapgt()).intValue();
        KhuPho KP[] = new KhuPho[n];
        System.out.println("--------NHAP THONG TIN------ ---");
        for (int j = 0; j < n; j++) {
            System.out.println("Ho thu " + (j + 1));
            KP[j] = new KhuPho();
            nhap(KP[j]);
        }
        System.out.println("----------HIEN THI---------- ");
        for (int j = 0; j < n; j++) {
            System.out.println("-------------------- --- ");
            System.out.println("Ho thu " + (j + 1));
            hienthi(KP[j]);
        }
    }
}
