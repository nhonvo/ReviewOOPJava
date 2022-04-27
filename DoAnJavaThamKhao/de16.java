package DoAnJavaThamKhao;

// Đề 16: Lớp phân số có thuộc tính riêng gồm: tử số và mẫu số. Hãy: - Xây dựng
// toán tử tạo lâp: PhanSo(), PhanSo(int tuso, int mauso). - Xây dựng các phương
// thức: + Nhập vào 1 phân số. + HIển thị 1 phân số. + Rút gọn 1 phân sô. + Chia
// 2 phân số. + Trừ 2 phân số. - Cài đặt chương trình: Nhập vào 2 phân số A,B
// sau đó tính tổng C=A+B rồi hiện kết quả ra màn hình.
import java.io.*;

class PhanSo {

    protected int ts, ms;

    PhanSo() {
    }

    PhanSo(int tu, int mau) {
        ts = tu;
        ms = mau;
    }

    static int nhapgt() throws IOException {
        String str;
        DataInputStream stream = new DataInputStream(System.in);
        str = stream.readLine();
        return Integer.valueOf(str).intValue();
    }

    PhanSo nhapps(int x) throws IOException {
        int tu, mau;
        System.out.println("Nhap phan so thu " + x);
        System.out.print("Tu so: ");
        tu = nhapgt();
        System.out.print("Mau so: ");
        do {
            mau = nhapgt();
            if (mau == 0)
                System.out.print("Nhap lai: ");
        } while (mau == 0);
        PhanSo ps = new PhanSo(tu, mau);
        return ps;
    }

    static int UCLN(int a, int b) {
        while (a != b)
            if (a > b)
                a = a - b;
            else
                b = b - a;
        return a;
    }

    static PhanSo toigian(PhanSo ps) {
        PhanSo phanso = new PhanSo();
        phanso.ts = ps.ts / UCLN(Math.abs(ps.ts), Math.abs(ps.ms));
        phanso.ms = ps.ms / UCLN(Math.abs(ps.ts), Math.abs(ps.ms));
        return phanso;
    }

    static PhanSo tong(PhanSo ps1, PhanSo ps2) {
        PhanSo phanso = new PhanSo();
        phanso.ts = ps1.ts * ps2.ms + ps2.ts * ps1.ms;
        phanso.ms = ps1.ms * ps2.ms;
        if (phanso.ts != 0)
            phanso = toigian(phanso);
        return phanso;
    }

    static PhanSo hieu(PhanSo ps1, PhanSo ps2) {
        PhanSo phanso = new PhanSo();
        phanso.ts = ps1.ts * ps2.ms - ps2.ts * ps1.ms;
        phanso.ms = ps1.ms * ps2.ms;
        if (phanso.ts != 0)
            phanso = toigian(phanso);
        return phanso;
    }

    static PhanSo tich(PhanSo ps1, PhanSo ps2) {
        PhanSo phanso = new PhanSo();
        phanso.ts = ps1.ts * ps2.ts;
        phanso.ms = ps1.ms * ps2.ms;
        if (phanso.ts != 0)
            phanso = toigian(phanso);
        return phanso;
    }

    static PhanSo thuong(PhanSo ps1, PhanSo ps2) {
        PhanSo phanso = new PhanSo();
        phanso.ts = ps1.ts * ps2.ms;
        phanso.ms = ps1.ms * ps2.ts;
        if (phanso.ts != 0)
            phanso = toigian(phanso);
        return phanso;
    }

    static void hthi(PhanSo ps) {
        if (ps.ms == 1 || ps.ts == 0)
            System.out.println(ps.ts);
        else
            System.out.print(ps.ts + "/" + ps.ms);
    }

    public static void main(String args[]) throws IOException {
        PhanSo ps1 = new PhanSo();
        PhanSo ps2 = new PhanSo();
        ps1 = ps1.nhapps(1);
        ps2 = ps2.nhapps(2);
        if (ps1.ts != 0)
            ps1 = toigian(ps1);
        if (ps2.ts != 0)
            ps2 = toigian(ps2);
        System.out.print("Phan so 1 o dang toi gian: ");
        hthi(ps1);
        System.out.println();
        System.out.print("Phan so 2 o dang toi gian: ");
        hthi(ps2);
        System.out.println();
        System.out.print("Phan so tong: ");
        hthi(tong(ps1, ps2));
        System.out.println();
        System.out.print("Phan so hieu(phan so 1- phan so 2): ");
        hthi(hieu(ps1, ps2));
        System.out.println();
        System.out.print("Phan so hieu(phan so 2- phan so 1): ");
        hthi(hieu(ps2, ps1));
        System.out.println();
        System.out.print("Phan so tich: ");
        hthi(tich(ps1, ps2));
        System.out.println();
        if (ps2.ts != 0) {
            System.out.print("Phan so thuong(phan so 1/phan so 2 ): ");
            hthi(thuong(ps1, ps2));
        } else
            System.out.print("Khong the thuc hien phep chia phan so 1/phan s o 2 ");
        System.out.println();
        if (ps1.ts != 0) {
            System.out.print("Phan so thuong(phan so 2/phan so 1): ");
            hthi(thuong(ps2, ps1));
        } else
            System.out.print("Khong the thuc hien phep chia phan so 2/phan so 1 ");
        System.out.println();
    }
}
