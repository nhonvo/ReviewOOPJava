
import java.util.*;

public class cau_32_random {

    // Cach su dung ham ramdom
    public void randd() {
        Random rd = new Random();
        // int a = rd.nextInt() % 10;
        // System.out.println(Math.abs(a));
        int a = rd.nextInt(10);
        System.out.println(a);
        for (int i = 0; i < 10; i++) {
            System.out.println(rd.nextInt(10));

        }

    }

    public static void main(String argv[]) {
        int iRand;
        iRand = Math.random();
        System.out.println(iRand);
        // must be declared random object before call and use methods (nextInt, nextLong, ...)
        // cau_32_random r = new cau_32_random();
        // r.randd();
    }
}
