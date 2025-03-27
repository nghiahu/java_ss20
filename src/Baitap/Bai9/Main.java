package Baitap.Bai9;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Order> orders = List.of(
            new Order(1, "Quý", LocalDate.of(2025, 3, 20), Optional.ofNullable(LocalDate.of(2025, 3, 25))),
            new Order(2, "Lan", LocalDate.of(2025, 3, 21), Optional.ofNullable(null)),
            new Order(3, "Minh", LocalDate.of(2025, 3, 22), Optional.ofNullable(LocalDate.of(2025, 3, 23))),
            new Order(4, "Huyền", LocalDate.of(2025, 3, 23), Optional.ofNullable(null)),
            new Order(5, "Việt", LocalDate.of(2025, 3, 23), Optional.ofNullable(LocalDate.of(2025, 3, 30)))
        );
        System.out.println("== Danh sách đơn hàng đã giao ==");
        orders.stream().filter(order -> order.getDeliveryDate().isPresent()).forEach(order -> {
            order.toDisplayString();
        });
        System.out.println("== Danh sách đơn hàng chưa giao ==");
        orders.stream().filter(order -> order.getDeliveryDate().isEmpty()).forEach(order -> {
            order.toDisplayString();
        });
        System.out.println("== Số đơn hàng đã giao từ ngày 2025-03-17 đến 2025-03-23 ==");
        System.out.println(
                orders.stream().filter(order -> order.getDeliveryDate().isPresent() &&
                        order.getDeliveryDate().get().isAfter(LocalDate.parse("2025-03-16")) &&
                        order.getDeliveryDate().get().isBefore(LocalDate.parse("2025-03-24"))).count()
        );
    }
}
