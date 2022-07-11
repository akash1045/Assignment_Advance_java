package com.cdac.app;

import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cdac.dao.EmployeeDao;
import com.cdac.entity.Employee;

public class insertEmployee {
	public static void main(String[] args) {
		//During this step, the persistence.xml file will be read
		/*EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();*/
		
		//Employee emp = new Employee();
		//emp.setEmpno(1003);
		//emp.setName("Ajay");
		//emp.setSalary(20000);
		//emp.setDateOfJoining(LocalDate.of(2015, 10, 10));
		//em.persist(emp); //persist method will generate insert query
		//EmployeeDao dao = new EmployeeDao();
		//dao.add(emp);
		//tx.commit();
		
		//emf.close();
		
		//EmployeeDao dao = new EmployeeDao();
		//Employee emp = dao.fetch(1002);
		//System.out.println(emp.getName() + " " + emp.getSalary());
		
		

		/*EmployeeDao dao = new EmployeeDao();
		List<Employee> list = dao.fetchAll();
		for(Employee emp : list)
			System.out.println(emp.getEmpno() + " " + emp.getName() + " " + emp.getSalary() + " " + emp.getDateOfJoining());
		
	}*/
		/*EmployeeDao dao = new EmployeeDao();
		List<Employee> list2 = dao.fetchAllBySalary(10000);
		for(Employee emp : list2) 
			System.out.println(emp.getEmpno() + " " + emp.getName() + " " + emp.getSalary() + " " + emp.getDateOfJoining());
		
	}*/
		/*EmployeeDao dao = new EmployeeDao();
		List<String> names = dao.fetchAllNames();
		for(String name : names)
			System.out.println(name);
		List<Object[]> namesAndSalaries = dao.fetchAllNamesAndSalaries();
		for(Object[] arr : namesAndSalaries)
			System.out.println(arr[0] + " " + arr[1]);
		
}*/
	

		

		
}
}
