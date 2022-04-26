/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author vothu
 */


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
            System.out.print(a);
        }
    }
