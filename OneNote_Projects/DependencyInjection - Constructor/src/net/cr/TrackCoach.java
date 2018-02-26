package net.cr;

public class TrackCoach implements Coach {

	/**
	 * Here, we will create a new Instance of HappyFortune class, and assigns
	 * that instance variable to this class in the constructor. The spring
	 * container will initialize this instance variable from the configuration
	 * file.
	 */

	private HappyFortune happyFortune;

	/**
	 * This constructor is for MyApp.java class, where we need the no-arg
	 * constructor for creation of object.
	 */

	public TrackCoach() {

	}

	/**
	 * TrackCoach constructor in which HappyFortune class, instance variable
	 * is initialized.
	 */

	public TrackCoach(HappyFortune happyFortune) {
		super();
		this.happyFortune = happyFortune;
	}

	// method implemented for Coach interface

	@Override
	public String getWorkOut() {

		return "This is traack Coach class method";
	}

	// method implemented for Fortune interface

	@Override
	public String getFortuneMethod() {
		return happyFortune.getFortune();
	}

}
