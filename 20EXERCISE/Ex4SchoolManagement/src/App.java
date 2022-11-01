import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        dsnv ds = new dsnv();
 
        connguoi cn;
        int a = 0;
        boolean flag = true;

        do {

            System.out.println("\n======CHUONG TRINH QUAN LI NHAN VIEN====");
            System.out.println("\n*****************`*************************");
            System.out.println("**Ban chon lam gi?                      **");
            System.out.println("**1.Nhap 1 hoc vien                       **");
            System.out.println("**2.Nhap 1 nhan vien quan ly              **");
            System.out.println("**3.Nhap 1 giao vien                      **");
            System.out.println("**4.Xuat danh sach hoc vien             **");
            System.out.println("**5.Xuat danh sach nhan vien quan ly    **");
            System.out.println("**6.Xuat danh sach giao vien            **");
            System.out.println("**Nhap so 0 de thoat                    **");
            System.out.println("******************************************");

            a = sc.nextInt();
            switch (a) {
                case 1:
                    System.out.println("Nhap 1 hoc vien: ");
                    System.out.println("---hocvien---");
                    cn = new hocvien();
                    ds.EnterDsnv(cn);
                    break;
                case 2:
                    System.out.println("Nhap 1 nhan vien quan ly: ");
                    System.out.println("---NVQuanly---");
                    cn = new NVQuanly();
                    ds.EnterDsnv(cn);
                    break;
                case 3:
                    System.out.println("Nhap 1 giao vien: ");
                    System.out.println("---GiaoVien---");
                    cn = new GiaoVien();
                    ds.EnterDsnv(cn);
                    break;
                case 4:
                    System.out.println("Xuat danh sach hoc vien: ");
                    System.out.println("---hocvien---");
                    ds.PrintDsnv(3);
                    break;
                case 5:
                    System.out.println("Xuat danh sach NVQuanly: ");
                    System.out.println("---NVQuanly---");
                    ds.PrintDsnv(2);
                    break;
                case 6:
                    System.out.println("Xuat danh sach GiaoVien: ");
                    System.out.println("---GiaoVien---");
                    ds.PrintDsnv(1);
                    break;
                case 0:
                    System.out.println("Goodbye");
                    flag = false;
                    break;
                default:
                    System.out.println("Chua co tinh nang nay!!");
                    break;
            }
        } while (flag);
    }
}
