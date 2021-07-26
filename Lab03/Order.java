package Lab03;

public class Order {
   public static final int MAX_NUMBERS_ORDERED = 10;
   private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
   int numDvd = 0;
   public int qtyOrdered(){
       return numDvd;

   }
   public void addDigitalVideoDisc(DigitalVideoDisc disc){
       int n = qtyOrdered();
       if(n >= 10){
           System.out.println("The order is almost full");
       }else {
           itemsOrdered[n] = disc;
           System.out.println("The disc has been added: "+ disc.getTitle());
           numDvd++;
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
}
