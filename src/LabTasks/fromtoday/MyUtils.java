package LabTasks.fromtoday;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

class MyUtils {

    public static void main(String[] args) {
        System.out.println(getDateAfterToday(-2,5,18));
    }
    public static String getDateAfterToday(int years, int months, int days) {
        // Write your code here
        LocalDate localDate = LocalDate.now();
        localDate = localDate.plusYears(years).plusMonths(months).plusDays(days);
        return localDate.toString();
    }
}
