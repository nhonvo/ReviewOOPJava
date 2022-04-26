package GENERIC;

public class TestGenerics4 {
    public static <E> void printArray(E[] elements) {
        for (E element : elements) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Integer[] intArray = { 10, 20, 30, 40, 50 };
        Character[] charArray = { 'J', 'A', 'V', 'A' };
        System.out.print("In mảng số nguyên: ");
        printArray(intArray);
        System.out.print("In mảng ký tự: ");
        printArray(charArray);
    }
}