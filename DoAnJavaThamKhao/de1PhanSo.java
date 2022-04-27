// Đề 1: 
// 1>Xay dung lop phan so voi hai thuoc tinh rieng xac dinh tu so va mau so cua phan so va xay dung cac Phuong thuc: 
//   -Cac toan tu tao lap 
//   -Cac phep toan cong ,tru ,nhan ,chia cac phan so 
//   -phep kiem tra mot phan so co phai toi gian hay ko 
//   -Phep tim dang toi gian cua phan so.
 
// 2>Viet chuong trinh ung dung thuc hien viec nhap vao mot day cac phan so va in ra man hinh dang toi gian cua cac phan so do.

package DoAnJavaThamKhao;

import java.io.*;

class de1PhanSo {
    protected int ts, ms;

    de1PhanSo() {
    }

    
    de1PhanSo(int tu, int mau) {
        ts = tu;
        ms = mau;
    }

    static int nhapgt()throws IOException {
        String str;
        DataInputStream stream=new DataInputStream(System.in);
        str = stream.readLine();
        return Integer.valueOf(str).intValue();
    }

    de1PhanSo nhapps(int x) throws IOException {
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
        de1PhanSo ps = new de1PhanSo(tu, mau);
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

    static de1PhanSo toigian(de1PhanSo ps) {
        de1PhanSo phanso = new de1PhanSo();
        phanso.ts = ps.ts / UCLN(Math.abs(ps.ts), Math.abs(ps.ms));
        phanso.ms = ps.ms / UCLN(Math.abs(ps.ts), Math.abs(ps.ms));
        return phanso;
    }

    static de1PhanSo tong(de1PhanSo ps1, de1PhanSo ps2) {
        de1PhanSo phanso = new de1PhanSo();
        phanso.ts = ps1.ts * ps2.ms + ps2.ts * ps1.ms;
        phanso.ms = ps1.ms * ps2.ms;
        if (phanso.ts != 0)
            phanso = toigian(phanso);
        return phanso;
    }

    static de1PhanSo hieu(de1PhanSo ps1, de1PhanSo ps2) {
        de1PhanSo phanso = new de1PhanSo();
        phanso.ts = ps1.ts * ps2.ms - ps2.ts * ps1.ms;
        phanso.ms = ps1.ms * ps2.ms;
        if (phanso.ts != 0)
            phanso = toigian(phanso);
        return phanso;
    }

    static de1PhanSo tich(de1PhanSo ps1, de1PhanSo ps2) {
        de1PhanSo phanso = new de1PhanSo();
        phanso.ts = ps1.ts * ps2.ts;
        phanso.ms = ps1.ms * ps2.ms;
        if (phanso.ts != 0)
            phanso = toigian(phanso);
        return phanso;
    }

    static de1PhanSo thuong(de1PhanSo ps1, de1PhanSo ps2) {
        de1PhanSo phanso = new de1PhanSo();
        phanso.ts = ps1.ts * ps2.ms;
        phanso.ms = ps1.ms * ps2.ts;
        if (phanso.ts != 0)
            phanso = toigian(phanso);
        return phanso;
    }

    static void hthi(de1PhanSo ps) {
        if (ps.ms == 1 || ps.ts == 0)
            System.out.println(ps.ts);
        else
            System.out.print(ps.ts + "/" + ps.ms);
    }

    public static void main(String args[]) throws IOException {
        de1PhanSo ps1 = new de1PhanSo();
        de1PhanSo ps2 = new de1PhanSo();
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
            System.out.print("Phan so thuong(phan so 1/phan so 2): ");
            hthi(thuong(ps1, ps2));
        } else
            System.out.print("Khong the thuc hien phep chia phan so 1/phan so 2 ");
        System.out.println();
        if (ps1.ts != 0) {
            System.out.print("Phan so thuong(phan so 2/phan so 1): ");
            hthi(thuong(ps2, ps1));
        } else
            System.out.print("Khong the thuc hien phep chia phan so 2/phan so 1 ");
        System.out.println();
    }
}