package Chuong6_Exception_Handing_Ex;

public class throw_exception_ex {
    public static void validate(int age) {
        if (age < 18)
            throw new ArithmeticException("not valid");
        else {
            System.out.println("Welcome");
        }

    }

    public static void main(String[] args) {
        validate(13);

    }
}
