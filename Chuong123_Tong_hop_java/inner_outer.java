package Chuong123_Tong_hop_java;


public class inner_outer {
    public static void main(String[] argv) {
        int i;
        int j;
        outer: for (i = 1; i < 3; i++) {
            System.out.println("i = "+i);
            inner: for (j = 1; j < 3; j++) { 
                System.out.println("j = "+ j);
                if (j == 2)
                    continue outer;
                    System.out.println("Value for i =" + i + " - Value for j =" + j);
            }
        }
    }
    // chạy từ trên xuống i = 1, j = 1 output 1 - 1,j = 2 thì tiếp vòng lặp ngoài i =2 j=1 output 2 - 1 j=2 i=3 vi phạm dừng vòng lặp ngoài
}
