import java.util.Scanner;

abstract public class nhanvien {
    protected int manv, namsinh;
    protected double luongcb;
    protected String tennv, trinhdo;

    nhanvien() {
        manv = 0;
        namsinh = 0;
        luongcb = 0;
        tennv = null;
        trinhdo = null;
    }

    nhanvien(int manv, int namsinh, double luongcb, String tennv, String trinhdo) {
        this.manv = manv;
        this.namsinh = namsinh;
        this.luongcb = luongcb;
        this.tennv = tennv;
        this.trinhdo = trinhdo;
    }

    nhanvien(nhanvien nv) {
        nv.manv = manv;
        nv.namsinh = namsinh;
        nv.luongcb = luongcb;
        nv.tennv = tennv;
        nv.trinhdo = trinhdo;
    }

    abstract long tinhLuong() ;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap manv: ");
        manv = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap tennv: ");
        tennv = sc.nextLine();
        System.out.println("Nhap luongcb: ");
        luongcb = sc.nextDouble();
        sc.nextLine();
        System.out.println("Nhap trinhdo: ");
        trinhdo = sc.nextLine();
    }

    public void output() {
        System.out.println("\nmanv: " + manv + " tennv: " + tennv + " luongcb: " + luongcb + " trinhdo: " + trinhdo);
    }
}

abstract class chitietnv extends nhanvien {
    protected String chuyenmon;

    chitietnv() {

    }

    chitietnv(int manv, int namsinh, double luongcb, String tennv, String trinhdo, String chuyenmon) {
        super(manv, namsinh, luongcb, tennv, trinhdo);
        chuyenmon = this.chuyenmon;
    }

    chitietnv(chitietnv ct1) {
        super(ct1.manv, ct1.namsinh, ct1.luongcb, ct1.tennv, ct1.trinhdo);
        manv = ct1.manv;
        namsinh = ct1.namsinh;
        luongcb = ct1.luongcb;
        tennv = ct1.tennv;
        trinhdo = ct1.trinhdo;
        chuyenmon = ct1.chuyenmon;
    }

    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuyenmon: ");
        chuyenmon = sc.nextLine();
    }

    public void output() {
        super.output();
        System.out.print(" chuyenmon: " + chuyenmon);
    }

}

class nvquanly extends chitietnv {
    protected double phucapchuvu;

    nvquanly() {
        super();
    }

    nvquanly(int manv, int namsinh, double luongcb, String tennv, String trinhdo, String chuyenmon,
            double phucapchuvu) {
        super(manv, namsinh, luongcb, tennv, trinhdo, chuyenmon);
        this.phucapchuvu = phucapchuvu;
    }

    nvquanly(nvquanly ql) {
        super(ql.manv, ql.namsinh, ql.luongcb, ql.tennv, ql.trinhdo, ql.chuyenmon);
        manv = ql.manv;
        namsinh = ql.namsinh;
        luongcb = ql.luongcb;
        tennv = ql.tennv;
        trinhdo = ql.trinhdo;
        chuyenmon = ql.chuyenmon;
    }

    public long tinhLuong() {

        return (long) (luongcb + phucapchuvu);
    }

    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap phucapchuvu: ");
        phucapchuvu = sc.nextDouble();
    }

    public void output() {
        super.output();
        System.out.print(" phucapchuvu: " + phucapchuvu);
    }
}

class nvnghiencuu extends chitietnv {
    protected double phucapdochai;

    nvnghiencuu() {
        super();
    }

    nvnghiencuu(int manv, int namsinh, double luongcb, String tennv, String trinhdo, String chuyenmon,
            double phucapdochai) {
        super(manv, namsinh, luongcb, tennv, trinhdo, chuyenmon);
        this.phucapdochai = phucapdochai;
    }

    nvnghiencuu(nvnghiencuu nc) {
        super(nc.manv, nc.namsinh, nc.luongcb, nc.tennv, nc.trinhdo, nc.chuyenmon);
        phucapdochai = nc.phucapdochai;
    }

    public long tinhLuong() {

        return (long) (luongcb + phucapdochai);
    }

    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap phucapdochai: ");
        phucapdochai = sc.nextDouble();
    }

    public void output() {
        super.output();
        System.out.print(" phucapdochai: " + phucapdochai);
    }

}

class nvphucvu extends nhanvien {
    nvphucvu() {
        super();
    }

    nvphucvu(int manv, int namsinh, double luongcb, String tennv, String trinhdo) {
        super(manv, namsinh, luongcb, tennv, trinhdo);
    }

    nvphucvu(nvphucvu pv) {
        super(pv.manv, pv.namsinh, pv.luongcb, pv.tennv, pv.trinhdo);
    }

    public void output() {
        super.output();
    }

    public long tinhLuong() {

        return (long) (luongcb);
    }

}
