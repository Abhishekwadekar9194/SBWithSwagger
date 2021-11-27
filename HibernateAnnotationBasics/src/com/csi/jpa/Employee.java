package com.csi.jpa;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
//added changes by amit

@Entity
public class Employee {
	@Id
	@GeneratedValue
	private int empId;
	private String empName;
	private double empSalary;
	private Date empbirthdate;
	
	public Date getEmpbirthdate() {
		return empbirthdate;
	}
	public void setEmpbirthdate(Date empbirthdate) {
		this.empbirthdate = empbirthdate;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	@Override
	public String toString() {
		String dd;
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		 dd=sdf.format(empbirthdate);
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", empbirthdate="
				+ dd + "]";
	}
	
	

}
