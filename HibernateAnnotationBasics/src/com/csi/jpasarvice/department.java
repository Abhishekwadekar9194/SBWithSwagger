package com.csi.jpasarvice;

public class department {
private int deptId;
private String deptName;
private double deptSalary;
public int getDeptId() {
	return deptId;
}
public void setDeptId(int deptId) {
	this.deptId = deptId;
}
public String getDeptName() {
	return deptName;
}
public void setDeptName(String deptName) {
	this.deptName = deptName;
}
public double getDeptSalary() {
	return deptSalary;
}
public void setDeptSalary(double deptSalary) {
	this.deptSalary = deptSalary;
}
@Override
public String toString() {
	return "department [deptId=" + deptId + ", deptName=" + deptName + ", deptSalary=" + deptSalary + "]";
}

}
