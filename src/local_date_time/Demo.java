
package local_date_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class Demo {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println("Ngày hiện tại: " + now);
        LocalDate bod = LocalDate.of(1984, 4, 23);
        System.out.println("Ngày sinh nhật:" + bod);
        LocalTime nowTime = LocalTime.now();
        System.out.println("Giờ hiện tại: " + nowTime);
        LocalTime bodTime = LocalTime.of(5, 30, 50);
        System.out.println("Giờ sinh: " + bodTime);
        LocalDateTime nowDateTime = LocalDateTime.now();
        System.out.println("Ngày giò hiện tại: " + nowDateTime);
        Period period = Period.between(bod, now);
        System.out.println("Tuổi của tôi hiện tại: "+period.getYears());
    }
}
