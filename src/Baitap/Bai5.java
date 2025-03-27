package Baitap;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Bai5 {
    public static void main(String[] args) {
        List<Integer> normalList = List.of(10, 5, 8, 20, 7);
        List<Integer> singleElementList = List.of(10);
        List<Integer> allSameList= List.of(10, 10, 10);

        Stream<Integer> secondNum1 = normalList.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).limit(1);
        Stream<Integer> secondNum2 = singleElementList.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).limit(1);
        Stream<Integer> secondNum3 = allSameList.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).limit(1);

        Optional<Integer> num1 = secondNum1.findFirst();
        Optional<Integer> num2 = secondNum2.findFirst();
        Optional<Integer> num3 = secondNum3.findFirst();


        if(num1.isPresent()) {
            System.out.println("Số lớn thứ 2: " + num1.get());
        }else {
            System.out.println("Không tìm thấy số lớn thứ 2");
        }

        if(num2.isPresent()) {
            System.out.println("Số lớn thứ 2: " + num2);
        }else {
            System.out.println("Không tìm thấy số lớn thứ 2");
        }
        if(num3.isPresent()) {
            System.out.println("Số lớn thứ 2: " + num3);
        }else {
            System.out.println("Không tìm thấy số lớn thứ 2");
        }
    }
}
