## lớp nội và lớp ngoại
```java
[]: # Language: java
[]: # Path: Lopnoi_lopNgoai_lopthanhphan.java

class Outer_Demo {
   int num;
   
   // inner class
   private class Inner_Demo {
      public void print() {
         System.out.println("This is an inner class");
      }
   }
   
   // Accessing he inner class from the method within
   void display_Inner() {
      Inner_Demo inner = new Inner_Demo();
      inner.print();
   }
}
   
public class My_class {

   public static void main(String args[]) {
      // Instantiating the outer class 
      Outer_Demo outer = new Outer_Demo();
      
      // Accessing the display_Inner() method.
      outer.display_Inner();
   }
}

```
## lớp thành phần
```java
// tạo class phòng ban
class Department {
   String name;
   String location;
   
   }
}
// tạo class nhân viên
class Employee {
    String name;
    int age;
    String designation;
    Department dept;
    Employee(String name, int age, String designation, Department dept) {
       this.name = name;
       this.age = age;
       this.designation = designation;
       dept = new Department();
    }

}
```