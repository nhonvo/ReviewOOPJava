import java.util.Scanner;

class connguoi {
    Scanner sc = new Scanner(System.in);
    protected int namsinh;
    protected String ten;
    public connguoi[] a;

    connguoi() {
        namsinh = 0;
        ten = null;
    }

    connguoi(int namsinh, String ten) {
        this.namsinh = namsinh;
        this.ten = ten;
    }

    connguoi(connguoi cn) {
        cn.namsinh = namsinh;
        cn.ten = ten;
    }

    public void input() {
        System.out.println("Namsinh: ");
        namsinh = sc.nextInt();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Ten: ");
        ten = sc.nextLine();
    }

    public void output() {
        System.out.print("  * namsinh: " + namsinh + " ten: " + ten);
    }
}

class hocvien extends connguoi {
    Scanner sc = new Scanner(System.in);

    private float diem1, diem2, diem3;

    hocvien() {
        super();
    }

    hocvien(int namsinh, String ten, float diem1, float diem2, float diem3) {
        super(namsinh, ten);
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }

    hocvien(hocvien hv) {
        super(hv.namsinh, hv.ten);
        hv.diem1 = diem1;
        hv.diem2 = diem2;
        hv.diem3 = diem3;
    }

    public void input() {
        super.input();
        System.out.println("Nhap diem1: ");
        diem1 = sc.nextFloat();
        System.out.println("Nhap diem2: ");
        diem2 = sc.nextFloat();
        System.out.println("Nhap diem3: ");
        diem3 = sc.nextFloat();
    }

    public void output() {
        super.output();
        System.out.print("-- diem1: " + diem1 + " diem2: " + diem2 + " diem3: " + diem3);
    }
}

class PhongBanKhoa {
    private String MaPBK, TenPBK;
    Scanner sc = new Scanner(System.in);

    PhongBanKhoa() {

    }

    PhongBanKhoa(String MaPBK, String TenPBK) {
        this.MaPBK = MaPBK;
        this.TenPBK = TenPBK;
    }

    PhongBanKhoa(PhongBanKhoa pb) {
        pb.MaPBK = MaPBK;
        pb.TenPBK = TenPBK;
    }

    public void input() {
        System.out.println("Nhap maPBK: ");
        MaPBK = sc.nextLine();
        System.out.println("Nhap tenPBK: ");
        TenPBK = sc.nextLine();
    }

    public void ouput() {
        System.out.print(" == MaPBK: " + MaPBK + " TenPBK: " + TenPBK);
    }

}

class nhanvien extends connguoi {
    Scanner sc = new Scanner(System.in);

    protected double luong;
    protected String NgayNhanViec;
    protected PhongBanKhoa pbk;

    nhanvien() {
        luong = 0;
        pbk = new PhongBanKhoa();// ----------------------
        NgayNhanViec = null;
    }

    nhanvien(int namsinh, String ten, String NgayNhanViec, double luong, PhongBanKhoa pbk) {
        super(namsinh, ten);
        this.luong = luong;
        this.NgayNhanViec = NgayNhanViec;
        pbk = new PhongBanKhoa(pbk);// ----------------------

    }

    nhanvien(nhanvien nv) {
        super(nv.namsinh, nv.ten);
        luong = nv.luong;
        NgayNhanViec = nv.NgayNhanViec;
        pbk = new PhongBanKhoa(nv.pbk);// ----------------------
    }

    public void input() {
        super.input();
        System.out.println("Nhap luong: ");
        luong = sc.nextDouble();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ngay lam viec: ");
        NgayNhanViec = sc.nextLine();
        pbk.input();
    }

    public void output() {
        super.output();
        System.out.print(" -- Luong:" + luong +" NgayNhanViec" + NgayNhanViec);
        pbk.ouput();
    }
}

class NhanVienCLCao extends nhanvien {
    protected String Trinhdo, Nganh, NoiDT;

    NhanVienCLCao() {
        super();
        Trinhdo = null;
        Nganh = null;
        NoiDT = null;
    }

    NhanVienCLCao(int namsinh, String ten, String NgayNhanViec, double luong, PhongBanKhoa pbk, String Trinhdo,
            String Nganh, String NoiDT) {
        super(namsinh, ten, NgayNhanViec, luong, pbk);
        this.Trinhdo = Trinhdo;
        this.Nganh = Nganh;
        this.NoiDT = NoiDT;
    }

    NhanVienCLCao(NhanVienCLCao nv) {
        super(nv.namsinh, nv.ten, nv.NgayNhanViec, nv.luong, nv.pbk);
        Trinhdo = nv.Trinhdo;
        Nganh = nv.Nganh;
        NoiDT = nv.NoiDT;
    }
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Trinhdo: ");
        Trinhdo = sc.nextLine();
        System.out.println("Nhap Nganh: ");
        Nganh = sc.nextLine();
        System.out.println("Nhap NoiDT: ");
        NoiDT = sc.nextLine();
    }
    public void output() {
        super.output();
        System.out.print(" -- Trinhdo: " + Trinhdo + " Nganh: " + Nganh + " NoiDT: " + NoiDT);
    }
}

class NVQuanly extends NhanVienCLCao {
    protected double PhucapNV;

    NVQuanly() {
        super();
        PhucapNV = 0;
    }

    NVQuanly(int namsinh, String ten, String NgayNhanViec, double luong, PhongBanKhoa pbk, String Trinhdo, String Nganh,
            String NoiDT, double PhucapNV) {
        super(namsinh, ten, NgayNhanViec, luong, pbk, Trinhdo, Nganh, NoiDT);
        this.PhucapNV = PhucapNV;
    }

    NVQuanly(NVQuanly nv) {
        super(nv.namsinh, nv.ten, nv.NgayNhanViec, nv.luong, nv.pbk, nv.Trinhdo, nv.Nganh, nv.NoiDT);
        PhucapNV = nv.PhucapNV;
    }
    public void input() {
        super.input();
        System.out.println("Nhap phucapNV: ");
        PhucapNV = sc.nextFloat();
    }
    public void output() {
        super.output();
        System.out.print(" == PhucapNV: " + PhucapNV);
    }
}

class GiaoVien extends NhanVienCLCao {
    protected double ThuLapGD;

    GiaoVien() {
        super();
        ThuLapGD = 0;
    }

    GiaoVien(int namsinh, String ten, String NgayNhanViec, double luong, PhongBanKhoa pbk, String Trinhdo, String Nganh,
            String NoiDT, double ThuLapGD) {
        super(namsinh, ten, NgayNhanViec, luong, pbk, Trinhdo, Nganh, NoiDT);
        this.ThuLapGD = ThuLapGD;
    }

    GiaoVien(GiaoVien gv) {
        super(gv.namsinh, gv.ten, gv.NgayNhanViec, gv.luong, gv.pbk, gv.Trinhdo, gv.Nganh, gv.NoiDT);
        gv.ThuLapGD = ThuLapGD;
    }
    public void input() {
        super.input();
        System.out.println("Nhap ThuLapGD: ");
        ThuLapGD = sc.nextFloat();
    }
    public void output() {
        super.output();
        System.out.print(" -- ThuLapGD: " + ThuLapGD);
    }
}