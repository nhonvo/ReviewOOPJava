package Chuong123_Tong_hop_java;

import java.util.*;

public class cau_32_random {

    // Cach su dung ham ramdom
    public void randd() {
        Random rd = new Random();
        // int iRand = Math.random();// Lỗi sai cú pháp
        double iRand = Math.random();// fix
        int iRand1 = (int) Math.random();// fix

        int a = rd.nextInt(10);
        // int a = rd.nextInt() % 10;
        // Or iRand = (int) (Math.random() * 10);
        // output: 1 - 9
        System.out.println(a);
        for (int i = 0; i < 10; i++) {
            System.out.println(rd.nextInt(10));
            
        }
        
    }
    
    public static void main(String argv[]) {
        int a = -5;
        System.out.println(Math.abs(a)); //Test math library
        // must be declared random object before call and use methods (nextInt,
        // nextLong, ...)
        cau_32_random r = new cau_32_random();
        r.randd();
    }
}
