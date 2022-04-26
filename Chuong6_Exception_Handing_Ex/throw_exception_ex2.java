import java.io.IOException;

class throw_exception_ex2 {

    void m() throws IOException {
        throw new IOException("device error");// checked exception
    }

    void n() throws IOException {
        m();
    }

    void p() {
        try {
            n();
        } catch (Exception e) {
            System.out.println("exception handled");
        }
    }

    public static void main(String args[]) {
        throw_exception_ex2 obj = new throw_exception_ex2();
        obj.p();
        System.out.println("normal flow...");
    }

}