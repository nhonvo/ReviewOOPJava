public class exception_handing {
    public static void main(String[] args) {
        try {
            Float f1 = 3.0f;
            int x = f1.intValue(); // cast to int "vietsub ép sang kiểu int"
            byte b = f1.byteValue();
            double d = f1.doubleValue();
            String a = "3";
            char aa = '3';
            System.out.println(x + b + d);
            System.out.println(a);// chuỗi
            System.out.println(aa); // char kí tự
            System.out.println(a+ x + b + d );
            // vì kiểu char gặp double sẽ chuyển sang kiểu double theo bảng mã Ascii
            // output: 60 
            System.out.println(a+ x + b + d );
            // output: 3333
            System.out.println( x + b + d +a);
            // output: 9.03
            
        } catch (NumberFormatException e) {
            System.out.println("Bad number");
        }
    }
}
