/**
 * Useful files for the project are :
 * 
 * Fortune.java	- interface 
 * FortuneService.java - implements the Fortune.java interface
 * BaseballCoach.java - FortuneServie object is initialized with DI
 * TrackCoach.java - FortuneServie object is initialized with DI
 * SpringApp.java - Main method for execution, get beans, call methods
 * applicationContext.xml - Configuration file for spring container.
 * 
 *  
 * previous app files:
 * MyApp.java, Coach.java
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
		
		
		
		context.close();
		
	}

}
