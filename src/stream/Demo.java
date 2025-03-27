package stream;

import entity.Student;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Student student1 = new Student("SV001", "Nguyễn Văn A", 20);
        Student student2 = new Student("SV002", "Nguyễn Văn B", 22);
        Student student3 = new Student("SV003", "Nguyễn Văn C", 18);
        Student student4 = new Student("SV004", "Nguyễn Văn D", 22);
        Student student5 = new Student("SV005", "Nguyễn Văn E", 22);
        List<Student> listStudents = new ArrayList<>();
        listStudents.add(student1);
        listStudents.add(student2);
        listStudents.add(student3);
        listStudents.add(student4);
        listStudents.add(student5);
        /*
         * B1: Collection --> stream
         * B2: Thao tác trung gian: xử lý dữ liệu
         * B3: Thao tác đầu cuối: In hoặc luu dữ liệu
         * */
        //1. In ra các sinh viên có tuổi lớn hơn 20
        System.out.println("Thông tin các sinh viên có tuổi lớn hơn 20:");
        listStudents.stream().filter(student -> student.getAge() > 20).forEach(System.out::println);
        //2. In thông tin các sinh viên từ thứ 1 đến thứ 3
        System.out.println("Thông tin sinh viên 1 - sinh viên 3:");
        listStudents.stream().skip(1).limit(3).forEach(System.out::println);
        //4. In số tuổi của các sinh viên x2
        System.out.println("Tuổi sinh viên x2:");
        listStudents.stream().map(student -> student.getAge() * 2).forEach(System.out::println);
        //5. In thông tin sinh viên sắp xếp theo tuổi tăng dần
        System.out.println("Thông tin sinh viên sắp xếp theo tuổi tăng dần:");
        listStudents.stream().sorted(Comparator.comparing(Student::getAge)).forEach(System.out::println);
        //6. In thông tin sinh viên sắp xếp theo tên giảm dần
        System.out.println("THông tin sinh viên sắp xếp theo tên giảm dần:");
        listStudents.stream().sorted(Comparator.comparing(Student::getStudentName).reversed()).forEach(System.out::println);
        //7. In thoong tin sinh viên sắp xếp theo tuổi tăng dần, bằng tuổi thì sắp xếp theo tên giảm dần
        System.out.println("Sắp xếp sinh viên theo tuổi tăng dần, tên giảm dần:");
        listStudents.stream().sorted(Comparator.comparing(Student::getAge).thenComparing(Comparator.comparing(Student::getStudentName).reversed())).forEach(System.out::println);
        //8. Lưu thông tin các sinh viên có tuổi lớn hơn 20
        List<Student> list20 = listStudents.stream().filter(student -> student.getAge() > 20).toList();
        System.out.println("Thông tin sinh viên trong list20: ");
        list20.forEach(System.out::println);
        //9. Kiểm tra trong listStudents có sinh viên tên là Nguyễn Văn A không
        System.out.println("Kết quả tìm kiếm sinh viên Nguyễn Văn A: " + listStudents.stream().anyMatch(student -> student.getStudentName().equals("Nguyễn Văn A")));
        //10. Tính số lượng sinh viên có tuổi lớn hơn 20
        System.out.println("Số lượng SV lớn hơn 20: " + listStudents.stream().filter(student -> student.getAge() > 20).count());
        //11. In ra tuổi lớn nhất của sinh viên
        System.out.println("Tuổi lớn nhất: " + listStudents.stream().max(Comparator.comparing(Student::getAge)));
        //12. Thống kê các số liệu về tuôi sinh viên: min, max, sum, avg
        IntSummaryStatistics ageStatitic = listStudents.stream().mapToInt(Student::getAge).summaryStatistics();
        System.out.println("Tổng tuổi: " + ageStatitic.getSum());
        System.out.println("Tuổi trung bình: " + ageStatitic.getAverage());
        //13. Sử dụng reduce tính tổng tuổi sinh viên
        System.out.println("Tổng tuổi sinh viên: " + listStudents.stream().mapToInt(Student::getAge).reduce(0, Integer::sum));

    }
}