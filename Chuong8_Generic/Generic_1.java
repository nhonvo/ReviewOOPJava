package Chuong8_Generic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Generic_1 {
    public static void main(String[] args) {
        Integer[] arr = { 1, 2, 3, 4, 5 };
        List<Integer> arrList = fromArrayToList(arr);
        System.out.println(arrList);
        // output: [1, 2, 3, 4, 5]
    }

    public static <T extends Number> List<T> fromArrayToList(T[] a) {
        return Arrays.stream(a).collect(Collectors.toList());
    }
}

