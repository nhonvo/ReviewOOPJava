import fraction.PhanSo;

public class App {

    public static void main(String[] args) {
        PhanSo a = new PhanSo();
        PhanSo b = new PhanSo();
        System.out.println("Nhap phan so a: ");
        a.Input();
        System.out.println("Nhap phan so b: ");
        b.Input();
        System.out.println("Xuat phan so:");
        a.output();
        b.output();
        System.out.println("Tinh uoc chung ps A:" + a.UCLN(a.getTuSo(),a.getMauSo()));
        System.out.println("Tinh uoc chung ps B:" + b.UCLN(b.getTuSo(),b.getMauSo()));
        a.rutgon();        
        b.rutgon();
        System.out.println("cong 2 phan so a va b: " + a.congPS(a, b));
        System.out.println("tru 2 phan so a va b: " + a.truPS(a, b));
        System.out.println("nhan 2 phan so a va b: " + a.nhanPS(a, b));
        System.out.println("chia 2 phan so a va b: " + a.chiaPS(a, b));

    }
}
