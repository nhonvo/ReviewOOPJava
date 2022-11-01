class dsnv {
    connguoi a[] = new connguoi[100];
    int n;

    dsnv() {
        int n = 0;
        for (int i = 0; i < n; i++) {
            a[i] = new connguoi();
        }
    }

    dsnv(int n) {
        for (int i = 0; i < n; i++) {
            a[i] = new connguoi();
            a[i] = this.a[i];
        }
    }

    dsnv(connguoi ds) {
        for (int i = 0; i < n; i++) {
            this.a[i] = new connguoi();
            this.a[i] = ds.a[i];
        }
    }

    public void EnterDsnv(connguoi cn) {
        if (cn instanceof hocvien) {
            a[n] = new hocvien();
            a[n].input();
        } else if (cn instanceof NVQuanly) {
            a[n] = new NVQuanly();
            a[n].input();
        } else if (cn instanceof GiaoVien) {
            a[n] = new GiaoVien();
            a[n].input();
        }
        n++;
    }

    public void PrintDsnv(int loai) {
        if (loai == 1) {
            for (int i = 0; i < n; i++) {
                if (a[i] instanceof GiaoVien) {
                    System.out.println("\nGiao vien: ");
                    a[i].output();
                }
            }
        } else if (loai == 2) {
            for (int i = 0; i < n; i++) {   
                if (a[i] instanceof NVQuanly) {
                    System.out.println("\nNVQuanly: ");
                    a[i].output();
                }
            }
        } else {
            for (int i = 0; i < n; i++) {
                if (a[i] instanceof hocvien) {
                    System.out.println("\nHoc vien: ");
                    a[i].output();
                }
            }
        }
    }
}
