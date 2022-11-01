
class dsnv {
    private static int n;
    public static final int MAX = 100;
    public static final int NHANVIENQL = 1;
    public static final int NHANVIENPV = 2;
    public static final int NHANVIENNC = 3;

    nvquanly ql[] = new nvquanly[MAX];
    nvphucvu pv[] = new nvphucvu[MAX];
    nvnghiencuu nc[] = new nvnghiencuu[MAX];

    public void inputds(nhanvien cn) {
        if (cn instanceof nvquanly) {
            ql[n] = new nvquanly();
            ql[n].input();
        } else if (cn instanceof nvphucvu) {
            pv[n] = new nvphucvu();
            pv[n].input();
        } else {
            nc[n] = new nvnghiencuu();
            nc[n].input();
        }
        n++;
    }

    public void outputds(int loai) {
        if (loai == NHANVIENQL) {
            for (nhanvien i : ql) {
                if (i instanceof nvquanly) {
                    System.out.println("\nNHANVIENQL: ");
                    i.output();
                }
            }
        } else if (loai == NHANVIENPV) {
            for (nhanvien i : pv) {
                if (i instanceof nvphucvu) {
                    System.out.println("\nNHANVIENPV: ");
                    i.output();

                }
            }
        } else {
            for (nhanvien i : nc) {
                if (i instanceof nvnghiencuu) {
                    System.out.println("\nNHANVIENNC: ");
                    i.output();

                }
            }
        }
    }
}
