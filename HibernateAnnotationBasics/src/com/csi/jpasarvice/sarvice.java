package com.csi.jpasarvice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class sarvice {
	private static SessionFactory factory= new AnnotationConfiguration().configure().buildSessionFactory();
public static void main(String[] args) {
	save();
}
static void save (){
	Session session=factory.openSession();
	Transaction transaction=session.beginTransaction();
	department departments=new department();
	departments.setDeptId(101);
	departments.setDeptName("computer");
	departments.setDeptSalary(587978.32);
	session.save(departments);
	transaction.commit();
	
}
void get (){
	
	
}
void update (){
	
}
}
