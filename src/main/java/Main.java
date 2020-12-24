/**
* Name: Sakhan Bhatia
* Date: 10/06/2020
* Description: Main class to run the program.
*/



public class Main {

  /**
   * A main method to run examples.
   *
   * @param args not used
   */
  public static void main(String[] args) {
    Shop shop = new Shop();
  
    // Creating 5 drivers
    Driver d1 = new Driver("Sakhan Bhatia", "(857)869-5793","sakhanb@bu.edu");
    Driver d2 = new Driver("Uditya Bhatnagar", "(746)234-7689","ud_bhgr@gmail.com");
    Driver d3 = new Driver("Hirendra Tandekar", "(814)685-7644","hir_tan@gmail.com");
    Driver d4 = new Driver("Hitesh Joish", "(644)989-3224","hit_joish@gmail.com");
    Driver d5 = new Driver("Kaustubh Khamgaonkar", "(418)234-9123","kaus_kham@gmail.com");
  
    shop.registerDriver(d1);
    shop.registerDriver(d2);
    shop.registerDriver(d3);
    shop.registerDriver(d4);
    shop.registerDriver(d5);

    DeliveryRequest newDelReq = new DeliveryRequest(
        "Pawan Vaswani", "1010 Commonwealth Avenue", "(857)764-0123");
    shop.addDeliveryRequest(newDelReq);
  }
}
