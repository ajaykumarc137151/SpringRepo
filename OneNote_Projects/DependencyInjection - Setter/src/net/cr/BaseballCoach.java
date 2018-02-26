package net.cr;

public class BaseballCoach implements Coach {

	/**
	 * Here, we will create a new Instance of HappyFortune class, and assigns
	 * that instance variable to this class in the constructor. The spring
	 * container will initialize this instance variable from the configuration
	 * file.
	 */

	private HappyFortune happyFortune;

	/**
	 * The getter and setter methods for the dependency injection
	 * For dependency injection, only the Setter method is required.
	 * 
	 * @return HappyFortune object 
	 */
	
	public HappyFortune getHappyFortune() {
		return happyFortune;
	}

	public void setHappyFortune(HappyFortune happyFortune) {
		this.happyFortune = happyFortune;
	}

	// method implemented for Coach interface
	public String getWorkOut() {
		return "This is baseball class method";
	}

	// method implemented for Fortune interface
	public String getFortuneMethod() {
		return happyFortune.getFortune();
	}

}
