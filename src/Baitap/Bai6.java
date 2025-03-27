package Baitap;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Bai6 {
    public static void main(String[] args) {
        List<String> items = List.of("apple", "banana", "apple", "orange", "banana", "apple");
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String date = now.format(formatter);
        System.out.println("Thời điểm thực thi: " + date);
        Map<String, Long> itemMap = items.stream().collect(Collectors.groupingBy(item -> item, Collectors.counting()));
        for (Map.Entry<String, Long> entry : itemMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
