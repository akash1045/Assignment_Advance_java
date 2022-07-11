package com.cdac.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.cdac.entity.Author;
import com.cdac.entity.Book;
import com.cdac.entity.Customer;
import com.cdac.entity.Person;

public class BookAuthorDao {

	public List<Author> fetchById(int id){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("select a from Author a join a.books bs where bs.id = :ide");
		q.setParameter("ide", id);
		List<Author> list  = (List<Author>) q.getResultList();
		emf.close();

		return list;
		
	}
	
	public void update(Book book) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.merge(book);
		tx.commit();
		emf.close();
	}
	
	public void updateemail(Author author) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.merge(author);
		tx.commit();
		emf.close();
	}
	
	public Author fetchbyemail(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		Author author=em.find(Author.class, id);
		emf.close();
		return author;
	}
	

	  public Book fetchBookName(int id) {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
			EntityManager em = emf.createEntityManager();

			//find method generates select query where pk = ?
			Book book = em.find(Book.class, id);
			
			emf.close();

			return book;	
		}
	
}
