package Chuong4_KeThua;

public class cau46_nguoi_nhanvien {
    class Nguoi {
        String ten = "Le Van Teo";
        int namsinh = 1987;

        // cach 1:
        Nguoi() {
        }

        Nguoi(String t, int n) {
            ten = t;
            namsinh = n;
        }
    }

    class NhanVien extends Nguoi {
        float luong = 250.5F;
        String nnv = "06/02/2012";

        // cach 2 them thuoc tinh cho super()
        NhanVien(float l, String n) {
            super();
            luong = l;
            nnv = n;
        }
    }
}
