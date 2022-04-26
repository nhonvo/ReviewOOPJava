package Chuong123_Tong_hop_java;

public class cau64 {
    public static void main(String[] args) {
        String s;
        cau64 c = new cau64[];
        String a = new String("ello");
        c.method(s);
    }

    public void method(String s) {
        char c = 'H';
        c += s;
        System.out.println(c);
        //output: Error: incompatible types: String cannot be converted to char 
        // Lỗi biên dịch
    }
}
