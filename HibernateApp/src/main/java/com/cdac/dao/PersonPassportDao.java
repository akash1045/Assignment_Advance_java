package com.cdac.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.cdac.entity.Passport;
import com.cdac.entity.Person;


public class PersonPassportDao {
    public void add(Person person) {
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(person);
		tx.commit();
		emf.close();
    }
    

	public Person fetchPersonByPassportNo(int PassportNo) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();

		Query q = em.createQuery("select p from Person p join p.passport ps where ps.passportNO = :pno");
		q.setParameter("pno", PassportNo);
		Person p = (Person) q.getSingleResult();
		emf.close();

		return p;
	}
	
	public List<Person> fetchPersonByissueDate(int month) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		Query q=em.createQuery("select p from Person p join p.passport ps where month(ps.issueDate) = :id");
		q.setParameter("id",month);
		List<Person> list = q.getResultList();
		emf.close();

		return list;
		
	}
	
	public Passport fetchPassportByName(String name){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		Query q=em.createQuery("select p from Passport p join p.person pe where pe.name = : na");
		q.setParameter("na",name);
		Passport ps =(Passport) q.getSingleResult();
		emf.close();

		return ps;
	}
	
	public List<Person> fetchPersonsByPassportExpiryYear(int year) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();

		Query q = em.createQuery("select p from Person p join p.passport ps where year(ps.expiryDate) = :yr");
		//Query q = em.createQuery("select p from Passport ps join ps.person p where year(ps.expiryDate) = :yr");
		q.setParameter("yr", year);
		List<Person> list = q.getResultList();
		emf.close();

		return list;
	}
}