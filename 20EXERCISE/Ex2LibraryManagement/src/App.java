import tailieu.*;
import ds.dstailieu;
import java.util.Scanner;

public class App {

    // - Thêm mới tài liêu: Sách, tạp chí, báo.
    // ▪ Xoá tài liệu theo mã tài liệu.
    // ▪ Cập nhật thông tin về tài liệu dựa vào mã tài liệu.
    // ▪ Tìm kiếm tài liệu theo loại: Sách, tạp chí, báo

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        bao b = new bao();
        tapchi tc = new tapchi();
        sach s = new sach();
        dstailieu ds = new dstailieu();
        int a = 0;
        boolean flag = true;
        do {

            System.out.println("\n======CHUONG TRINH QUAN LI NHAN VIEN====");
            System.out.println("\n******************************************");
            System.out.println("**Ban chon lam gi?                      **");
            System.out.println("**1. THEM TAILIEU: SACH, BAO, TAPCHI    **");
            System.out.println("**2. XUAT DS TAILIEU: SACH, BAO, TAPCHI **");
            System.out.println("**3. XOA TAILIEU THEO MA                **");
            System.out.println("**4. CAP NHAT TAILIEU THEO MA           **");
            System.out.println("**5. TIM KIEM TAILIEU THEO MA           **");
            System.out.println("**Nhap so 0 de thoat                    **");
            System.out.println("******************************************");

            a = sc.nextInt();
            switch (a) {
                case 1:
                    System.out.println("**1. THEM TAILIEU: SACH, BAO, TAPCHI    **");
                    ds.nhaptailieu();
                    break;
                case 2:
                    System.out.println("**2. XUAT DS TAILIEU: SACH, BAO, TAPCHI **");
                    ds.xuatdstailieu();
                    break;
                case 3:
                    System.out.println("**3. XOA TAILIEU THEO MA                **");
                    sc.nextLine();
                    String tl = sc.nextLine();
                    ds.xoatailieu(tl);
                    break;
                case 4:
                    System.out.println("**4. CAP NHAT TAILIEU THEO MA           **");
                    break;
                case 5:
                    System.out.println("**5. TIM KIEM TAILIEU THEO MA           **");
                    sc.nextLine();
                    tl = sc.nextLine();
                    ds.timtailieu(tl);
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
