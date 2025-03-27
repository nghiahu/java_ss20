package Baitap.Bai4;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    private String name;
    private LocalDate birthDate;

    public Person(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
    public int getAge() {
        LocalDate currentYear = LocalDate.now();
        return Period.between(getBirthDate(),currentYear).getYears();
    }
    public void printInfo(){
        System.out.println("Tên: " + getName() + ", Ngày sinh: " + getBirthDate() + ", Tuổi: " + getAge());
    }
}
