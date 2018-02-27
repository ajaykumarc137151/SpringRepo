package net.cr;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	private static ClassPathXmlApplicationContext context;

	public static void main(String[] args) {
		
		/**
		 * Here nothing will change whether we have defined beans or not.
		 */

		context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// get the bean from the container
		TennisCoach theCoach = (TennisCoach) context.getBean("tennis");

		// get the method from the bean
		theCoach.workOut();

		Fruits fruit = context.getBean("fruits", Fruits.class);

		System.out.println(fruit.getName());
		
		//Close the context.
		context.close();

	}

}
