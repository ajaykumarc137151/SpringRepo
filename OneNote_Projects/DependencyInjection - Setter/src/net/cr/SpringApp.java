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

public class SpringApp {

	private static ClassPathXmlApplicationContext context;

	public static void main(String[] args) {
		
		// load the spring configuration file
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get beans from the container
		
		/**
		 * The cast is needed, since it returns the Generic object
		 */
		Coach theCoach = (Coach) context.getBean("myCoach");
		BaseballCoach bbCoach = context.getBean("baseballCoach", BaseballCoach.class);
		
		//call the method with the coach object
		System.out.println(theCoach.getWorkOut());
		
		/**
		 * This method will be called by Coach object, since the Coach interface has 
		 * getFortuneMethod() method. In that getFortuneMethod(), we will call the getFortune()
		 * with that HappyFortune object. This object is initialized by the Spring container 
		 * and is given to the class, i.e. configured in the XML file. Hence it is Dependency
		 * Injection. i.e. object is injected to constructor.
		 */
		
		//call the method with the coach object
		System.out.println(theCoach.getFortuneMethod());
		System.out.println(bbCoach.getName());
		
	}

}
