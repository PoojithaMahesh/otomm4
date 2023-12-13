package onetomanym4.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetomanym4.dto.Company;
import onetomanym4.dto.Employee;

public class EmployeeDao {
	public EntityManager getEntityManager() {
		return Persistence.createEntityManagerFactory("vinod").createEntityManager();
	}
	
	public void saveEmployee(int companyId,Employee employee) {
		EntityManager entityManager=getEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Company dbCompany=entityManager.find(Company.class, companyId);
		if(dbCompany!=null) {
//			it is present means that company exist
			entityTransaction.begin();
			entityManager.persist(employee);
//			im taking the old employees details
			List<Employee> employees=dbCompany.getEmployees();
//			i just want to add new employee details
			employees.add(employee);
//			inside this list we are having new employee and old employees
			dbCompany.setEmployees(employees);
//			i have resaved it
			
			entityTransaction.commit();
		}else {
//			company doesnot exist
			System.out.println("Sorry company doesnot exist");
		}
	}
	
	
	public void findEMployee(int id) {
		EntityManager entityManager=getEntityManager();
		Employee dbEmployee=entityManager.find(Employee.class, id);
		if(dbEmployee!=null) {
//			id is present then employee is present
			System.out.println(dbEmployee);
		}else {
			System.out.println("Sorry that id is not present");
		}
	}
	
	public void deleteEmployee(int id) {
		EntityManager entityManager=getEntityManager();
		Employee dbEmployee=entityManager.find(Employee.class, id);
		if(dbEmployee!=null) {
//			id is present then employee is present
			EntityTransaction entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.remove(dbEmployee);
			entityTransaction.commit();
		}else {
			System.out.println("Sorry that id is not present");
		}
	}
	
	
	public void updateEmployee(int id,Employee  employee) {
		EntityManager entityManager=getEntityManager();
		Employee dbEmployee=entityManager.find(Employee.class, id);
		if(dbEmployee!=null) {
//			id is present then i can update the data
			EntityTransaction entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
		
			employee.setId(id);
			entityManager.merge(employee);
			entityTransaction.commit();
			
		}else {
//			id is not present
			System.out.println("Sorry id is not present");
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
