package de123;
public class cau50_box {
    int x, y, z;

    cau50_box() {
    }

    cau50_box(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    cau50_box(cau50_box xx) {
        x = xx.x;
        y = xx.y;
        z = xx.z;
    }

    void output() {
        System.out.println(x + " " + y + " " + z);
    }

    public static void main(String[] args) {
        cau50_box a = new cau50_box();
        a.output();
        cau50_box b = new cau50_box(1, 2, 3);
        b.output();
        cau50_box c = new cau50_box(b);
        c.output();
    }
}
