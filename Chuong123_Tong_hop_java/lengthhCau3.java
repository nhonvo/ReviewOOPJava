package Chuong123_Tong_hop_java;

public class lengthhCau3 {
    
    public static void main(String[] args) {
        String a[] = new String[5];
        System.out.println("hello");
        System.out.println(a.length);
        System.out.println(a[-5].length());
//  lỗi java.lang.ArrayIndexOutOfBoundsException: Index -5 out of bounds for length 5
// Lỗi ở trên xảy ra trước lỗi null pointer nên chọn lỗi này
    }
}
