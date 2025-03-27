package Baitap.Bai10;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        User u1 = new User(1, "Quý", Optional.of("quy@example.com"));
        User u2 = new User(2, "Lan", Optional.ofNullable(null));
        User u3 = new User(3, "Huyền", Optional.of("huyen@example.com"));


        List<Task> tasks = List.of(
        new Task(1, "Viết báo cáo", u1, LocalDate.of(2025, 3, 20), false),
        new Task(2, "Thiết kế slide", u1, LocalDate.of(2025, 3, 25), true),
        new Task(3, "Họp nhóm", u2, LocalDate.of(2025, 3, 18), false),
        new Task(4, "Nộp tài liệu", u3, LocalDate.of(2025, 3, 22), true),
        new Task(5, "Chuẩn bị thuyết trình", u2, LocalDate.of(2025, 3, 19), true));

        System.out.println("== Công việc quá hạn chưa hoàn thành ==");
        tasks.stream().filter(task -> !task.isCompleted() && task.getDueDate().isBefore(LocalDate.parse("2025-03-23"))).forEach(task -> {
            System.out.println(task.getTitle() + "( Giao cho " +task.getAssingedTo().getName() + " ), hạn chót: " + task.getDueDate());
        });
        System.out.println(" ");
        System.out.print("Tổng số công việc đã hoàn thành: ");
        System.out.println(tasks.stream().filter(task -> task.isCompleted()).count());
        System.out.println(" ");
        System.out.println("== Thống kê công việc theo người dùng ==");
        Map<User, Long> mapTask = tasks.stream().collect(Collectors.groupingBy(Task::getAssingedTo, Collectors.counting()));

        for (Map.Entry<User, Long> entry : mapTask.entrySet()) {
            long countDue = tasks.stream().filter(task ->task.getAssingedTo().equals(entry.getKey()) && !task.isCompleted() && task.getDueDate().isBefore(LocalDate.parse("2025-03-23"))).count();
            System.out.println("Tên: " + entry.getKey().getName() +
                    " | Email: " + entry.getKey().prindEmail() + " | Tổng việc: " + entry.getValue() + " | Quá hạn: " + countDue);
        }
    }
}
