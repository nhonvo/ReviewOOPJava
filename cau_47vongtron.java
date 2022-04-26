
class tamgiac {
    private int x = 1;
    int y = 2;
}

public class cau_47vongtron {
    /**
     * @param args the command line arguments
     */
    class vongtron {
        private int x = 2;
        int xy = 23;
    }
    

    public static void main(String[] args) {
    //    cau_47vongtron obj = new cau_47vongtron();
    //    cau_47vongtron.vongtron vt = obj.new vongtron();
    //    System.out.println(vt.x);
    //    System.out.println(vt.xy);
    //    Ví dụ về lớp lồng nhau
        tamgiac tg = new tamgiac();
        System.out.println(tg.y);
        // System.out.println(tg.x); // Lỗi không có quyền truy cập
    }   

}
