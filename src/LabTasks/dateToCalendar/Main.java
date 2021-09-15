package LabTasks.dateToCalendar;

public class Main {


    public static Calendar convertDateToCalendar(Date date) {

        // Write your code here
        TimeZone.setDefault( TimeZone.getTimeZone("UTC"));
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        return calendar;

    }
}
