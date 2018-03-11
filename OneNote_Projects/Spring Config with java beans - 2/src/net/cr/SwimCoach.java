package net.cr;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;

	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public void workOut() {
		System.out.println("swim coach workout method");
		fortuneService.getFortune();
	}
}
