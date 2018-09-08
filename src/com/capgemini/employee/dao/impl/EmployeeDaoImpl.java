package com.capgemini.employee.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.employeeapp.dao.EmployeeDao;
import com.capgemini.employeeapp.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	private List<Employee> employees=new ArrayList<>();
	@Override
	public List<Employee> findAllEmployees() {
		// TODO Auto-generated method stub
		
		return employees;
	}

	@Override
	public Employee findEmployeeById(int employeeId) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public boolean addEmployee(Employee employee) {
		
		// TODO Auto-generated method stub
		return employees.add(employee);
	}

	
	
	@Override
	public Employee updateEmployee(Employee employeeId) {
		
		for(Employee employee : employees)
		{
			if(employee.getEmployeeId()== employeeId.getEmployeeId())
			{
				employee.setEmployeeDepartment(employeeId.getEmployeeDepartment()); 
				employee.setEmployeeName(employeeId.getEmployeeName());
				employee.setEmployeeSalary(employeeId.getEmployeeSalary());
				return employee ;
			}
		}
		return null; 
		
	}
		
	@Override
	public boolean deleteEmployee(int employeeId) {
		for (Employee employee : employees) {
			if(employee.getEmployeeId()==employeeId)
			{
				employees.remove(employee);
				return true;
			}
			
		}
		
		return false;
	}


}
