/**
* Name: Sakhan Bhatia
* Date: 10/06/2020
* Description: An interface for Publisher.
*/


public interface PublisherBase {

  void registerDriver(SubscriberBase b);

  void removeDriver(SubscriberBase b);

  void notifyDriver(DeliveryRequest dr);

}
