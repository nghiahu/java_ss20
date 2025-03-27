package Baitap;

import java.util.ArrayList;
import java.util.List;

public class Bai1 {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);
        number.add(5);
        number.add(6);
        number.add(7);
        number.add(8);
        number.add(9);
        number.add(10);
        System.out.println("Các số chẵn trong mảng: ");
        number.stream().filter(num -> num % 2 == 0).forEach(System.out::println);
    }
}
