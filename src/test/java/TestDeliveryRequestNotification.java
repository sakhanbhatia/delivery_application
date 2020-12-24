/**
* Name: Sakhan Bhatia
* Date: 10/06/2020
* Course: CS-665
* Assignment 2
* Description: To test the functionality of the program.
*/

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestDeliveryRequestNotification {
  @Test
  public void testRequestNotification() {

	Shop shop = new Shop();

    // Creating 2 drivers
    Driver d1 = new Driver("Ken Adams", "(567)890-1234", "kenadams@gmail.com");
    Driver d2 = new Driver("John Hancock", "(746)234-7689", "john_han@gmail.com");

    shop.registerDriver(d1);
    shop.registerDriver(d2);

    // We should get the correct driver details
    assertEquals(d1.getName(),"Ken Adams");
    assertEquals(d1.getContactNum(),"(567)890-1234");
    assertEquals(d1.getEmailId(),"kenadams@gmail.com");
    assertEquals(d2.getName(),"John Hancock");
    assertEquals(d2.getContactNum(),"(746)234-7689");
    assertEquals(d2.getEmailId(),"john_han@gmail.com");
    
    // New Delivery Request
    DeliveryRequest newDelReq = new DeliveryRequest(
            "Brad Pitt", "1010 Commonwealth Avenue", "(857)764-0123");
    

    assertEquals(newDelReq.getDeliveryName(),"Brad Pitt");
    assertEquals(newDelReq.getDeliveryAddress(),"1010 Commonwealth Avenue");
    assertEquals(newDelReq.getDeliveryContact(),"(857)764-0123");

    //Adding delivery request to shop
    shop.addDeliveryRequest(newDelReq);

    // Test if all driver got the delivery request
    assertEquals(d1.getDeliveryRequest(),newDelReq);
    assertEquals(d2.getDeliveryRequest(),newDelReq);

  }  
}
