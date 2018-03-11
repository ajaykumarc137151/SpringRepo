package net.cr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @component is added to the class, so that for this class, bean is
 *            automatically registered by the spring container. first it looks
 *            at the XML file. if it founds the scan configuration, and the
 *            corresponding package, then it scan all the files inside that
 *            package for the "component" and register the beans with default
 *            id, which will be the class name with the first letter with lower
 *            case. here it is "tennisCoach" bean id.
 * 
 * 
 * @author chku0616
 *
 */

@Component
public class TennisCoach implements Coach {

	/**
	 * This will automatically inject the FortuneService object into this coach
	 * object and gives us. Hence it is autowired. The container will
	 * automatically create the object and set the values for this variable
	 * 
	 * This default constructor is just for simply to understand what is
	 * happening at the behind the scenes
	 */
	@Autowired
	private FortuneService fortuneService;

	// values can be injected using the properties file.
	@Value("${name}")
	private String name;

	@Value("${foo.id}")
	private Integer id;

	public TennisCoach() {
		System.out.println("This is tennis default constructor");
	}

	public void workOut() {

		System.out.println("This is TennisCoach workout method");
		fortuneService.getFortune();
		System.out.println("name = " + name);
		System.out.println("id = " + id);
	}

}
