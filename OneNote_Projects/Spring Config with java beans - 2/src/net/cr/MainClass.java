package net.cr;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		/**
		 * Here nothing will change whether we have defined beans or not. the
		 * default bean id is only seen here. no where in other code. the two
		 * objects will have different memory locations.
		 * 
		 * The constructor is called whenever there is a new request from the
		 * container for the object creation
		 * 
		 * previously we have used ClassPathXMLApplicationContext class for
		 * reading the spring configuration file from XML. Now it is
		 * AnnotationConfigApplicationContext class we need to use to read the
		 * spring configuration from the java class
		 */

		// read the spring configuration file
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(JavaConfig.class);

		// get the bean from the container
		Coach theCoach = (Coach) context.getBean("swimCoach");


		// print the object memory
		System.out.println(theCoach);
		theCoach.workOut();

		// Close the context.
		context.close();

	}

}
