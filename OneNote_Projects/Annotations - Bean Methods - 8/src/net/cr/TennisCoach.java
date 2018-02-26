package net.cr;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
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
 * @Scope prototype will create a new object for each container request.
 *
 */

@Component
@Scope("prototype")
public class TennisCoach implements Coach {

	/**
	 * This will automatically inject the FortuneService object into this coach
	 * object and gives us. Hence it is autowired. The container will
	 * automatically create the object and set the values for this variable
	 * 
	 * This default constructor is just for simply to understand what is
	 * happening at the behind the scenes
	 * 
	 */

	private FortuneService fortuneService;

	public TennisCoach() {
		System.out.println("This is tennis default constructor");
	}

	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Fortune method is called");
		this.fortuneService = fortuneService;
	}

	/**
	 * there are the bean life cycle methods that are called at the time of
	 * initialization and destroy of objects. These can be configured in the XML
	 * file or with annotations.
	 */

	@PostConstruct
	public void startUp() {
		System.out.println("Init method");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("destroy method");
	}

	public void workOut() {
		System.out.println("This is TennisCoach workout method");
		fortuneService.getFortune();

	}

}
