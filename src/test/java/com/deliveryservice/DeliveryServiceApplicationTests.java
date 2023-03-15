package com.deliveryservice;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import com.deliveryservice.dao.DeliveryDAO;
import com.deliveryservice.entity.Delivery;


@SpringBootTest
class DeliveryServiceApplicationTests {

	@Autowired
	private DeliveryDAO deliveryDao;
	
	@SuppressWarnings("removal")
	@Test
	 void addDelivery() throws Exception {
		new Delivery(1, 789765421, "Bangalore", "Delivering");
		Assert.notNull(deliveryDao);
		
	}
//	@SuppressWarnings("removal")
//	@Test
//	void addDelivery() throws Exception {
//	new Delivery(1, 789765421, "Bangalore", "Delivering");
////	Assert.notNull(deliveryDao.findById(1).get());;
// }
//	
//	@Test
//void getDeliveryById(){
//	Delivery delivery = deliveryDao.findById(3).get();
//	 Assertions.assertThat(delivery.getDeliveryId()).isEqualTo(3);
// }
//@Test
// @Rollback(value = false)
// void updateDelivery(){
//	Delivery delivery = deliveryDao.findById(3).get();
//	 delivery.setOrderStatus("delivered");
//	 Delivery updateDelivery =deliveryDao.save(delivery);
//	Assertions.assertThat(updateDelivery.getOrderStatus()).isEqualTo("delivered");
//}
}
