package com.cdac.app;

import java.time.LocalDate;
import java.util.List;

import com.cdac.dao.PersonPassportDao;
import com.cdac.entity.Passport;
import com.cdac.entity.Person;



public class PersonPassportExample {
	public static void main(String args[]) {
		PersonPassportDao dao = new PersonPassportDao();
		Person p=new Person();
		p.setName("Akshay");
		p.setEmail("Akshay@gmail.com");
		p.setDateOfBirth(LocalDate.of(1998, 2, 05));
		
		Passport ps=new Passport();
		ps.setIssueDate(LocalDate.of(2020, 3, 30));
		ps.setExpiryDate(LocalDate.of(2030, 4, 21));
		ps.setIssuedBy("Govt Of India");
		
		p.setPassport(ps);
		ps.setPerson(p);
		
		dao.add(p);
		
		
		/*Person p = dao.fetchPersonByPassportNo(3);
		System.out.println(p.getName() + " " + p.getEmail());*/
		
		//Passport pss = dao. fetchPassportByName("Akash");
		//System.out.println(pss.getPassportNO() + " " + pss.getIssuedBy()+" "+pss.getExpiryDate());
		
		
		/*List<Person> list = dao.fetchPersonsByPassportExpiryYear(2030);
		for(Person p : list)
			System.out.println(p.getName() + " " + p.getEmail());*/
		
		/*List<Person> list = dao.fetchPersonByissueDate(11);
		for(Person p : list)
		System.out.println(p.getName()+" "+p.getEmail());*/
	}
}