package Chuong6_Exception_Handing_Ex;

class MyException0 extends Exception {
}

class MyException1 extends MyException0 {
}

public class exception_handing_ex3 {
    public static void main(String args[]) {
        try {
            throw new MyException1();
            // throw new MyException0();
            // throw new Exception();

        } catch (MyException0 ex0) {
            System.out.println("MyException0 caught");

        } catch (Exception ex) {
            System.out.println("Exception caught");
            
        }
    }

    // output: MyException0 caught
}//