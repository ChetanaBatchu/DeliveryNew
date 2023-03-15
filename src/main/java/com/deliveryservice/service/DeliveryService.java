package com.deliveryservice.service;
 
import java.util.List;
import com.deliveryservice.entity.Delivery;
import com.deliveryservice.exceptions.DeliveryAlreadyExistsException;
import com.deliveryservice.exceptions.DeliveryNotFoundException;

public interface DeliveryService {
	public List<Delivery> getAllDeliveries();
	public void getDeliveryById(Integer deliveryId) throws DeliveryNotFoundException;
	public Delivery addDelivery(Delivery delivery) throws DeliveryAlreadyExistsException;
	public Delivery updateDelivery(Delivery delivery);
	public void deleteDeliveryById(Integer deliveryId);
}
