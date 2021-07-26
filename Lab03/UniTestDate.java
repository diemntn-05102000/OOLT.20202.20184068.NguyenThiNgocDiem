package Lab03;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UniTestDate {
    MyDate test = new MyDate();
    @Test

    void test1(){
        assertEquals(test.getDay(),11);
    }


}
