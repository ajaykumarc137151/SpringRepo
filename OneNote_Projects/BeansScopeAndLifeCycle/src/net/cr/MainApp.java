/**
 * Useful files for the project are :
 *
 * This Project is about the Bean scope and its life cycle
 */

package net.cr;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	private static ClassPathXmlApplicationContext context;

	public static void main(String[] args) {
		
		// load the spring configuration file
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		// get beans from the container
		
		/**
		 * The cast is needed, since it returns the Generic object
		 * 
		 * 
		 * here the myCoach's object refers to the bean that has default scope
		 * Hence the two references will point to the same memory locations.
		 */
		CricketCoach theCoach = (CricketCoach) context.getBean("myCoach");
		
		CricketCoach theCoach1 = (CricketCoach) context.getBean("myCoach");
		
		//print the CricketCoach object
		System.out.println(theCoach);
		
		//print the CricketCoach object
		System.out.println(theCoach1);
		
		
		/**
		 * The cast is needed, since it returns the Generic object
		 * 
		 * 
		 * here the coach's object refers to the bean that has scope="singleton"
		 * Hence the two references will point to the same memory locations.
		 */
		 
		CricketCoach Coach = (CricketCoach) context.getBean("Coach");
		
		CricketCoach Coach1 = (CricketCoach) context.getBean("Coach");
		
		//print the CricketCoach object
		System.out.println(Coach);
		
		//print the CricketCoach object
		System.out.println(Coach1);
		
		/**
		 * here the multicoach object refers to the bean that has scope="prototype"
		 * Hence the two references will point to  different memory locations.
		 */
		
		CricketCoach multiCoach = (CricketCoach) context.getBean("multiCoach");
		
		CricketCoach multiCoach1 = (CricketCoach) context.getBean("multiCoach");
		
		//print the CricketCoach object
		System.out.println(multiCoach);
		
		//print the CricketCoach object
		System.out.println(multiCoach1);
		
	}

}
