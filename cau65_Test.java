
class cau65_Test {
    static int j = 20;

    public void amethod(int x) {
        x = x * 2;
        j = j * 2;
    }

    public static void main(String[] argv) {
        int i = 10;
        cau65_Test p = new cau65_Test();

        p.amethod(i);
        // phương thức có modify là void không trả về => giá trị i không đổi
        System.out.println(i);
        System.out.println(j);
    }
}
