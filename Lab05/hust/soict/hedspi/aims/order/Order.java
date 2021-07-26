package hust.soict.hedspi.aims.order;


import hust.soict.hedspi.aims.disc.DigitalVideoDisc;
import hust.soict.hedspi.aims.utils.MyDate;

public class Order {
   public static final int MAX_NUMBERS_ORDERED = 2;
   private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
   private static int numDvd = 0;
   private MyDate dateOrdered = new MyDate();
   public int qtyOrdered(){
       return numDvd;

   }
   public void addDigitalVideoDisc(DigitalVideoDisc disc){
       int n = qtyOrdered();
       if(n >= MAX_NUMBERS_ORDERED){
           System.out.println("The order is almost full");
       }else {
           itemsOrdered[n] = disc;
           System.out.println("The disc has been added: "+ disc.getTitle());
           numDvd++;
       }
   }
    public void addDigitalVideoDisc(DigitalVideoDisc  ...dvdList){
       if(dvdList != null) {
           if (dvdList.length > 0) {
               for (DigitalVideoDisc dvd : dvdList
               ) {
                   int n = qtyOrdered();
                   if (n >= MAX_NUMBERS_ORDERED) {
                       System.out.println("The dvd " + dvd.getTitle() + " could not be added.");

                   } else {
                       itemsOrdered[n] = dvd;
                       System.out.println("The disc has been added: " + dvd.getTitle());
                       numDvd++;
                   }
               }
           }else System.out.println("Please, enter array!!!");
       }
    }
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2){
        int n = qtyOrdered();
       if (n >= MAX_NUMBERS_ORDERED){
            System.out.println("The dvd " + dvd1.getTitle() + " could not be added.");
            System.out.println("The dvd " + dvd2.getTitle() + " could not be added.");

        } else {
           if (n == MAX_NUMBERS_ORDERED-1) {
               itemsOrdered[n] = dvd1;
               System.out.println("The disc has been added: " + dvd1.getTitle());
               System.out.println("The dvd " + dvd2.getTitle() + " could not be added.");

               numDvd++;
           }else {
               itemsOrdered[n] = dvd1;
               System.out.println("The disc has been added: " + dvd1.getTitle());
               numDvd++;
               itemsOrdered[n] = dvd2;
               System.out.println("The disc has been added: " + dvd2.getTitle());
               numDvd++;

           }
        }
    }
    public boolean removeDigitalVideoDisc(DigitalVideoDisc disc){
       int check = 0;
       for (int i = 0; i < qtyOrdered(); i++) {
           if(itemsOrdered[i].getTitle() == disc.getTitle()){
               for(int j = i; j<=qtyOrdered()-2; j++)
                   itemsOrdered[j] = itemsOrdered[j+1];
               check = 1;
               break;
           }
       }
       if(check == 0)
           System.out.println("No find this DVD!!!");
       else {
           System.out.println("The disc has been removed: " + disc.getTitle());
           numDvd--;
       }
       return true;
   }
   public float totalCost() {
       float total = 0f;
       for (int i = 0; i < qtyOrdered(); i++) {
           total = total + itemsOrdered[i].getCost();

       }
       return total;
   }
   public void output(){
       System.out.print("Date: ");
       dateOrdered.printf();
       System.out.println("Ordered Items:");
       for (int i = 0; i < qtyOrdered(); i++) {
           System.out.println((i+1)+".DVD - "+ itemsOrdered[i].getTitle()+"-"+itemsOrdered[i].getCategory()+"-"+
                   itemsOrdered[i].getDirector()+"-"+itemsOrdered[i].getLength()+":"+itemsOrdered[i].getCost()+"$");


       }
       System.out.print("Total Cost is: ");
       System.out.println(totalCost());
   }
    public boolean search(String title){
       int check = 0;
        String titleLower = title.toLowerCase();
        String[] arrayString = titleLower.split(" ");
        if(qtyOrdered() == 0) {
            System.out.println("List DVD empty!!!");
            return false;
        }
        else {
            for (int i = 0; i < qtyOrdered(); i++) {
                String item = itemsOrdered[i].getTitle().toLowerCase();
                String[] arrayItem = item.split(" ");

                for (int j = 0; j < arrayString.length; j++) {

                    if (item.contains(arrayString[j])) {
                        check++;

                    }
                }

                if (check == arrayItem.length) {
                    System.out.println(itemsOrdered[i].getTitle());
                }
                check = 0;
            }
        }
        return true;

    }
}
