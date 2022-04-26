public class exception_handing {
    public static void main(String[] args) {
        try {
            Float f1 = 3.0f;
            int x = f1.intValue(); // cast to int
            byte b = f1.byteValue();
            double d = f1.doubleValue();
            System.out.println(x + b + d);
        } catch (NumberFormatException e) {
            System.out.println("Bad number");
        }
    }
}
