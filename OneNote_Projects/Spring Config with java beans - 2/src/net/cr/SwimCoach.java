package net.cr;

import org.springframework.beans.factory.annotation.Value;

//no need of any component scan since all beans are configured in the java configuration file
public class SwimCoach implements Coach {

	private FortuneService fortuneService;

	@Value("${team}")
	private String team;

	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public void workOut() {
		System.out.println("swim coach workout method");
		System.out.println("team = " + team);
		fortuneService.getFortune();
	}
}
