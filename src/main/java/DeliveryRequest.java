/**
* Name: Sakhan Bhatia
* Date: 10/06/2020
* Description: Delivery Request class stores information of a delivery request.
*/


public class DeliveryRequest {

  private String deliveryName;
  private String deliveryAddress;
  private String deliveryContact;

  /**
   * Constructor to initialize the object with the values required.
   * @param deliveryName : to store the name of the recipient
   * @param deliveryAdd : to store the delivery address
   * @param deliveryContact : to store the contact number of recipient
   */
  public DeliveryRequest(String deliveryName, String deliveryAdd, String deliveryContact) {
    this.deliveryName = deliveryName;
    this.deliveryAddress = deliveryAdd;
    this.deliveryContact = deliveryContact;
  }

  /**
   * Getters and Setters.
   */
  public String getDeliveryName() {
    return deliveryName;
  }

  public void setDeliveryName(String deliveryName) {
    this.deliveryName = deliveryName;
  }

  public String getDeliveryAddress() {
    return deliveryAddress;
  }

  public void setDeliveryAddress(String deliveryAdd) {
    this.deliveryAddress = deliveryAdd;
  }

  public String getDeliveryContact() {
    return deliveryContact;
  }

  public void setDeliveryContact(String deliveryContact) {
    this.deliveryContact = deliveryContact;
  }
}