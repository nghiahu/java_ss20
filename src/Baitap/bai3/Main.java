package Baitap.bai3;

import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<User> users = List.of(
            new User("Quý", Optional.of("0987654321")),
            new User("Lan", Optional.ofNullable(null)),
            new User("Minh", Optional.of("0933222111")),
            new User("Huyền", Optional.ofNullable(null))
        );
        users.forEach(user -> {user.printInfo();});
    }
}
