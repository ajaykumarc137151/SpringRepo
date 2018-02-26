package net.cr;

import org.springframework.beans.factory.annotation.Autowired;
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

	private FortuneService fortuneService;

	/**
	 * This will automatically inject the FortuneService object into this coach
	 * object and gives us. Hence it is autowired.
	 * 
	 * @param fortuneService
	 */
	
	@Autowired
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public void workOut() {

		System.out.println("This is TennisCoach workout method");
		fortuneService.getFortune();

	}

	

}
