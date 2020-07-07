package comm.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import comm.example.demo.dao.AccountDAO;

public class App 
{
	public static void main(String[] args) {

		// read spring config java class
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(DemoConfig.class);
		
		// get the bean from spring container
		AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);
		
		// call the business method
		theAccountDAO.addAccount();

		// do it again!
		System.out.println("\nlet's call it again!\n");
		
		// call the business method again
		theAccountDAO.addAccount();
				
		// close the context
		context.close();
	}

}
