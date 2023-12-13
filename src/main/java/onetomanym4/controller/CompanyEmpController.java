package onetomanym4.controller;

import onetomanym4.dao.CompanyDao;
import onetomanym4.dao.EmployeeDao;
import onetomanym4.dto.Company;
import onetomanym4.dto.Employee;

public class CompanyEmpController {
public static void main(String[] args) {
//	Company company=new Company();
//	company.setId(1);
//	company.setName("TYSS");
//	company.setGst("tyss@123");
//	
//	CompanyDao companyDao=new CompanyDao();
//	companyDao.saveCompany(company);
	
	
//	Employee employee=new Employee();
//	employee.setId(4);
//	employee.setName("Naveen");
//	employee.setAddress("Tirupathi");
//	
//	EmployeeDao employeeDao=new EmployeeDao();
//	employeeDao.saveEmployee(1, employee);
	
//	delete
//	EmployeeDao employeeDao=new EmployeeDao();
//	employeeDao.deleteEmployee(2);
//	
	
//	CompanyDao companyDao=new CompanyDao();
//	companyDao.deleteCompany(1);
	
//	Update
	
//	Employee employee=new  Employee();
//	employee.setName("abcd");
//	employee.setAddress("xyz");
//	EmployeeDao employeeDao=new EmployeeDao();
//	employeeDao.updateEmployee(4, employee);
	
	
	Company company=new Company();
	company.setName("TESTYANTRA");
	company.setGst("cxcvbnk");
	
	CompanyDao companyDao=new CompanyDao();
	companyDao.updateCompany(1, company);
	
}
}
