package Chuong123_Tong_hop_java;
public class cau_66 {
     public static void main(String[] argv) {
        cau_66 l = new cau_66();
        l.amethod();
    }

    public void amethod() {
        int ia[] = new int[4];
        // Start For loop {
        // for (int i = 0; i < ia.length(); i++) { length is method so we can't declare length() different
        // for (int i = 0; i < 4; i++) { it looks not good
        for (int i = 0; i < ia.length; i++) {
            ia[i] = i;
            System.out.println(ia[i]);
        }
    }
}