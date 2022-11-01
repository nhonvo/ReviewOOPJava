package tailieu;

import java.util.Scanner;

public class tapchi extends tailieu {
    protected int SoPhatHanh;
    protected int ThangPhatHanh;

    public tapchi() {

    }

    tapchi(String MaTL, String TenTL, int SoBanPhatHanh, int SoPhatHanh, int ThangPhatHanh) {
        super(MaTL, TenTL, SoBanPhatHanh);
        SoPhatHanh = this.SoPhatHanh;
        ThangPhatHanh = this.ThangPhatHanh;
    }

    tapchi(tapchi tc) {
        super(tc.MaTL, tc.TenTL, tc.SoBanPhatHanh);
        SoPhatHanh = tc.SoPhatHanh;
        ThangPhatHanh = tc.ThangPhatHanh;
    }

    public void Input() {
        try {

            super.Input();
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap SoPhatHanh");
            SoPhatHanh = sc.nextInt();
            System.out.println("Nhap ThangPhatHanh");
            ThangPhatHanh = sc.nextInt();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Input files have unknow errors !!!");

        }
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + " - SoPhatHanh=" + SoPhatHanh + " - ThangPhatHanh=" + ThangPhatHanh;
    }
}