package tailieu;
import java.util.Scanner;



public class bao extends tailieu {
    protected int NgayPhatHanh;

    public bao() {
        super();
    }

    bao(String MaTL, String TenTL, int SoBanPhatHanh, int NgayPhatHanh) {
        super(MaTL, TenTL, SoBanPhatHanh);
        NgayPhatHanh = this.NgayPhatHanh;
    }

    bao(bao b) {
        super(b.MaTL, b.TenTL, b.SoBanPhatHanh);
        NgayPhatHanh = b.SoBanPhatHanh;
    }

    public void Input() {
        try {
            super.Input();
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap NgayPhatHanh");
            NgayPhatHanh = sc.nextInt();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Input files have unknow errors !!!");

        }
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + " - NgayPhatHanh: " + NgayPhatHanh;
    }
}