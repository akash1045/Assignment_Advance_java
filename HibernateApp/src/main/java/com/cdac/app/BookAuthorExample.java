package com.cdac.app;


import java.util.ArrayList;
import java.util.List;

import com.cdac.dao.BookAuthorDao;
import com.cdac.dao.GenericDao;
import com.cdac.entity.Author;
import com.cdac.entity.Book;

public class BookAuthorExample {
   public static void main(String args[]) {
	   //GenericDao dao=new GenericDao();
	/* Book book=new Book();
	   book.setName("let us java");
	   book.setCost(2000);
	   Author author1=new Author();
	   author1.setName("Andrey Adamovich");
	   author1.setEmail("andrey@gmail.com");
	   Author author2=new Author();
	   author2.setName("Luciano Flandesio");
	   author2.setEmail("luciano@gmail.com");
	   Author author3=new Author();
	   author3.setName("Ajinkya hinchkar");
	   author3.setEmail("Ajinkya@gmail.com");
	   
	   List<Author> list=new ArrayList<Author>();
	   list.add(author1);
	   list.add(author2);
	   list.add(author3);
	   book.setAuthors(list);
		
		dao.save(book);*/
	  
	  /* Author author = new Author();
		author.setName("Elisabeth Robson");
		author.setEmail("elisa@gmail.com");
		dao.save(author);*/
		
		//adding a book along with the author details
		/*Book book = new Book();
		book.setName("JVM");
		book.setCost(3500);
		
		List<Author> authors = new ArrayList<Author>();
		//authors.add((Author) dao.fetchById(Author.class, 1));
		authors.add((Author) dao.fetchById(Author.class, 2));
		
		book.setAuthors(authors);
		
		dao.save(book);*/
	   
	  /* BookAuthorDao dao=new BookAuthorDao();
	   List<Author> authors = dao.fetchById(2);
	   for(Author list :authors)
			System.out.println(list.getName()+" "+list.getEmail());*/
	   
	  /* BookAuthorDao dao=new BookAuthorDao();
	   Book book=dao.fetchBookName(1);
	   book.setName("Oracle");
	   dao.update(book);*/
	   
	   BookAuthorDao dao=new BookAuthorDao();
	   Author author=dao.fetchbyemail(1);
	   author.setEmail("ajayyadav@gmail.com");
	   dao.updateemail(author);
	   
	  
	
		
		
		
	   
	   
	   
	   
	   
   }
}
