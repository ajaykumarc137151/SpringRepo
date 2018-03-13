package net.cr;

//no need of any component scan since all beans are configured in the java configuration file
public class HappyFortuneService implements FortuneService {

	public void getFortune() {
		 System.out.println("get fortune method in interface");

	}

}
