package soict.hedspi.aims.order;


import soict.hedspi.aims.media.Media;
import soict.hedspi.aims.utils.MyDate;

import java.util.ArrayList;
import java.util.List;

public class Order {
   private static int numMedia = 0;
   private MyDate dateOrdered = new MyDate();
   private List<Media> itemsOrdered = new ArrayList<Media>();

    public void addMedia(Media mediaAdd) {
        itemsOrdered.add(mediaAdd);
        System.out.println("Added this media to list success!!!");
        numMedia++;
    }


    public void removeMedia(int id) {
        int exit = 0;
        int index = 0;
        for (Media media : itemsOrdered) {
            if(id == media.getId()) {
                exit = 1;
                break;
            }
             index ++;
        }
        if(exit == 0 )
            System.out.println("Invalid number");
        else {
            numMedia--;
            itemsOrdered.remove(index);
            System.out.println("Delete success!!!");

        }
    }

    public void showListMedia() {

        System.out.println("Show list media:");
        System.out.printf("%-5s %-30s %-20s\n", "ID","Title", "Category");
        for (int i = 0; i < numMedia; i++) {
            System.out.printf("%-5d %-30s %-20s\n", i + 1, itemsOrdered.get(i).getTitle(), itemsOrdered.get(i).getCategory());
        }
    }
    public float totalCost() {
        float total = 0;
        for (Media media : itemsOrdered) {
            total += media.getCost();
        }
        return total;
    }
}

