class father {
    void output() {
        System.out.println("my father");
    }
}

class child extends father {
    void output() {
        System.out.println("my child");
    }
}

public class Cau26_Father_son {
    public static void main(String[] args) {
        father f = new child();
        f.output();
        child c = new father(); // Lỗi lớp con không thể khai báo theo lớp cha
        c.output();
    }
}
