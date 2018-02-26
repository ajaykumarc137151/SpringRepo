package net.cr;

public class CricketCoach {

	private String name;
	private int age;

	/**
	 * Getter and setter methods for injecting the literal values
	 * 
	 * @return
	 */

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void startUpMethod(){
		System.out.println("this is startup method");
	}
	
	
	public void destroyMethod(){
		System.out.println("this is destroy method");
	}
	
	public void destroyMethodd(){
		System.out.println("this is destroy methoddddd");
	}

}
