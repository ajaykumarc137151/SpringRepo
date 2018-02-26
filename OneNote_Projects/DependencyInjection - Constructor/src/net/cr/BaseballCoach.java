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
	 * BaseballCoach constructor in which HappyFortune class, instance
	 * variable is initialized.
	 */
	public BaseballCoach(HappyFortune happyFortune) {
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
