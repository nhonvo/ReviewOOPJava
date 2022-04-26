package Chuong8_Generic;

import java.util.ArrayList;
import java.util.Iterator;

public class TestGenerics1 {
    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Java");
        list.add("PHP");
        list.add("C++");
        // list.add(32);//compile time error
        // show list
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}