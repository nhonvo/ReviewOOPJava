package Generic;
import java.util.ArrayList;

    public class Generic_2 {
    public static void main(String[] args) {
        ArrayList<String> userNames = new ArrayList<>();
        userNames.add("Tom");
        userNames.add("Jerry");
        userNames.add(new Integer(100));
        String userNames1 = userNames.get(0);
        System.out.println("userNames: " + userNames1);
        // output : Exception in thread "main" java.lang.Error: Unresolved compilation problem:
        // The method add(String) in the type ArrayList<String> is not applicable for
        // the arguments (Integer)
    }
}
