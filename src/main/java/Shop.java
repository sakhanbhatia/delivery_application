/**
* Name: Sakhan Bhatia
* Date: 10/06/2020
* Description: Shop class to implement PublisherBase that store list of driver
* and delivery requests made to the shop, sends notification to all drivers on
* addition of new delivery request.
*/


import java.util.ArrayList;
import java.util.List;

public class Shop implements PublisherBase {

  private List<SubscriberBase> drivers = new ArrayList<SubscriberBase>();
  private List<DeliveryRequest> deliveryRequest = new ArrayList<>();

  public void registerDriver(SubscriberBase b) {
    drivers.add(b);
  }

  public void removeDriver(SubscriberBase b) {
    drivers.remove(b);
  }

  /*
   * Notify the drivers about the delivery request
   */
  @Override
  public void notifyDriver(DeliveryRequest newRequest) {
    for (SubscriberBase driver : drivers) {
      driver.update(newRequest);
    }
  }

  /**
   * To add a new delivery request to the array list.
   * @param newRequest : DeliveryRequest object to add to the list.
   */
  public void addDeliveryRequest(DeliveryRequest newRequest) {
    deliveryRequest.add(newRequest);
    notifyDriver(newRequest);
  }

  /**
   * To remove a delivery request from the array list.
   * @param requestToDelete : the Delivery Request object to remove from the list.
   */
  public void remDeliveryRequest(DeliveryRequest requestToDelete) {
    deliveryRequest.remove(requestToDelete);
  }
}