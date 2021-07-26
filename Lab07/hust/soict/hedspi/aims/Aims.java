package soict.hedspi.aims;

import soict.hedspi.aims.media.*;
import soict.hedspi.aims.order.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aims {
    public void showMenu() {
        System.out.println("Order Management Application: ");
        System.out.println("--------------------------------");
        System.out.println("1. Create new order");
        System.out.println("2. Add item to the order");
        System.out.println("3. Delete item by id");
        System.out.println("4. Display the items list of order");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");
    }
    public void menuAdđ() {
        System.out.println("The type of new item: ");
        System.out.println("--------------------------------");
        System.out.println("1.Book");
        System.out.println("2.CompactDisc");
        System.out.println("3.DigitalVideoDisc");
        System.out.println("0. Exit");
        System.out.println("Please choose a number: 0-1-2-3");
    }
    public void menuPlay() {
        System.out.println("1.Yes");
        System.out.println("2.No");
    }

    public static void main(String[] args) {
        int choice;
        Aims aims = new Aims();
        Order orderList = null;
        int checkCreatedOrder = 0;
        do {
            aims.showMenu();
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your choice");
            choice = input.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("Program end!!!");
                    break;
                case 1:
                    orderList = new Order();
                    System.out.println("Create new order successful");
                    checkCreatedOrder = 1;
                    break;
                case 2:
                    if (checkCreatedOrder == 0) {
                        System.out.println("You must create order");
                        break;
                    }
                    int c =0;
                    Scanner readTitle = new Scanner(System.in);
                    Scanner readCategory = new Scanner(System.in);
                    do {
                        aims.menuAdđ();
                        c = input.nextInt();
                        switch (c) {
                            case 0:
                                System.out.println("Addition end!!!");
                                break;
                            case 1:
                                System.out.println("Enter the title of book you want to add to order:");
                                String titleB = readTitle.nextLine();
                                System.out.println("Enter the  category you want to add to order:");
                                String categoryB = readCategory.nextLine();
                                Book itemtoBook;
                                if (categoryB.equals("")) {
                                    itemtoBook = new Book(titleB);
                                } else {
                                    itemtoBook = new Book(titleB, categoryB);
                                }
                                orderList.addMedia(itemtoBook);
                                break;
                            case 2:
                                System.out.println("Enter the title of CD you want to add to order:");
                                String titleCD = readTitle.nextLine();
                                System.out.println("Enter the  category you want to add to order:");
                                String categoryCD = readCategory.nextLine();
                                System.out.println("Enter number tracks: ");
                                int numberTrack = input.nextInt();
                                List<Track> tracks = new ArrayList<Track>();
                                for (int i = 0; i < numberTrack; i++) {
                                    System.out.println("Enter title of track: ");
                                    String titleTrack = readTitle.nextLine();
                                    System.out.println("Enter length");
                                    int lengthTrack = input.nextInt();
                                    Track track = new Track(titleTrack,lengthTrack);
                                    tracks.add(track);
                                }
                                CompactDisc itemtoCD;
                                if (categoryCD.equals("")) {
                                    itemtoCD = new CompactDisc(titleCD);
                                } else {
                                    itemtoCD = new CompactDisc(titleCD, categoryCD,tracks);
                                }
                                orderList.addMedia(itemtoCD);
                                System.out.println("Successful!!!");
                                System.out.println("Do you want play???");
                                aims.menuPlay();
                                System.out.println("Enter your choice: ");
                                int playCD = input.nextInt();
                                switch (playCD) {
                                    case 1:
                                        itemtoCD.play();
                                        break;
                                    case 2:
                                        break;
                                }

                                break;
                            case 3:

                                System.out.println("Enter the title of DVD you want to add to order:");
                                String titleDVD = readTitle.nextLine();
                                System.out.println("Enter the  category you want to add to order:");
                                String categoryDVD = readCategory.nextLine();
                                DigitalVideoDisc itemtoDVD;
                                if (categoryDVD.equals("")) {
                                    itemtoDVD = new DigitalVideoDisc(titleDVD);
                                } else {
                                    itemtoDVD = new DigitalVideoDisc(titleDVD, categoryDVD);
                                }
                                orderList.addMedia(itemtoDVD);
                                System.out.println("Successful!!!");
                                System.out.println("Do you want play???");
                                aims.menuPlay();
                                System.out.println("Enter your choice: ");
                                int playDVD = input.nextInt();
                                switch (playDVD) {
                                    case 1:
                                        itemtoDVD.play();
                                        break;
                                    case 2:
                                        break;
                                }

                                break;

                            default:
                                System.out.println("Your choice invalid.");
                                break;

                        }

                    }while (c != 0);
                    break;
                case 3:
                    Scanner idDelete = new Scanner(System.in);
                    System.out.println("Enter id you want to delete:");
                    int idD = idDelete.nextInt();
                    orderList.removeMedia(idD);
                    break;
                case 4:
                    orderList.showListMedia();
                    break;
                default:
                    System.out.println("Your choice invalid.");
                    break;
            }
        } while (choice != 0);
    }
}