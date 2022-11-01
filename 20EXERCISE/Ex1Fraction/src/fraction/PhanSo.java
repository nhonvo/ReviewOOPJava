package fraction;

import java.util.Scanner;

public class PhanSo {
    private int tuSo;
    private int mauSo;

    Scanner scanner = new Scanner(System.in);
    public PhanSo(){
        tuSo = 0;
        mauSo = 0;
    }
    public PhanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }
    public PhanSo(PhanSo ps){
        ps.tuSo = tuSo;
        ps.mauSo = mauSo;
    }
    public void Input(){
        tuSo = scanner.nextInt();
        mauSo = scanner.nextInt();
    }

    public void output() {
        System.out.println(getTuSo() + "/" + getMauSo());
    }

    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }

    public int UCLN(int tuSo, int mauSo) {
        int psa = tuSo;
        int psb = mauSo;
        while (psa != psb) {
            if (psa > psb) {
                psa -= psb;
            } else {
                psb -= psa;
            }
        }
        return psa;

    }
    public void rutgon(){
        int c = this.UCLN(tuSo,mauSo);
        tuSo = tuSo/c;
        mauSo = mauSo/c;
        System.out.println("Rut gon: "+tuSo+" "+mauSo);
        
    }
    

    // cong ps
    public float congPS(PhanSo a, PhanSo b) {
        return a.getMauSo() == b.getMauSo() ? (float) (a.getTuSo() + b.getTuSo()) / a.getMauSo()
                : (float) ((a.getTuSo() * b.getMauSo()) + (a.getMauSo() * b.getTuSo())) / (a.getMauSo() + b.getMauSo());
    }

    // tru ps
    public float truPS(PhanSo a, PhanSo b) {
        return a.getMauSo() == b.getMauSo() ? (float) (a.getTuSo() - b.getTuSo()) / a.getMauSo()
                : (float) ((a.getTuSo() * b.getMauSo()) - (a.getMauSo() * b.getTuSo())) / (a.getMauSo() + b.getMauSo());
    }

    // nhan ps
    public float nhanPS(PhanSo a, PhanSo b) {
        return (float) (a.getTuSo() * b.getTuSo()) / (a.getMauSo() * b.getMauSo());
    }

    // chia ps
    public float chiaPS(PhanSo a, PhanSo b) {
        return (float) (a.getTuSo() * b.getMauSo()) / (a.getMauSo() * b.getTuSo());
    }

}
