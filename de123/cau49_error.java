package de123;

public class cau49_error {

    // private int i;
    private static int i;

    public static void main(String argv[]) {
        cau49_error s = new cau49_error();
        // s.amethod();
        cau49_error.amethod();// gọi hàm bằng tên class chính

    }//End of main

    public static void amethod() {
        //    biến i phải đổi thành static cho phép luôn chạy khi thực thi chương trình
       System.out.println(i);
    //    output: 0
    }//end of amethod
}//End of class

