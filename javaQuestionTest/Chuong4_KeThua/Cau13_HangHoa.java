package Chuong4_KeThua;
public class Cau13_HangHoa {
    protected  String MaHang, TenHang, NhaSX;
    Cau13_HangHoa(String MaHang, String TenHang, String NhaSX){
        this.MaHang = MaHang;
        this.TenHang = TenHang;
        this.NhaSX = NhaSX;
    }
}

class DienMay extends Cau13_HangHoa {
    private float DienAp;
    DienMay(float DienAp) {
        super(); //  Lỗi không có tham so trong super() vì đã khai báo contructor truyền tham số ở trên
        // câu trong file ôn tập trên lớp
        this.DienAp = DienAp;
    }
}
class demo{
    public static void main(String[] args) {
        DienMay d1 = new DienMay(1);
        // System.out.println();
        DienMay test = new DienMay(); // Lỗi chưa khởi tạo contructor chuẩn
    }
    
}