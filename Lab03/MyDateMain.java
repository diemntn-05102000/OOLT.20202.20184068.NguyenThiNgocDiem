package Lab03;

import java.text.ParseException;
import java.util.Scanner;

public class MyDateMain {
    static String Accept(){
        Scanner scanner = new Scanner(System.in);
        String time = scanner.nextLine();// đọc cả dòng
        return time;

    }

    public static void main(String[] args) throws ParseException {

        MyDate curDate = new MyDate();
        System.out.println("Current time: ");
        curDate.printf();

        MyDate IntDate = new MyDate(05,10,2000);
        System.out.println("Input integer date: ");
        IntDate.printf();


        System.out.println("Enter string date(MMM/dd/yyyy): ");
        String inputDate = Accept();
        MyDate stringDate = new MyDate(inputDate);
        stringDate.printf();



    }
}
