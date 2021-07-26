package hust.soict.hedspi.aims.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class MyDate {
    private int day;
    private int month;
    private int year;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        String month = "" + getMonth();
        String year = "" + getYear();
        String date = month + "/" + "1/" + year;
        LocalDate convertedDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("M/d/yyyy"));
        convertedDate = convertedDate.withDayOfMonth(
                convertedDate.getMonth().length(convertedDate.isLeapYear()));
        int lastDayInMonth = convertedDate.getDayOfMonth();
        if (day < 1 || day > lastDayInMonth) {
            throw new ArithmeticException("Day in valid.");
        }
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12) {
            throw new ArithmeticException("Month invalid. Month must in range 1 to 12");
        }
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 0) {
            throw new ArithmeticException("Year invalid. Year must great then 0");
        }
        this.year = year;
    }

    public MyDate(){
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);

        // Trả về giá trị từ 0 - 11
        int month = c.get(Calendar.MONTH) +1;
        int day = c.get(Calendar.DAY_OF_MONTH);
        setMonth(month);
        setYear(year);
        setDay(day);
    }

    public MyDate(int day, int month, int year) {
        setMonth(month);
        setYear(year);
        setDay(day);
    }
    public MyDate(String time) throws ParseException { // mmm/dd/yyyy
        SimpleDateFormat formatter2 = new SimpleDateFormat("MMM dd yyyy");
//      format date2 from string
        Date date2 = formatter2.parse(time);
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
//        using Calendar to convert
        calendar.setTime(date2);
//        printf year - month- and day
        int year = calendar.get(Calendar.YEAR);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        String monthFromInput = new SimpleDateFormat("M").format(calendar.getTime());
        int month = Integer.parseInt(monthFromInput);
        setYear(year);
        setMonth(month);
        setDay(day);
    }

    public void printf() {
        int day = getDay();
        int month = getMonth();
        int year = getYear();
        System.out.print(day);
        System.out.print("-" + month);
        System.out.println("-" + year);
    }

}
