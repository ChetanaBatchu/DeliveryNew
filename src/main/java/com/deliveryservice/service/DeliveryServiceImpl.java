package com.deliveryservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deliveryservice.dao.DeliveryDAO;
import com.deliveryservice.entity.Delivery;
import com.deliveryservice.exceptions.DeliveryAlreadyExistsException;
import com.deliveryservice.exceptions.DeliveryNotFoundException;


@Service
public class DeliveryServiceImpl implements DeliveryService{
@Autowired
private DeliveryDAO deliveryDao;

@Override
public List<Delivery> getAllDeliveries() {
	return deliveryDao.findAll();

}

@Override
public void getDeliveryById(Integer deliveryId) throws DeliveryNotFoundException{
	if(deliveryDao.findById(deliveryId).isEmpty()) {
		throw new DeliveryNotFoundException();
	}
	else {
		@SuppressWarnings("unused")
		Optional<Delivery> delivery= Optional.empty();
	}
}
	
@Override
public Delivery addDelivery(Delivery delivery) throws DeliveryAlreadyExistsException{
	 if(deliveryDao.findById(delivery.getDeliveryId()).isEmpty()) {
         deliveryDao.save(delivery);
         return delivery;
     }
     else {
         throw new DeliveryAlreadyExistsException();
     }	
}

@Override
public Delivery updateDelivery(Delivery delivery) {
	deliveryDao.save(delivery);
	return delivery;
	
}

@SuppressWarnings("deprecation")
@Override
public void deleteDeliveryById(Integer deliveryId) {
	Delivery t =deliveryDao.getById(deliveryId);
	deliveryDao.delete(t);
	
}

}
