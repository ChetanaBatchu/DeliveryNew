package com.deliveryservice.dao;


	

	import org.springframework.data.jpa.repository.JpaRepository;

	import com.deliveryservice.entity.Delivery;

	public interface DeliveryDAO extends JpaRepository<Delivery, Integer> {

	}

