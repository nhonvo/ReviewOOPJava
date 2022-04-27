package DoAnJavaThamKhao;

// Đề 15: Một công ty được giao nhiệm vụ quản lý các phương tiện giao thông gồm
// các loại: ô tô, xe máy, xe tải. + mỗi loại phương tiện giao thông cần quản
// lý: Hãng sản xuất, năm sản xuất, giá bán và màu. + Các ô tô cần quản lý: số
// chỗ ngồi, kiểu động cơ + Xe máy cần quản lý: công suất + Xe tải cần quản lý:
// trọng tải. 2. Xây dựng các lớp XeTai, XeMay, OTo kế thừa từ lớp PTGT. 3. Xây
// dựng các hàm để truy nhập, hiển thị và kiểm tra các thuộc tính của các lớp.
// 4. Xây dựng lớp QLPTGT cài đặt các phương thức thực hiện các chức năng sau: -
// Nhập đăng ký phương tiện - Tìm phương tiện theo màu - Kết thúc.

import java.io.*;

class PTGT {

    protected String hsx, mau;
    protected int nsx, gb;

    PTGT() {
    }
}

class Oto extends PTGT {
    protected String kdc;
    protected int socn;

    Oto() {
    }
}

class XeMay extends PTGT {
    protected String cs;

    XeMay() {
    }
}

class XeTai extends PTGT {
    protected String tt;

    XeTai() {
    }
}

class QLPTGT {
    static String nhapgt() throws IOException {
        String str;
        DataInputStream stream = new DataInputStream(System.in);
        str = stream.readLine();
        return str;
    }

    static void nhappt(PTGT pt) throws IOException {
        System.out.print("Hang san xuat: ");
        pt.hsx = nhapgt();
        System.out.print("Nam san xuat: ");
        pt.nsx = Integer.valueOf(nhapgt()).intValue();
        System.out.print("Mau: ");
        pt.mau = nhapgt();
        System.out.print("Gia ban: ");
        pt.gb = Integer.valueOf(nhapgt()).intValue();
    }

    static void nhapoto(Oto oto) throws IOException {
        nhappt(oto);
        System.out.print("So cho ngoi: ");
        oto.socn = Integer.valueOf(nhapgt()).intValue();
        System.out.print("Kieu dong co: ");
        oto.kdc = nhapgt();
    }

    static void nhapxemay(XeMay xm) throws IOException {
        nhappt(xm);
        System.out.print("Cong suat: ");
        xm.cs = nhapgt();
    }

    static void nhapxetai(XeTai xt) throws IOException {
        nhappt(xt);
        System.out.print("Trong tai: ");
        xt.tt = nhapgt();
    }

    static void hienthipt(PTGT pt) {
        System.out.println("Hang san xuat: " + pt.hsx);
        System.out.println("Nam san xuat: " + pt.nsx);
        System.out.println("Gia ban: " + pt.gb);
        System.out.println("Mau: " + pt.mau);
    }

    static void hienthioto(Oto oto) {
        System.out.println("----------OTO---------");
        hienthipt(oto);
        System.out.println("So cho ngoi: " + oto.socn);
        System.out.println("Kieu dong co: " + oto.kdc);
    }

    static void hienthixemay(XeMay xm) {
        System.out.println("----------XE MAY---------");
        hienthipt(xm);
        System.out.println("Cong suat: " + xm.cs);
    }

    static void hienthixetai(XeTai xt) {
        System.out.println("---------XE TAI----------");
        hienthipt(xt);
        System.out.println("Trong tai: " + xt.tt);
    }

    static boolean ssxau(String s1, String s2) {
        if (s1.equalsIgnoreCase(s2))
            return false;
        else
            return true;
    }

    static int nhaplc() throws IOException {
        String a;
        System.out.print("Ten phuong tien: ");
        do {
            a = nhapgt();
            if (ssxau(a, "oto") && ssxau(a, "xemay") && ssxau(a, "xetai"))
                System.out.print("Ban chi co the nhap oto/xemay/xetai: ");
        } while (ssxau(a, "oto") && ssxau(a, "xemay") && ssxau(a, "xetai"));
        if (ssxau(a, "oto") == false)
            return 1;
        else if (ssxau(a, "xemay") == false)
            return 2;
        else if (ssxau(a, "xetai") == false)
            return 3;
        else
            return 0;
    }

    static void timpt(Oto oto, XeMay xm, XeTai xt, String mau) throws IOException {
        if (oto != null && oto.mau.equalsIgnoreCase(mau))

            hienthioto(oto);
        if (xm != null && xm.mau.equalsIgnoreCase(mau))

            hienthixemay(xm);
        if (xt != null && xt.mau.equalsIgnoreCase(mau))

            hienthixetai(xt);
    }

    public static void main(String args[]) throws IOException {
        int n, sot = 0, sxm = 0, sxt = 0;
        System.out.print("So phuong tien: ");
        n = Integer.valueOf(nhapgt()).intValue();
        Oto[] OT = new Oto[n];
        XeMay[] XM = new XeMay[n];
        XeTai[] XT = new XeTai[n];
        for (int i = 0; i < n; i++) {
            int lc = nhaplc();
            switch (lc) {
                case 1:
                    OT[sot] = new Oto();
                    nhapoto(OT[sot]);
                    sot++;
                    break;
                case 2:
                    XM[sxm] = new XeMay();
                    nhapxemay(XM[sxm]);
                    sxm++;
                    break;
                case 3:
                    XT[sxt] = new XeTai();
                    nhapxetai(XT[sxt]);
                    sxt++;
                    break;
                default:
                    System.out.println();
            }
        }
        System.out.println("----------HIEN THI---------- ");
        for (int i = 0; i < n; i++) {
            if (OT[i] != null)
                hienthioto(OT[i]);
            if (XM[i] != null)
                hienthixemay(XM[i]);
            if (XT[i] != null)
                hienthixetai(XT[i]);
        }
        System.out.println("------------TIM KIEM-------- ---");
        System.out.print("Nhap mau can tim: ");
        String mau;
        mau = nhapgt();
        for (int i = 0; i < n; i++)
            timpt(OT[i], XM[i], XT[i], mau);
    }
}
