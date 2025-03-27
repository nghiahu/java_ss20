package optional;

import java.util.Optional;

public class Demo {
    public static void main(String[] args) {
        //1. Khởi tạo Optional
        Optional<String> optionalStr1 = Optional.of("KS23B");
        Optional<String> optionalStr2 = Optional.empty();
        Optional<String> optionalStr3 = Optional.ofNullable("PTIT");
        System.out.println("OPT1: " + optionalStr1.get());
        if (optionalStr2.isPresent()) {
            System.out.println("OPT2: " + optionalStr2.get());
        }
        System.out.println("OPT2: " + optionalStr2.orElse("Mặc định"));

        optionalStr3.ifPresent(System.out::println);
    }
}