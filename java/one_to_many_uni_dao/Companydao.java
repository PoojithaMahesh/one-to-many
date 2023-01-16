package one_to_many_uni_dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import one_to_many_uni_dto.Company;

public class Companydao {
public EntityManager getEntityManager() {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	return entityManager;
	
}
public void saveCompany(Company compnay) {
	EntityManager entityManager=getEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	entityTransaction.begin();
	entityManager.persist(compnay);
	entityTransaction.commit();
}
public void updateCompany(int id,Company company) {
	EntityManager entityManager=getEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	Company receivedCompany=entityManager.find(Company.class, id);
	if(receivedCompany!=null) {
		company.setId(id);
		company.setList(receivedCompany.getList());
		entityTransaction.begin();
		entityManager.merge(company);
		entityTransaction.commit();
	}else {
		System.out.println("company doesnot exists");
	}
	
	
}
public void deleteCompany(int id) {
	EntityManager entityManager=getEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	Company company=entityManager.find(Company.class, id);
	entityTransaction.begin();
	entityManager.remove(company);
	entityTransaction.commit();
	
}
public void getCompanyById(int id) {
	EntityManager entityManager=getEntityManager();
	Company company=entityManager.find(Company.class, id);
	System.out.println(company);
}
public void getAllCompany() {
	EntityManager entityManager=getEntityManager();
	Query query=entityManager.createQuery("select c from Company c");
	List<Company> list=query.getResultList();
	System.out.println(list);
	
}
}
