package onetomanym4.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetomanym4.dto.Company;
import onetomanym4.dto.Employee;

public class CompanyDao {

	public EntityManager getEntityManager() {
		return Persistence.createEntityManagerFactory("vinod").createEntityManager();
		
	}
	
	public void saveCompany(Company company) {
		EntityManager entityManager=getEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(company);
		entityTransaction.commit();
	}
	
	public void findCompany(int id) {
		EntityManager entityManager=getEntityManager();
		Company dbCompany=entityManager.find(Company.class, id);
		if(dbCompany!=null) {
//			id is present then employee is present
			System.out.println(dbCompany);
		}else {
			System.out.println("Sorry that id is not present");
		}
	}
	
	
	
	
	
	
	
}
