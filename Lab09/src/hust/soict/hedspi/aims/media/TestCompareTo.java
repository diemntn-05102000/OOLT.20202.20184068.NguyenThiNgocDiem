package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestCompareTo {
    public static void main(String[] args) {
        List<Media> collection = new ArrayList<Media>();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", 87);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", 124);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", 90);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("My Queen", 110);
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("Totoro", 140);

        collection.add(dvd4);
        collection.add(dvd5);
        collection.add(dvd2);
        collection.add(dvd1);
        collection.add(dvd3);
        Iterator iterator = collection.iterator();
        System.out.println("--------------------------");
        System.out.println("The DVDs currently in the order are: ");
        while (iterator.hasNext()){
            System.out.println(((DigitalVideoDisc)iterator.next()).getTitle());
        }

        Collections.sort(collection);
        iterator = collection.iterator();
        System.out.println("--------------------------");
        System.out.println("The DVDs in the sorted order are: ");
        while (iterator.hasNext()){
            System.out.println(((DigitalVideoDisc)iterator.next()).getTitle());
        }
    }
}
