public class exception_handing_ex4 {
    public static void main(String[] args) {
        try {
            errorMethod();
            System.out.print("A");
        } catch (Exception ex) {
            System.out.print("B");
        } finally {
            System.out.print("C");
        }
        System.out.print("D");
    }

    public static void errorMethod() {
        throw new Error();
    }
}