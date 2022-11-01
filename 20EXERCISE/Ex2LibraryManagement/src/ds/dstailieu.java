package ds;

import tailieu.*;

public class dstailieu {
    private static final int MAX = 100;
    static private int n;
    bao b = new bao();
    tailieu a[] = new tailieu[MAX];

    public dstailieu() {

    }

    dstailieu(int n) {
        for (int i = 0; i < n; i++) {
            a[i] = new tailieu();
            a[i] = this.a[i];
        }
    }

    dstailieu(dstailieu ds) {
        for (int i = 0; i < n; i++) {
            a[i] = new tailieu();
            a[i] = ds.a[i];
        }
    }

    public void nhaptailieu() {
        a[n] = new bao();
        a[n].Input();
        n++;
    }

    public void xuatdstailieu() {
        for (int i = 0; i < n; i++) {
            if (a[i] instanceof bao) {
                System.out.println(a[i].toString());
            }
        }
    }

    public void xoatailieu(String tl) {
        for (int i = 0; i < n; i++) {
            if (a[i] instanceof bao) {
                if (a[i].getMaTL().equals(tl)) {
                    // System.out.println(a[i].toString());
                    a[i] = a[i + 1];
                }
            }
        }
        n--;
    }

    public void timtailieu(String tl) {
        for (int i = 0; i < n; i++) {
            if (a[i] instanceof bao) {
                if (a[i].getMaTL().equals(tl)) {
                    System.out.println(a[i].toString());
                }
            }
        }
    }

    public void capnhattailieu(String tl) {
        for (int i = 0; i < n; i++) {
            if (a[i] instanceof bao) {
                if (a[i].getMaTL().equals(tl)) {
                    a[i].Input();
                }

            }
        }
    }
}
