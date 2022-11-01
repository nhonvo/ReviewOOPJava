package Chuong6_Exception_Handing_Ex;

public class exception_handing_ex2 {
    public static void main(String[] args) {
        try {
            obsoleteMethod();
            System.out.print("A");
        } catch (Exception ex) {
            System.out.print("B");
        } finally {
            System.out.print("C");
        }
        System.out.print("D");
    }

    public static void obsoleteMethod() {
        throw new RuntimeException();
        // output: BCD
    }
}