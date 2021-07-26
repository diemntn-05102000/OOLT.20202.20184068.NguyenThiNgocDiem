package Lab04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Aims {
    public static void main(String[] args) {
        Lab04.Order anOrder = new Lab04.Order();
        Lab04.DigitalVideoDisc dvd1 = new Lab04.DigitalVideoDisc("The Lion King");
        dvd1.setCategory("Animation");
        dvd1.setCost(19.95f);
        dvd1.setDirector("Roger Allers");
        dvd1.setLength(87);
        anOrder.addDigitalVideoDisc(dvd1);

        Lab04.DigitalVideoDisc dvd2 = new Lab04.DigitalVideoDisc("Star Wars");
        dvd2.setCategory("Science fiction");
        dvd2.setCost(24.95f);
        dvd2.setDirector("George Lucas");
        dvd2.setLength(124);
        anOrder.addDigitalVideoDisc(dvd2);

        Lab04.DigitalVideoDisc dvd3 = new Lab04.DigitalVideoDisc("Aladdin");
        dvd3.setCategory("Animation");
        dvd3.setCost(18.99f);
        dvd3.setDirector("John Musker");
        dvd3.setLength(90);

//        anOrder.addDigitalVideoDisc(dvd3);
//        anOrder.addDigitalVideoDisc(dvd1,dvd2);
        anOrder.output();


    }


}
