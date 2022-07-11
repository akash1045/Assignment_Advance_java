package com.cdac.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cdac.component.CarPart;
import com.cdac.component.CarPartsInventory;

public class App {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("my-spring-confg.xml");
		CarPartsInventory inv = (CarPartsInventory) ctx.getBean("carParts1");
		CarPart cp = new CarPart();
		cp.setPartName("Seat Cover");
		cp.setCarModel("Maruti 800");
		cp.setPrice(500);
		cp.setQuantity(75);
		inv.addNewPart(cp);
	}

}
