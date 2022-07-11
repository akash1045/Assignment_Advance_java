package com.cdac.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.cdac.entity.Address;
import com.cdac.entity.Customer;

public class CustomerAddressDao {
   public void add(Customer cust) {
	   EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
        em.persist(cust); 
		
		tx.commit();
		emf.close();
   }
   public void add(Address addr) {
	   EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
        em.persist(addr); 
		
		tx.commit();
		emf.close();
   }
   
  
  public void update(Customer cust) {
	  EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.merge(cust);
		tx.commit();
		emf.close();
  }
  
  
  public Customer fetchCustomer(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();

		//find method generates select query where pk = ?
		Customer emp = em.find(Customer.class, id);
		
		emf.close();

		return emp;	
	}
  
  public List<Customer> fetchCustomersByCity(String city) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();

		Query q = em.createQuery("select c from Customer c join c.address a where a.city = :ct");
		q.setParameter("ct", city);
		List<Customer> list = q.getResultList();
		
		emf.close();

		return list;
	}
  
  public List<Customer> fetchCustomerByEmail(String Domain){
	  EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		Query q=em.createQuery("select c from Customer c where c.email like :kr");
		q.setParameter("kr","%"+Domain+"%");
		List<Customer> list = q.getResultList();
		emf.close();

		return list;
		
  }
  
  public List<Customer> fetchCustomerByPincode(int Pincode){
	  EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
			EntityManager em = emf.createEntityManager();
			Query q=em.createQuery("select c from Customer c join c.address a where a.pincode = :pn");
			q.setParameter("pn", Pincode);
			List<Customer> list = q.getResultList();
			emf.close();

			return list;
  }

}
