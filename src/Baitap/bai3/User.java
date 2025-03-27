package Baitap.bai3;

import java.util.Optional;

public class User {
    private String name;
    private Optional<String> phoneNumber;

    public User(String name, Optional<String> phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Optional<String> getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Optional<String> phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void printInfo(){
        Optional<String> phoneNumber = getPhoneNumber();
        phoneNumber.ifPresent(user -> System.out.println("Tên: " + getName() + ", SĐT: " + phoneNumber.get()));
        System.out.println(phoneNumber.orElse("Tên: " + getName()+", SĐT: Không có"));
    }
}
