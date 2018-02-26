package net.cr;

import org.springframework.stereotype.Component;

/**
 * @component is added to the class, so that for this class, bean is
 *            automatically registered by the spring container. first it looks
 *            at the XML file. if it founds the scan configuration, and the
 *            corresponding package, then it scan all the files inside that
 *            package for the "component" and register the beans with parameter
 *            passed in the component. Here it is "Tennis". It will register the
 *            bean with that name.
 * 
 * @author chku0616
 *
 */
@Component("Tennis")
public class TennisCoach implements Coach {

	public void workOut() {

		System.out.println("This is TennisCoach workout method");

	}

}
