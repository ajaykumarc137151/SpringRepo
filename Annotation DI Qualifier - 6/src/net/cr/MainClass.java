package net.cr;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	private static ClassPathXmlApplicationContext context;

	public static void main(String[] args) {

		/**
		 * Here nothing will change whether we have defined beans or not. the
		 * default bean id is only seen here. no where in other code.
		 */

		context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// get the bean from the container
		Coach theCoach = (Coach) context.getBean("tennisCoach");
		
		Coach theCoach1 = (Coach) context.getBean("tennisCoach");

		//print the object memory
		System.out.println(theCoach);
		
		//print the object memory
		System.out.println(theCoach1);

		// Close the context.
		context.close();

	}

}
