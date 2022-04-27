package DoAnJavaThamKhao;

// Đề 17: 1. Hãy xây dựng lớp DaGiac gồm có các thuộc tính - Số cạnh của đa giác
// - Mảng các số nguyên chứa kích thước các cạnh của đa giác Các phương thức: -
// Tính chu vi - In giá trị các cạnh của đa giác.
// 2. Xây dựng lớp TamGiac kế thừa từ lớp DaGiac, trong đó viết đè các hàm tính
// chu vi và xây dựng thêm phương thức tính diện tích tam giác 3. Xây dựng một
// ứng dụng Java để nhập vào một dãy gồm n tam giác rồi in ra màn hình các cạnh
// của các tam giác có diện tích lớn nhất.
import java.io.*;

class DaGiac {
    protected int soc;
    protected float mang[];

    DaGiac() {
    }

    DaGiac(int sc) {
        soc = sc;
        mang = new float[soc];
    }

    float chuvi() {
        float cv = 0;
        for (int i = 0; i < soc; i++)
            cv = cv + mang[i];
        return cv;
    }

    void in() {
        for (int i = 0; i < soc; i++)
            System.out.println("Canh thu " + (i + 1) + ": " + mang[i]);
    }
}

class TamGiac extends DaGiac {
    TamGiac() {
    }

    DaGiac tg = new DaGiac(3);

    float chuvi() {
        float cv = 0;
        for (int i = 0; i < tg.soc; i++)
            cv = cv + tg.mang[i];
        return cv;
    }

    double dtich() {
        double dt;
        float p;
        p = (float) (tg.mang[0] + tg.mang[1] + tg.mang[2]) / 2;
        dt = Math.sqrt(p * (p - tg.mang[0]) * (p - tg.mang[1]) * (p - tg.mang[2]));
        return dt;
    }
}

class UngDung {
    static String nhapgt() throws IOException {
        String str;
        DataInputStream stream = new DataInputStream(System.in);
        str = stream.readLine();
        return str;
    }

    static TamGiac nhaptg() throws IOException {
        TamGiac tgiac = new TamGiac();
        for (int i = 0; i < tgiac.tg.soc; i++) {
            System.out.print("Canh thu " + (i + 1) + ":");
            tgiac.tg.mang[i] = Float.valueOf(nhapgt()).floatValue();
        }
        return tgiac;
    }

    public static void main(String args[]) throws IOException {
        int n;
        System.out.print("Moi ban nhap so tam giac: ");
        n = Integer.valueOf(nhapgt()).intValue();
        TamGiac TG[] = new TamGiac[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Tam giac thu " + (i + 1) + ":");
            TG[i] = nhaptg();
        }
        for (int i = 0; i < n; i++)
            System.out.println("Dien tich tam giac thu " + (i + 1) + ":" + TG[i].dtich());
        double max = TG[0].dtich();
        int vt = 0;
        for (int i = 1; i < n; i++)
            if (max < TG[i].dtich()) {
                max = TG[i].dtich();
                vt = i;
            }
        System.out.println("Tam giac thu " + (vt + 1) + " co dien tich lon nhat");
        TG[vt].tg.in();
    }
}
