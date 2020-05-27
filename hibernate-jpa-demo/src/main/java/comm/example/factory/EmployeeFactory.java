package comm.example.factory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import comm.example.model.Employee;

public class EmployeeFactory {

	private EntityManagerFactory emFactory;
	private EntityManager entityManager;
	public EmployeeFactory() {
		
		SessionFactory factory=
				new Configuration().configure().addAnnotatedClass(Employee.class).buildSessionFactory();
		Session session=factory.openSession();
		emFactory=session.getEntityManagerFactory();
		entityManager=emFactory.createEntityManager();
	
	}
	
	
	public EntityManager getMyEntityManager()
	{
		return entityManager;
	}
	
	

}
