package hust.soict.hedspi.test.utils;



import hust.soict.hedspi.aims.utils.DateUtils;
import hust.soict.hedspi.aims.utils.MyDate;
import org.junit.Test;

import java.text.ParseException;

import static org.junit.Assert.assertEquals;


public class UniTestDate {
    @Test
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
