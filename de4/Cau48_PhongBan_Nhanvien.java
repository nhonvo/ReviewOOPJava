package de4;

class PhongBan {
    String map = "P01", tenp = "Ke hoach";

    public String tostring() {
        return map + "\t" + tenp;
    }
}

class NhanVien {
    String hoten = "Le Thi Hoa";
    String nnv = "06/02/2012";
    PhongBan pbk;

    void outData() {
        // pbk = new PhongBan();
        System.out.print(hoten + "\t" + nnv + "\t" + pbk);
        // note: chay ra Le Thi Hoa      06/02/2012      null
        // Nhưng đáp án lỗi vì chưa khởi tạo đối tượng phòng ban
    }
}

class Cau48_PhongBan_Nhanvien {
    public static void main(String[] args) {
        NhanVien nv = new NhanVien();
        nv.outData();
    }
}
