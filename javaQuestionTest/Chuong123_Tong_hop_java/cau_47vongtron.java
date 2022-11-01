package Chuong123_Tong_hop_java;

class vongtron {
    private int x = 1;
    int y = 2;
}

public class cau_47vongtron {
    /**
     * @param args the command line arguments
     */
    class tamgiac {
        private int x = 2;
        int xy = 23;
    }
    

    public static void main(String[] args) {
        //    Ví dụ về lớp lồng nhau
       cau_47vongtron obj = new cau_47vongtron(); // gọi ra đối tượng lớp ngoài (cau_47vongtron)
       cau_47vongtron.tamgiac tg = obj.new tamgiac(); // từ đối tượng lớp ngoài gọi tiếp lớp trong tamgiac
       System.out.println(tg.x);
       System.out.println(tg.xy);


        vongtron vt = new vongtron();
        System.out.println(vt.y);
        // System.out.println(vt.x); // Lỗi không có quyền truy cập
    }   

}
