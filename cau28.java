public class cau28 {
    public static void main(String[] args) {
        boolean x = true, y = false;
        System.out.println(x && y );
        // output: false 
        System.out.println(x && y || !x); 
        // output : false
    }
}
