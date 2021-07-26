package Lab04;

import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UniTestDate {
    @org.junit.jupiter.api.Test
   void testUnils() throws ParseException {
       DateUtils test = new DateUtils();
       MyDate d1 = new MyDate("Oct 05 2000");
       MyDate d2 = new MyDate("May 03 2001");
       MyDate d3 = new MyDate("Jan 15 1998");
       MyDate d4 = new MyDate("Oct 20 2020");
       MyDate[] arrayDate = {d1,d2,d3,d4};
       boolean valueTest = test.DateUtils(arrayDate);
       assertEquals(true, valueTest);
   }

}
