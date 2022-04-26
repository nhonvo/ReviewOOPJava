package Chuong123_Tong_hop_java;
class Nguoi {

    String ten = "Le Van Teo";
    int namsinh = 1987;

    public String toString() {
        return ten + " \t " + String.valueOf(namsinh);
    }
}
class Demo {
    public static void main(String[] argv) {
        Nguoi a = new Nguoi();
        System.out.print(a); // không cần gọi hàm toString() của  đối tượng a
        // output: Le Van Teo  1987
    }
}
