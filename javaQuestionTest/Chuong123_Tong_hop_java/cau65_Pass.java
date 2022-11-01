package Chuong123_Tong_hop_java;

class cau65_Pass {
    static int j = 20;

    public void amethod(int x) {
        x = x * 2;
        j = j * 2;
    }

    public static void main(String[] argv) {
        int i = 10;
        cau65_Pass p = new cau65_Pass();

        p.amethod(i);
        // phương thức có modify là void không trả về => giá trị i không đổi
        System.out.println(i);
        System.out.println(j);
        // output: 10
        // output: 40
    }
}
