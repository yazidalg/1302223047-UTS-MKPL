package lib;

import java.time.LocalDate;
import java.time.Month;
import java.util.LinkedList;
import java.util.List;

public class Employee {
	private final EmployeeDetail employeeDetail;
	private final EmployeeSalary employeeSalary;
	private final EmployeeFamily employeeFamily;
	
	public Employee(EmployeeDetail employeeDetail, EmployeeSalary employeeSalary, EmployeeFamily employeeFamily) {
		this.employeeDetail = employeeDetail;
		this.employeeSalary = employeeSalary;
		this.employeeFamily = new EmployeeFamily();
	}
	
	public void setSpouse(String spouseName, String spouseIdNumber) {
		this.employeeFamily.setSpouse(spouseName, spouseIdNumber);
	}

	public void addChild(String childName, String childIdNumber) {
		this.employeeFamily.addChild(childName, childIdNumber);
	}

	public EmployeeSalary getEmployeeSalaryInfo() {
		return employeeSalary;
	}
}
