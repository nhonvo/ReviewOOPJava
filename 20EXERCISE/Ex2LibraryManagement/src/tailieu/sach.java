package tailieu;
import java.util.Scanner;


public class sach extends tailieu {
    protected String tenTG;
    protected int soTrang;

    public sach() {
        super();
    }

    sach(String MaTL, String TenTL, int SoBanPhatHanh, String tenTG, int soTrang) {
        super(MaTL, TenTL, SoBanPhatHanh);
        tenTG = this.tenTG;
        soTrang = this.soTrang;
    }

    sach(sach s) {
        super(s.MaTL, s.TenTL, s.SoBanPhatHanh);
        tenTG = s.tenTG;
        soTrang = s.soTrang;
    }

    public void Input() {   
        try {
            super.Input();
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap tenTG: ");
            tenTG = sc.nextLine();
            System.out.println("Nhap soTrang: ");
            soTrang = sc.nextInt();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Input files have unknow errors !!!");
        }

    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + " - tenTG: " + tenTG + " - soTrang: " + soTrang;
    }

}
