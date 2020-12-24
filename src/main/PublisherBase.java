/**
* Name: Sakhan Bhatia
* Date: 10/06/2020
* Description: An interface for Publisher.
*/

package main;

public interface PublisherBase {

  void registerDriver(SubscriberBase b);

  void removeDriver(SubscriberBase b);

  void notifyDriver(DeliveryRequest dr);

}
