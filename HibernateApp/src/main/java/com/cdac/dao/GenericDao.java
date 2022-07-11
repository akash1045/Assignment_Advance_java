package com.cdac.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class GenericDao {
   public void save(Object obj) {
	   
	   EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
	   try {
	   EntityManager em = emf.createEntityManager();
	   EntityTransaction tx = em.getTransaction();
	   tx.begin();
	   em.merge(obj);
	   tx.commit();
   }
	   finally {
			emf.close();
		}
   }
   
   public Object fetchById(Class clazz,Object pk) {
	   EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
	   try {
		   EntityManager em = emf.createEntityManager();
			EntityTransaction tx = em.getTransaction();
			tx.begin();
			Object obj = em.find(clazz, pk);
			return obj;
	   }
	   finally {
			emf.close();
		}
   }
}
