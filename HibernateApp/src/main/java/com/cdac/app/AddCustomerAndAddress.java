package com.cdac.app;

import java.util.List;

import com.cdac.dao.CustomerAddressDao;
import com.cdac.entity.Address;
import com.cdac.entity.Customer;

public class AddCustomerAndAddress {
     public static void main(String args[]) {
    	//CustomerAddressDao dao= new CustomerAddressDao();
    	//Customer c = new Customer();
    	// c.setName("Akash");
    	// c.setEmail("chavanak870@gmail.com");
    	 //c.setName("Ajinkya");
    	// c.setEmail("Ajinkya@gmail.com");
    	
    	 
    	 //Address a=new Address();
    	 //a.setPincode(400001);
    	 //a.setCity("Satara");
    	 //a.setState("Maharashtra");
    	//a.setPincode(400002);
    	//a.setCity("Pune");
    	//a.setState("Maharastra");
    
    	
    	 //c.setAddress(a);
    	 //dao.add(c);
    	
    
    	 CustomerAddressDao dao= new CustomerAddressDao();
    	 Address a= new Address();
    	 Customer c = dao.fetchCustomer(1);
    	  c.setName("Ajay");
    	  dao.update(c);
    	 //CustomerAddressDao dao= new CustomerAddressDao();
    	 /*List<Customer> list=dao.fetchCustomersByCity("Pune");
    	 for(Customer c : list)
 			System.out.println(c.getId() + " " + c.getName() + " " + c.getEmail());*/
    	 //List<Customer> list = dao.fetchCustomerByEmail("gmail");
    	 //List<Customer> list=dao.fetchCustomerByPincode(400002);
    	 //for(Customer c : list)
    		 //System.out.println(c.getId() + " " + c.getName() + " " + c.getEmail());
    	 
    	 
     }
}
