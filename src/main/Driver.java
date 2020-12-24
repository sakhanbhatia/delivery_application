/**
* Name: Sakhan Bhatia
* Date: 10/06/2020
* Description: Driver class to implement SubscriberBase and
* store driver info and delivery request made to driver.
*/


package main;

public class Driver implements SubscriberBase {
  private String name;
  private String contactNum;
  private String emailId;
  private DeliveryRequest deliveryRequest;

  /**
   * Constructor to initialize the object with the values required.
   * @param name to store the name of the driver
   * @param contactNum to store the contact number of driver
   * @param emailId to store the email id of the driver
   */
  public Driver(String name, String contactNum, String emailId) {
    this.name = name;
    this.contactNum = contactNum;
    this.emailId = emailId;
    this.deliveryRequest = null;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getContactNum() {
    return contactNum;
  }

  public void setContactNum(String contactNum) {
    this.contactNum = contactNum;
  }

  public String getEmailId() {
    return emailId;
  }

  public void setEmailId(String emailId) {
    this.emailId = emailId;
  }

  public DeliveryRequest getDeliveryRequest() {
    return deliveryRequest;
  }

  public void setDeliveryRequest(DeliveryRequest deliveryRequest) {
    this.deliveryRequest = deliveryRequest;
  }

  /*
   * Method to send delivery request details to the driver.
   */
  @Override
  public void update(DeliveryRequest newRequest) {
    this.setDeliveryRequest(newRequest);
    System.out.println("\nSending Delivery Request to " + this.name + " via "
        + this.contactNum + " and " + this.emailId);
    System.out.println("for Delivery Request:\n\t" + deliveryRequest.getDeliveryName()
        + "\n\t" + deliveryRequest.getDeliveryAddress() + "\n\t"
        + deliveryRequest.getDeliveryContact());
  }
}