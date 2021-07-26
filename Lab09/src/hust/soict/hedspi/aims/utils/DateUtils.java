package soict.hedspi.aims.utils;



import java.text.ParseException;

public class DateUtils {
    public int compareDate(soict.hedspi.aims.utils.MyDate d1, MyDate d2) {
        int dayD1 = d1.getDay();
        int dayD2 = d2.getDay();
        int monthD1 = d1.getMonth();
        int monthD2 = d2.getMonth();
        int yearD1 = d1.getYear();
        int yearD2 = d2.getYear();
        if (yearD1 > yearD2) {
            return 1;
        } else if (yearD1 < yearD2) {
            return -1;
        } else {
            if (monthD1 > monthD1) {
                return 1;
            } else if (monthD1 < monthD2) {
                return -1;
            } else {
                if (dayD1 > dayD2) {
                    return 1;
                } else if (dayD1 < dayD2) {
                    return -1;
                }
            }
        }
        return 0;
    }
    public boolean DateUtils(MyDate[] date) {//min to max
        MyDate tmp = date[0];

        for (int i = 0; i < date.length - 1; i++) {
            for (int j = i + 1; j < date.length; j++) {
                if (compareDate(date[i], date[j]) > 0) {
                    tmp = date[j];
                    date[j] = date[i];
                    date[i] = tmp;
                }
            }
        }
        System.out.println("------------");
        for (int i = 0; i < date.length - 1; i++) {
            if (compareDate(date[i], date[i + 1]) == 1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws ParseException {
        DateUtils test = new DateUtils();
        MyDate d1 = new MyDate("Oct 05 2000");
        MyDate d2 = new MyDate("May 03 2001");
        MyDate d3 = new MyDate("Jan 15 1998");
        MyDate d4 = new MyDate("Oct 20 2020");
        MyDate[] arrayDate = {d1,d2,d3,d4};
        test.DateUtils(arrayDate);
        for (int i = 0; i < arrayDate.length; i++)
            arrayDate[i].printf();
    }
}
