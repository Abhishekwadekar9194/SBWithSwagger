package com.csi.jpa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Sarvice {
	private static SessionFactory factory=new AnnotationConfiguration().configure().buildSessionFactory();
	public static void main(String[] args) {
		savedata();
		//updatedata();
		getdata();
		//deletedata();

	}
	static void savedata()
	{
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		Employee employee=new Employee();
		employee.setEmpName("csi");
		employee.setEmpSalary(25487.32);
		Date empbirthdate=null;
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
        
      
        try {
        	empbirthdate=sdf.parse("15/12/2145");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		employee.setEmpbirthdate(empbirthdate);
		session.save(employee);
		transaction.commit();
	}
	static void updatedata(){
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		List<Employee> emplist=session.createQuery("from Employee").list();
		for (Employee employee : emplist) {
			if (employee.getEmpId()==1){
				employee.setEmpName("niru");
				employee.setEmpSalary(58794.23);
				session.update(employee);
				transaction.commit();
			}
		}

	}
	static void deletedata(){
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		List<Employee> emplist=session.createQuery("from Employee").list();
		//emplist.forEach(System.out::println);
		for (Employee employee : emplist) {
			if(employee.getEmpId()==1){
				session.delete(employee);
				transaction.commit();
			}
		}


	}
	static void getdata(){
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		List<Employee> emplist=session.createQuery("from Employee").list();
		emplist.forEach(System.out::println);
	}
}
