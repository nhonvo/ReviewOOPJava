import java.util.Scanner;

public class App {
    public static final int NHANVIENQL = 1;
    public static final int NHANVIENPV = 2;
    public static final int NHANVIENNC = 3;
    public static int a = 0;
    public static boolean flag = true;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        dsnv ds = new dsnv();
        nvquanly nvql = new nvquanly();
        nvnghiencuu nvnc = new nvnghiencuu();
        nvphucvu nvpv = new nvphucvu();
        do {

            System.out.println("\n========CHUONG TRINH QUAN LI NHAN VIEN======");
            System.out.println("\n***********************************************");
            System.out.println("**Ban chon lam gi?                          **");
            System.out.println("**1.Nhap 1 nhan vien quan ly                **");
            System.out.println("**2.Nhap 1 nhan vien phuc vu                **");
            System.out.println("**3.Nhap 1 nhan vien nghien cuu             **");
            System.out.println("**4.Xuat danh sach nhan vien quan ly        **");
            System.out.println("**5.Xuat danh sach nhan vien phuc vu        **");
            System.out.println("**6.Xuat danh sach nhan vien nghien cuu     **");
            System.out.println("**Nhap so 0 de thoat                        **");
            System.out.println("**********************************************");

            a = sc.nextInt();
            switch (a) {
                case 1:
                    System.out.println("**1.Nhap 1 nhan vien quan ly                **");
                    ds.inputds(nvql);
                    break;
                case 2:
                    System.out.println("**2.Nhap 1 nhan vien phuc vu                **");
                    ds.inputds(nvpv);
                    break;
                case 3:
                    System.out.println("**3.Nhap 1 nhan vien nghien cuu             **");
                    ds.inputds(nvnc);
                    break;
                case 4:
                    System.out.println("**4.Xuat danh sach nhan vien quan ly        **");
                    ds.outputds(NHANVIENQL);
                    break;
                case 5:
                    System.out.println("**5.Xuat danh sach nhan vien phuc vu        **");
                    ds.outputds(NHANVIENPV);
                    break;
                case 6:
                    System.out.println("**6.Xuat danh sach nhan vien nghien cuu     **");
                    ds.outputds(NHANVIENNC);

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
