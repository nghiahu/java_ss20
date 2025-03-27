package Baitap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào n: ");
        int n = scanner.nextInt();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            numbers.add(scanner.nextInt());
        }
        System.out.println("Các số lẻ: ");
        numbers.stream().filter(num -> num % 2 != 0).forEach(System.out::println);
        System.out.print("Tổng các số lẻ: ");
        System.out.println(numbers.stream().filter(num -> num % 2 != 0).reduce(0, Integer::sum));
    }
}
