package one_to_many_uni_control;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import one_to_many_uni_dao.Companydao;
import one_to_many_uni_dto.Company;
import one_to_many_uni_dto.Employee;

public class CompanyMain {
public static void main(String[] args) {
	Employee e1=new Employee();
	e1.setAddress("blr");
	e1.setName("pooji");
	e1.setPhone(00000000);
	Employee e2=new Employee();
	e2.setAddress("mumbai");
	e2.setName("kavya");
	e2.setPhone(111111);
	Employee e3=new Employee();
	e3.setAddress("mangalore");
	e3.setName("sharath");
	e3.setPhone(9999999);
	List<Employee> list=new ArrayList<Employee>();
	list.add(e1);
	list.add(e2);
	list.add(e3);
	Company company=new Company();
	
//	company.setGst("xyz123");
	company.setList(list);
//	company.setName("test yantra");
	
	company.setGst("uuuyu");
	company.setName("test yantra");
	Companydao companydao=new Companydao();
	companydao.updateCompany(1, company);
	
//	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
//	EntityManager entityManager=entityManagerFactory.createEntityManager();
//	EntityTransaction entityTransaction=entityManager.getTransaction();
//	entityTransaction.begin();
//	entityManager.merge(company);
////	entityManager.persist(e1);
////	entityManager.persist(e2);
////	entityManager.persist(e3);
//	entityTransaction.commit();
//	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
