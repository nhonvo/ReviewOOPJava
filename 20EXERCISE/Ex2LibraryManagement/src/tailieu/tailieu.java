package tailieu;
import java.util.Scanner;


//                             taileu: Mã tài liệu, Tên nhà xuất bản, số bản phát hành

//  sach(tên tác giả, số trang)      tapchi ( Số phát hành, tháng phát hành)       bao(Ngày phát hành.)

public class tailieu {
    protected String MaTL, TenTL;
    protected int SoBanPhatHanh;

    public void setMaTL(String MaTL) {
        MaTL = this.MaTL;
    }

    public void setTenTL(String TenTL) {
        TenTL = this.TenTL;
    }

    public void setSoBanPhatHanh(int SoBanPhatHanh) {
        SoBanPhatHanh = this.SoBanPhatHanh;
    }

    public String getMaTL() {
        return MaTL;
    }

    public String getTenTL() {
        return TenTL;
    }

    public int getSoBanPhatHanh() {
        return SoBanPhatHanh;
    }

    public tailieu() {

    }

    tailieu(String MaTL, String TenTL, int SoBanPhatHanh) {
        MaTL = this.MaTL;
        TenTL = this.TenTL;
        SoBanPhatHanh = this.SoBanPhatHanh;
    }

    tailieu(tailieu tl) {
        MaTL = tl.MaTL;
        TenTL = tl.TenTL;
        SoBanPhatHanh = tl.SoBanPhatHanh;
    }

    public void Input() {
        Scanner sc = new Scanner(System.in);
        try {
                System.out.println("Nhap MaTL: ");
            MaTL = sc.nextLine();
            System.out.println("Nhap TenTL: ");
            TenTL = sc.nextLine();
            System.out.println("Nhap SoBanPhatHanh: ");
            SoBanPhatHanh = sc.nextInt();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Input files have unknow errors !!!");

        }
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "MaTL: " + MaTL + " - TenTL: " + TenTL + " - SoBanPhatHanh: " + SoBanPhatHanh;
    }

}
