package de5;

public class cau44 {
    abstract class Employee {
        public Employee() {
        }

        int BasicSalary = 100;
        String name;

        abstract void OutSalary();

    }
    abstract class Manager extends Employee {
        public Manager(String name, int salary) {
            this.name = name;
            this.BasicSalary = salary;
        }

        int Bonus = 100;

        abstract void OutSalary();
    }
    public static void main(String[] args) {
        Employee m = new Manager("Le Thi Hoa", 200);
        //Lỗi Lớp manager chưa được hiện thực
        m.OutSalary();
    }
}
