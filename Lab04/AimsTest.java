package Lab04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AimsTest {
    Lab04.Order anO = new Order();
    Lab04.DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
    @Test
    void test2(){
        assertEquals(anO.removeDigitalVideoDisc(dvd1),true);
    }
}
